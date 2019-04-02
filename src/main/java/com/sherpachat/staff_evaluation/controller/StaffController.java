package com.sherpachat.staff_evaluation.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StaffController {
	
	
	
	@RequestMapping(value="/staffhome", method = RequestMethod.GET)
	public String getTutorialForm(HttpSession session){
		
		if (StringUtils.isEmpty(session.getAttribute("activeuser"))) {

			return "login";
		}
		
		return "staffHome";
	}

}




	
