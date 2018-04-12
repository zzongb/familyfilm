package com.film.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.film.entity.Film;
import com.film.service.FilmService;
import com.film.vo.FilmVo;

/**   
*    
* 项目名称：filmSystem   
* 类名称：FilmController   
* 类描述：影片控制器 
*      
*/
@Controller
@RequestMapping("/back")
public class FilmController {
	@Autowired
	private FilmService filmService;
	
	//影片列表
	@RequestMapping("filmList")
	public String filmList(Model model,FilmVo filmVo) throws Exception {
		List<Film> filmList = filmService.findFilmListByCondition(filmVo);
		model.addAttribute("filmList", filmList);
		return "filmList";
	}
	
	//删除影片
	@RequestMapping("/filmDel")
	@ResponseBody
	public String filmDel(String ids) throws Exception {
		String[] filmIds = ids.split(",");
		filmService.delele(filmIds);
		return "success";
	}
	
	//请求表单页面
	@RequestMapping("/form")
	public String form(Model model,Film film) throws Exception {
		if(film.getId() != null) {
			//查询记录
			model.addAttribute("film", filmService.queryFilmById(film.getId()));
		}
		return "filmForm";
	}
	
	//保存
	@RequestMapping("/save")
	@ResponseBody
	public String save(Film film) throws Exception {
		return filmService.saveFilm(film);
	}
	
}
