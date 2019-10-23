package com.xj.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xj.pojo.User;
import com.xj.service.UserService;

@Controller
public class ReturnPageController {
	@Autowired
	private UserService userSerivceImpl;
	/**
	 *  跳转html页面
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}")
	public String ReturnPage(@PathVariable String page) {
		return page;
	}
	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	@RequestMapping("login")
	public String loginUser(User user,HttpServletRequest req) {
		User u = userSerivceImpl.loginUser(user);
		req.getSession().setAttribute("user", u);
		return "index";
	}
}
