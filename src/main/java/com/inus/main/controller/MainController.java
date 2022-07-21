package com.inus.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {
	@RequestMapping({("/"),("/index"),("/inus")})
	public ModelAndView mainIndex() throws Exception {
		ModelAndView mav = new ModelAndView();
		
		List<String> index = new ArrayList<>();
		
		mav.addObject("index", index);
		mav.setViewName("/index");
		return mav;
		
		
	}
}
