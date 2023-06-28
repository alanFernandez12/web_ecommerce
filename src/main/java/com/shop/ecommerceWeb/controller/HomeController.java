package com.shop.ecommerceWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shop.ecommerceWeb.helper.ViewRouteHelper;

@Controller
@RequestMapping(" ")
public class HomeController {
	
	@GetMapping(" ")
	public ModelAndView index() {
		ModelAndView mv=new ModelAndView(ViewRouteHelper.INDEX);
		return mv;
	}
}
