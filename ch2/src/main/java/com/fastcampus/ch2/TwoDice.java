package com.fastcampus.ch2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// HTTP request , response 예제 ( 주사위 )

@Controller
public class TwoDice {
	
	@RequestMapping("/rollDice")
	public void main(HttpServletResponse res) throws IOException {


		//새로고침 할 떄 마다 사진이 바뀌게 하는 것.	
		int idx1 = (int)(Math.random()*6)+1;
		int idx2 = (int)(Math.random()*6)+1;

			res.setContentType("text/html");
			res.setCharacterEncoding("utf-8");
			PrintWriter out = res.getWriter();
			out.println("<html>");
				out.println("<head>");
				out.println("</head>");
				out.println("<body>");
						out.println("<img src='/img/dice1.jpg'> ");
						out.println("<img src='/img/dice2.jpg'> ");

					out.println("<body>"); 
						out.println("<img src='resources/img/dice1"+idx1+".jpg'> ");
						out.println("<img src='resources/img/dice2"+idx2+".jpg'> ");


					out.println("<body>"); 
						out.println("<img src='resources/img/dice1"+idx1+".jpg'> ");
						out.println("<img src='resources/img/dice2"+idx2+".jpg'> ");

					out.println("</body>");
			out.println("</html>");


					out.println("<body>"); 
						out.println("<img src='resources/img/dice1"+idx1+".jpg'> ");
						out.println("<img src='resources/img/dice2"+idx2+".jpg'> ");
					out.println("</body>");
			out.println("</html>");

		/* 
		 * web browser의 서버가 제공하는 리소스 
		 * 	리소스
		 *  	동적 리소스	서버가 실행할 때마다 결과값이 변하는 리소스(streamming) 
		 *  	정적 리소스 값이 변하지 않는 리소스(img, .jsp ..)
		 *  
		 *  
		 *  
		 *  
		 *  HTTP Request & Responses
		 *  	client 서비스를 요청하는 애플리케이션 
		 * 		server 서비스를 제공하는 애플리케이션
		 * 
		 * 		클라이언트가 url을 통해 server로 요청을 하면 
		 * 		서버는 프로그램을 실행한다 
		 * 		그 결과물을 <html>형식의 text문서 즉 문자열로 응답 및 전송한다 (out.println)
		 * 		응답을 받은 클라이언트는 결과물을 browser을 통해 출력한다 
		 *  
		 *  	== 이것이 웹 프로그래밍이다 .
		 *  */

		
	}
}
