package test.String;

import java.util.ArrayList;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		sb.append(" ");
		System.out.println(sb);
		sb.append("World");
		System.out.println(sb);
		sb.append("!");
		System.out.println(sb);
		
		String str = sb.toString();
		System.out.println(str);
		
		/*
		 * 문제
		 *
		 * url에 있는 문자열에서 도메인과 파일명, 파라미터를 추출하시오
		 * 예상 결과 
		 * domain : https://search.naver.com
		 * file : search.naver
		 * param[0] : ie=utf8
		 * param[1] : query=자바
		*/
		String url = "https://search.daum.net/search?w=tot&DA=YZR&t__nil_searchbox=btn&sug=&sugo=&q=asd";
		String domain;
		String file;

		System.out.println(url);
		if(url.compareTo("https://") == -1) {
			domain = url.substring(0, 9);
			url = url.substring(9);
		}else {
			domain = url.substring(0, 8);
			url = url.substring(8);
		}
//		System.out.println(url);
		int fileIndex = url.lastIndexOf("/");
		
		domain = domain + url.substring(0, fileIndex);
		System.out.println(domain);
		
		int paramIndex = url.indexOf("?") + 1;
		
		file = url.substring(fileIndex + 1, paramIndex - 1);
		System.out.println(file);

		String param = url.substring(paramIndex);
		String[] params = param.split("&");
		
		for(int i = 0; i < params.length; i++)
			System.out.println(params[i]);
	}
}
