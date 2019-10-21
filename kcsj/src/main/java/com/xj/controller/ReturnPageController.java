package com.xj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReturnPageController {
	/**
	 *  跳转html页面
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}")
	public String ReturnPage(@PathVariable String page) {
		return page;
	}
}
