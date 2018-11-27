package com.cg.ChangePassword.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.ChangePassword.dto.ChangePasswordDto;
import com.cg.ChangePassword.exception.PasswordException;
import com.cg.ChangePassword.service.PasswordService;

@Controller
public class controller {

	@Autowired
	PasswordService service;
	
	@RequestMapping(value = "test")
	public String redirect(@ModelAttribute("my") ChangePasswordDto dto) {
		return "changePassword";
	}
	
	@RequestMapping(value = "password")
	public ModelAndView changePassword(@ModelAttribute("my") ChangePasswordDto dto) {
		String res = null;
		String[] passwords = dto.getPassword().split(",");
		if(passwords[1].equals(passwords[2])) {
			try {
//				System.out.println(dto.getUserName());
				service.changePassword(dto.getUserName(), passwords[1], passwords[0]);
				res = "Password has been changed successfully";
			} catch (PasswordException e) {
				// TODO Auto-generated catch block
				res = e.getMessage();
			}
		}
		return new ModelAndView("success", "result", res);
	}
	
}
