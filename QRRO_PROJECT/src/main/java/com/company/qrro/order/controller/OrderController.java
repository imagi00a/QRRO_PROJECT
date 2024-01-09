package com.company.qrro.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

	@Controller
	public class OrderController {
		
		
		@RequestMapping(value = "/qrro/order/orderLogin", method = RequestMethod.GET)
		public String orderLogin() {
			return "/qrro/order/orderLogin";
		}
		
	
}
