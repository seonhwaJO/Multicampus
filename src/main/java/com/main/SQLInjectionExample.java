package com.main;

public class SQLInjectionExample {
	public static void main(String[] args) {
		String username = getUserInput();
		String query = "select*from user where username = '"+username+"'";
		//쿼리 실행 로직
		System.out.println(query);
	}

	private static String getUserInput() {
		// 사용자로 입력 받은 로직
		return "TEST" ;
	}
}
