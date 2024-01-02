package com.company.qrro.pos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class QrroPosController {
	
	
	@RequestMapping(value = "/qrro/pos/posLogin", method = RequestMethod.GET)
	public String posLogin() {
		return "/qrro/pos/posLogin";
	}

}
