package com.company.qrro.pos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class PosController {
	
	
	@RequestMapping(value = "/qrro/pos/posLogin", method = RequestMethod.GET)
	public String posLogin() {
		return "/qrro/pos/posLogin";
	}
	
	@RequestMapping(value = "/qrro/pos/posMain", method = RequestMethod.GET)
	public String posMain() {
		return "/qrro/pos/posMain";
	}
	
	@RequestMapping(value = "/qrro/pos/posCreate", method = RequestMethod.GET)
	public String posCreate() {
		return "/qrro/pos/posCreate";
	}
}

