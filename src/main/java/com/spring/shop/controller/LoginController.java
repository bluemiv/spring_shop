package com.spring.shop.controller;

import java.security.PrivateKey;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.shop.dto.RSA;
import com.spring.shop.dto.UserInfoDto;
import com.spring.shop.service.LoginService;
import com.spring.shop.service.RSAUtil;

@Controller
@RequestMapping("login")
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	LoginService loginService;
	
	// 로그인
	@RequestMapping("/loginForm")
	public String loginForm(HttpSession httpSession, Model model, Locale locale) {
		
		logger.info("[System] loginForm method ", locale);
		// RSA 키 생성
	    PrivateKey key = (PrivateKey) httpSession.getAttribute("RSAprivateKey");
	    if (key != null) { // 기존 key 파기
	    		httpSession.removeAttribute("privateKey");
	    }
	    RSAUtil rsaUtil = new RSAUtil();
	    RSA rsa = rsaUtil.createRSA();
	    model.addAttribute("modulus", rsa.getModulus());
	    model.addAttribute("exponent", rsa.getExponent());
	    httpSession.setAttribute("privateKey", rsa.getPrivateKey());

		return "login/loginForm";
	}
	
	// 회원가입
	@RequestMapping("/signUpForm")
	public String signUpForm(Locale locale) {
		logger.info("[System] signUpForm method ", locale);
		
		return "login/signUpForm";
	}
	
	@RequestMapping(value = "/signUpPro", method = RequestMethod.POST)
	public String signUpPro(Locale locale, UserInfoDto userInfoDto) {
		logger.info("[System] signUpPro method ", locale);
		System.out.println(userInfoDto.toString());
		
		int result = loginService.signUp(userInfoDto);
		if(result != 0) {
			logger.info("[System] signUpPro method - success", locale);
		}else {
			logger.info("[System] signUpPro method - fail", locale);
		}
		
		return "redirect:loginForm";
	}
	
	// 정보수정
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modify(Locale locale, UserInfoDto userInfoDto) {
		logger.info("[System] modify method ", locale);
		
		return "redirect:loginForm";
	}
	
	// 회원탈퇴
	@RequestMapping(value = "/leave", method = RequestMethod.POST)
	public String leave(Locale locale, UserInfoDto userInfoDto) {
		logger.info("[System] leave method ", locale);
		
		return "redirect:../index";
	}
}
