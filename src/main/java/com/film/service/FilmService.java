package com.film.service;

import java.util.List;

import com.film.entity.Film;
import com.film.vo.FilmVo;

/**   
*    
* 项目名称：filmSystem   
* 类名称：FilmService   
* 类描述：影片列表
*      
*/
public interface FilmService {
	/**
	 * 根据条件查询列表
	 * @return
	 */
	public List<Film> findFilmListByCondition(FilmVo filmVo);
	
	/**
	 * 删除影片
	 */
	public void delele(String[] ids);
	
	/**
	 * 保存影片
	 */
	public String saveFilm(Film film);
	
	/**
	 * 根据id查询记录
	 */
	public Film queryFilmById(Integer id);
}
