package com.company.qrro.order.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.qrro.order.service.orderService;

@Controller
public class OrderController {

	@Autowired
	orderService orderservice;

	@RequestMapping(value = "/qrro/order/orderLogin", method = RequestMethod.GET)
	public String orderLogin(Model model, @RequestParam Map map) {

		int result = orderservice.login(map);

		if (result == 0) {
			System.out.println("로그인 실패");

			model.addAttribute("logingMSG", map.get("loginerror"));

		} else if (result == 1) {
			System.out.println("로그인 성공");

			model.addAttribute("logingMSG", map.get("loginSeceess"));
		}

		return "/qrro/order/orderLogin";
	}
}
