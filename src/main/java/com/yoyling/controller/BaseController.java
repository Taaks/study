package com.yoyling.controller;


import com.yoyling.service.CategoryService;
import com.yoyling.service.ContentService;
import com.yoyling.service.OptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 基础控制器，用来继承。
 * 1、自动注入所有所需服务层接口
 * 2、设置request、response、session对象
 */
@Controller
public class BaseController {

	protected HttpServletRequest request;

	protected HttpServletResponse response;

	protected HttpSession session;

	@Autowired
	protected ContentService contentService;

	@Autowired
	protected OptionsService optionsService;

	@Autowired
	protected CategoryService categoryService;

	@ModelAttribute
	public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
		this.session = request.getSession(true);
	}
}
