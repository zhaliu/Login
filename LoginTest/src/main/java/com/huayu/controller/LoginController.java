package com.huayu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.huayu.model.Users;
import com.huayu.service.UsersService;

@Controller
public class LoginController extends GenericController {

	@Resource
	private UsersService usersService;

	public UsersService getUsersService() {
		return usersService;
	}

	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	@RequestMapping("/goLogin")
	public ModelAndView goLogin() {
		return new ModelAndView("login");
	}

	@RequestMapping("/login")
	public ModelAndView login(String username, String password) throws Exception {
		Users currentUser = this.usersService.findBy(username, password);
		if (currentUser == null) {
			return new ModelAndView("login", "error", "用户名或密码错误");
		} else {
			this.session.setAttribute("currentUser", currentUser);
			return new ModelAndView("index");

		}
	}

}
