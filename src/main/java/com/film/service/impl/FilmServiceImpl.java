package com.film.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.film.entity.Film;
import com.film.mapper.FilmMapper;
import com.film.service.FilmService;
import com.film.vo.FilmVo;

/**   
*    
* 项目名称：filmSystem   
* 类名称：FilmServiceImpl   
* 类描述：
*      
*/
@Service
public class FilmServiceImpl implements FilmService {
	@Autowired
	private FilmMapper filmMapper;
	
	@Override
	public List<Film> findFilmListByCondition(FilmVo filmVo) {
		return filmMapper.queryFilmListByCondition(filmVo);
	}

	@Override
	public void delele(String[] ids) {
		int[] filmIds = new int[ids.length];
		for (int i = 0; i < ids.length; i++) {
			filmIds[i] = Integer.parseInt(ids[i]);
		}
		filmMapper.batchDeleteFilms(filmIds);
	}

	@Override
	public String saveFilm(Film film) {
		if(film.getId() != null) { //更新记录
			filmMapper.update(film);
		}else { //新增记录
			filmMapper.save(film);
		}
		return "success";
	}

	@Override
	public Film queryFilmById(Integer id) {
		return filmMapper.selectFilmByPrimaryKey(id);
	}

}
