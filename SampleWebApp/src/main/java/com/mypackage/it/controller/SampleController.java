package com.mypackage.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mypackage.it.service.SampleService;

import model.User;

@Controller
public class SampleController {

	@Autowired
	private SampleService sampleService;
	
	@RequestMapping("/test1")
	public ModelAndView testMethod1(ModelAndView modelAndView) {
		User user = sampleService.getUser();
		modelAndView.addObject("UserObject", user);
		modelAndView.setViewName("sample");
		return modelAndView;
	}
	
	@PostMapping("/test2")
	public ModelAndView testMethod2(@RequestBody User user) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("UserObject", user);
		modelAndView.setViewName("sample");
		return modelAndView;
	}
}

