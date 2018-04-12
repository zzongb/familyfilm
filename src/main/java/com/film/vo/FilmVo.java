package com.film.vo;

import com.film.entity.Film;

/**   
*    
* 项目名称：filmSystem   
* 类名称：FilmVo   
* 类描述：查询条件包装类
*      
*/
public class FilmVo {
	
	private Film film;

	/**
	 * @return the film
	 */
	public Film getFilm() {
		return film;
	}

	/**
	 * @param film the film to set
	 */
	public void setFilm(Film film) {
		this.film = film;
	}
	
}
