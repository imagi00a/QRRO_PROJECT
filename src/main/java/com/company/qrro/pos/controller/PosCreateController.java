package com.company.qrro.pos.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.qrro.pos.service.PosCreateService;


@Controller
public class PosCreateController {
	
	@Autowired
	PosCreateService posCreateService;
	
	@RequestMapping(value="/pos/create", method=RequestMethod.POST)
	public String create(
			@RequestParam Map map
			) throws Exception {
		
		posCreateService.create(map);
		
		return "redirect:/";
		
	}
	
	
	
}