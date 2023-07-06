package com.shop.ecommerceWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shop.ecommerceWeb.helper.ViewRouteHelper;

@Controller
@RequestMapping("/item")
public class ItemController {
	
	@GetMapping("/alta")
	public ModelAndView alta() {
		ModelAndView mv=new ModelAndView(ViewRouteHelper.ALTA);
		return mv;
	}
}
