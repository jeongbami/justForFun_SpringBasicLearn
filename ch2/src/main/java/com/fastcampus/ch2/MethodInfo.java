package com.fastcampus.ch2;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.StringJoiner;

public class MethodInfo {
	public static void main(String[] args) throws Exception{
		
		
		
		//1. YoilTeller 클래스의 객체를 생성.
		Class clazz = Class.forName("com.fastcampus.ch2.YoilTeller_servlet");
		Object obj = clazz.newInstance();
		
		//2. 모든 method의 정보를 가져와 배열에 저장.
		Method[] methodArr = clazz.getDeclaredMethods();
		
		for(Method m : methodArr) { // 반복문을 통해 정보를 추출.
			String name = m.getName(); //method 이름 
			Parameter[] paramArr = m.getParameters(); // 매개변수 목록 
//			Class[] paramTypeArr = m.getParameterTypes();
			Class returnType = m.getReturnType(); // 반환 타입 
			
			// console창 출력을 깔끔하게 하기 위한 객체 
			StringJoiner paramList = new StringJoiner(", ", "(", ")");
			// 위와 같이 반복문을 통해 추출한다. 
			for(Parameter param : paramArr) {
				String paramName = param.getName();
				Class  paramType = param.getType();
				
				paramList.add(paramType.getName() + " " + paramName);
			}
			
			System.out.printf("%s %s%s%n", returnType.getName(), name, paramList);
		}
	} // main
}

 