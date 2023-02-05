package com.fastcampus.ch2;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@ControllerAdvice //모든 패키지에 적용
@ControllerAdvice("com.fastcampus.ch2") // 해당 패키지에만 적용 
public class GlobalCathcer {

	@ExceptionHandler(Exception.class)
	public String catcher(Exception ex, Model m){
		m.addAttribute("ex",ex);
		return "error";
	}

	@ExceptionHandler(NullPointerException.class)
	public String catcher2(Exception ex, Model m){
		m.addAttribute("ex",ex);
		return "error";
	}
}
