package com.winter.app.controls;

import java.util.Scanner;

public class Studycontrol2 {

	
	/**
	 * if ~else 둘 중 하나를 선택
	 * 
	 * if(조건식) {
	 * 		조건식이 true일 때만 실행
	 * } else {
	 * 		조건식이 false일 때 실행
	 * }
	 * */
	public static void main(String[] args) {
		System.out.println("프로그램 시작"); //sysout (crtl+space)
		
		int num = 1;
		int age=0;
		
		if(num>0) {
			num++;
			age=20; //지역변수: 영역 내에서만 사용가능
			age++;
		} else {
			System.out.println("음수입니다");
		}
		
		System.out.println(num);
		System.out.println(age);
		
		//-------------------------------------------
		Scanner sc = new Scanner(System.in);
		
		int id = 1234;
		int pw = 5678;
		
		System.out.println("아이디를 입력하세요");
		int yId = sc.nextInt();
		System.out.println("비밀번호를 입력하세요");
		int yPw = sc.nextInt();
		
		if(id==yId && pw==yPw) {
			System.out.println("로그인 성공");
			
		}else {
			System.out.println("로그인 실패");
		}
		
		
		
		System.out.println("프로그램 종료");
	
	}

}
