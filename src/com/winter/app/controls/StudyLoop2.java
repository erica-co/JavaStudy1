package com.winter.app.controls;

import java.util.Scanner;

public class StudyLoop2 {
	
	public static void main(String[] args) {
		//for(초기식;조건식;증감식) {}
		//0초~59초
		Scanner sc = new Scanner(System.in);
//		System.out.println("초를 입력");
//		int sec = sc.nextInt();
//		
//		for(int i=0;i<60;i++) {
//			System.out.println(i+"초");
//			
//			if(sec==i) {
//				i=59;
//			}
//			
//		} 전체 선택 -ctrl+/
		
		int id= 1234;
		int pw= 5678;
		
		int i=0;
		for(;i<5;i++) {
		System.out.println("아이디 입력하세요");
		int yId = sc.nextInt();
		
		System.out.println("비밀번호 입력하세요");
		int yPw = sc.nextInt();
		
			if(id==yId && pw==yPw) {
				System.out.println("로그인 성공");
				i=1000;
				}
				else {
					System.out.println("로그인 실패");
				}
			
			}
			
		 
		
		System.out.println("은행 방문");
	
		
		
	
	
		
		
		
		
	} //main 끝

} // class 끝
