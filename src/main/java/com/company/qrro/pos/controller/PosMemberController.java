package com.company.qrro.pos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class PosMemberController {
	
	@RequestMapping(value = "/qrro/pos/posMain", method = RequestMethod.GET)
	public String posMain() {
		return "/qrro/pos/posMain";
	}
	@RequestMapping(value = "/qrro/pos/createAd", method = RequestMethod.GET)
	public String createAd() {
		return "/qrro/pos/createAd";
	}
	
	
	
}