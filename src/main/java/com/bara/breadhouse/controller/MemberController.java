package com.bara.breadhouse.controller;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bara.breadhouse.dao.MemberDao;
import com.bara.breadhouse.vo.MemberVo;

@Controller
public class MemberController {

	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberDao dao;
	
	@GetMapping("/joinPage")
	public String goJoinPage () {
		logger.info("Member Join Page");
		return "member/join";
	}
	
	@PostMapping("/join")
	public String insertMember (MemberVo vo, HttpSession httpSession) {
		
		//조건문으로 Naver, Google, kakao분기 나누어서 method화?
		/*
		 * if(httpSession -> naver) {
		 * 	naverCallback();
		 * } else if(httpSession => kakao) {
		 * 	kakaoLogin();
		 * } else if (httpSession => google) {
		 * 	googleLogin();
		 * }
		 * 
		 * */
		
		
		logger.info("Join Success");
		return "";
	}
	
	@GetMapping("/callback")
	public String naverCallback () {
		logger.info("CallBack RestLogin to Naver");
		// model1 1으로 구현된 코드를 자바쪽으로 가지고와서 구현 해보기
		return "member/naverCallback";
	}
	
	@GetMapping("viewForm")
	@ResponseBody
	public String naverLogin () {
		logger.info("NaverLogin Success");
		return "index";
	}
	
	@GetMapping("google")
	@ResponseBody
	public String googleLogin() {
		logger.info("Google Success");
		return "index";
	}
	
	
	
}
