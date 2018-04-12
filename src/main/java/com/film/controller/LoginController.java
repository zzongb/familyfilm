package com.film.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.film.entity.User;
import com.film.service.UserService;

/**   
*    
* 项目名称：filmSystem   
* 类名称：LoginController   
* 类描述：用户登录controller
*      
*/
@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String login() throws Exception {
		return "login";
	}
	
	@RequestMapping("/loginHandler")
	@ResponseBody
	public String loginHandler(User user) throws Exception {
		
		return userService.checkUser(user.getUsername(), user.getPassword());
		
	}
	
}
