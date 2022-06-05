package com.bara.breadhouse.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.bara.breadhouse.constant.Location;


@Controller
public class StoreLatLonController {

	private static final Logger logger = LoggerFactory.getLogger(StoreLatLonController.class);
	
	@Autowired
	Location location;
	
	
	@PostMapping("goMap")
	public String goMapPage(HttpServletRequest request, HttpServletResponse response) {
		
		
		return "";
	}
	
	
}
