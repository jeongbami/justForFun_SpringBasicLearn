package com.fastcampus.ch2;

import java.util.Calendar;

//년,월,일 을 입력하면 요일을 알려주는 프로그램 
//이 과정을 통해 http 요청과 응답을 간접적으로 배울 수 있다.
public class YoilTeller {

	
	public static void main(String[] args) {
	
	//1. 입력 
		// 매개변수 String[]으로 입력 받는다 
		String year = args[0]; 
		String month = args[1];
		String day = args[2];
		
		//String을 Int로 변화 
		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);
	
	//2. 작업 
		// java의 calendar클래스를 통해 객체생성 
		Calendar cal = Calendar.getInstance();
		cal.set(yyyy,mm - 1 , dd);
		
		//Calaendar의 DAY_OF_WEEK를 활용하여 변수에 담아준다
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
				// 1-일요일, 2-월요일, 3-화요일 ...
		char yoil = "일월화수목금토".charAt(dayOfWeek);
				// 변수에 저장된 값(==숫자)를 순서에 따라 char값으로 바꾸어 준다 
		
	//3. 출력
		System.out.println(year + "년" + month + "월" + day + "일은");
		System.out.println(yoil + "요일 입니다.");
		
		
	}
	
}
