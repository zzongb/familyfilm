package com.film.mapper;

import java.util.List;

import com.film.entity.Film;
import com.film.vo.FilmVo;

/**   
*    
* 项目名称：filmSystem   
* 类名称：FilmMapper   
* 类描述：影片接口
*      
*/
public interface FilmMapper {
	public void save(Film film);
	
	public List<Film> queryFilmListByCondition(FilmVo filmVo);
	
	/**
	 * 批量删除
	 */
	public void batchDeleteFilms(int[] ids);
	
	/**
	 * 更新影片信息
	 */
	public void update(Film film);
	
	/**
	 * 根据id查询记录
	 */
	public Film selectFilmByPrimaryKey(Integer id);
}
