package com.spring.shop.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.shop.dto.UserInfoDto;
import com.spring.shop.service.LoginService;

@Controller
@RequestMapping("login")
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	LoginService loginService;
	
	// 로그인
	@RequestMapping("/loginForm")
	public String loginForm(Locale locale) {
		logger.info("[System] loginForm method ", locale);
		return "login/loginForm";
	}
	
	// 회원 가입
	@RequestMapping("/signUpForm")
	public String signUpForm(Locale locale) {
		logger.info("[System] signUpForm method ", locale);
		
		return "login/signUpForm";
	}
	
	@RequestMapping(value = "/signUpPro", method = RequestMethod.POST)
	public String signUpPro(Locale locale, UserInfoDto userInfoDto) {
		logger.info("[System] signUpPro method ", locale);
		
		return "redirect:loginForm";
	}
	
	// 정보 수정
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modify(Locale locale, UserInfoDto userInfoDto) {
		logger.info("[System] modify method ", locale);
		
		return "redirect:loginForm";
	}
	
	// 회원 탈퇴
	@RequestMapping(value = "/leave", method = RequestMethod.POST)
	public String leave(Locale locale, UserInfoDto userInfoDto) {
		logger.info("[System] leave method ", locale);
		
		return "redirect:../index";
	}
}
