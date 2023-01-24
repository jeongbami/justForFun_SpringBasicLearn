package com.fastcampus.ch2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */


/*
 * 	<준비물>
 * 	1. 브라우저
 *	2. WAS(TOMCAT)
 *
 * 	원격 프로그램을 실행하기 위한 과
 * 	1. 프로그램 등록
 * 	2. URL과 main()을 연결
 *	
 *	브라우저가 원격 서버를 호출하기 위해 ip주소를 입력한다. (이 떄는 등록된 프로그램이 해당된다)
 * 	호출된 원격 프로그램은 연결된 URL로 실행된다.
 *
 * 	
 * 
 */
 
@Controller // 1. 원격 호출 가능한 프로그램으로 등록된 상태
public class HomeController {
//	
//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
//	
//	/**
//	 * Simply selects the home view to render by returning its name.
//	 */
	
	//2. URL과 메서드가 연결되어있다 (==mapping)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}
	
}

