package com.cg.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.sp.dto.Category;
import com.cg.sp.service.spService;

@Controller
public class controller {
	
	@Autowired
	spService service;
	
	@RequestMapping(value = "start", method = RequestMethod.GET)
	public ModelAndView getAll() {
		List<Category> list = service.getAll();
		for(Category c : list)
			System.out.println(c);
		return new ModelAndView("Data", "data", list);
	}

}
