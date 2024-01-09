package com.company.qrro.pos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class PosController {
	
	//포스 로그인화면 폼
	@RequestMapping(value = "/qrro/pos/posLogin", method = RequestMethod.GET)
	public String posLogin() {
		return "/qrro/pos/posLogin";
	}
	
	//포스 메인화면 폼
	@RequestMapping(value = "/qrro/pos/posMain", method = RequestMethod.GET)
	public String posMain() {
		return "/qrro/pos/posMain";
	}
	
	//관리자 계정생성 폼
	@RequestMapping(value = "/qrro/pos/posCreate", method = RequestMethod.GET)
	public String posCreate() {
		return "/qrro/pos/posCreate";
	}
	
	//아이디 찾기 폼	
	@RequestMapping(value="/qrro/pos/posFindId", method=RequestMethod.GET)
	public String posFindId() {
		return "/qrro/pos/posFindId";
		
	}
		
	//비밀번호 찾기 폼	
	@RequestMapping(value="/qrro/pos/posFindPw", method=RequestMethod.GET)
	public String posFindPw() {
	return "/qrro/pos/posFindPw";
			
	}
}

