package com.fastcampus.ch2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//년,월,일 을 입력하면 요일을 알려주는 프로그램 
//이 과정을 통해 http 요청과 응답을 간접적으로 배울 수 있다.\

//local program에서 원격 program으로 바꿔보기 
// 1. 호출의 매개체 바꾸기 
//		Browser에서 날아오는 parameter값으로 호출한다. 
// 		String[] args -> httpservletRequest 
// 2. 출력 매개체 바꾸기 
//		console창에서 출력되는 것을 Browser로 출력한다.
//		System.out.print(console) -> browser
//		== HttpServletResponse 사용 

@Controller
public class YoilTeller_servlet {

	@RequestMapping("/getYoil")
	public void main(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
	//1. 입력 
		// 매개변수 String[]으로 입력 받는다 
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		
		//String을 Int로 변화 
		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);

	//2. 작업  (요일을 계산하는 작업)

		// java의 calendar클래스를 통해 객체생성 
		Calendar cal = Calendar.getInstance();
		cal.set(yyyy,mm - 1 , dd);
		
		//Calaendar의 DAY_OF_WEEK를 활용하여 변수에 담아준다
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
				// 1-일요일, 2-월요일, 3-화요일 ...
		char yoil = "일월화수목금토".charAt(dayOfWeek);
				// 변수에 저장된 값(==숫자)를 순서에 따라 char값으로 바꾸어 준다 
		
	//3. 출력
//		System.out.println(year + "년" + month + "월" + day + "일은");
//		System.out.println(yoil + "요일 입니다.");
		
		// browser는 응답된 값이 text인지 binary인지 구분을 못함 
		// 그러므로 어떤 type인지 명시해 주어야 하고 인코딩도 함께 해주어야 한다.
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter(); // response의 객체에서 브라우저의 출력 스트림을 받는다.
		out.println(year + "년" + month + "월" + day + "일은");
		out.println(yoil + "요일 입니다.");
	
	
	}
	
}
