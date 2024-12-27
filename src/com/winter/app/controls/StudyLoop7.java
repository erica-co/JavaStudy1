package com.winter.app.controls;

import java.util.Scanner;

public class StudyLoop7 {
	/**
	 * while(조건식){
	 * 	조건식이 true일 때 실행
	 * }
	 * 
	 * */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int i=5;
//		
//		boolean check=true;
//		
//		while(check) {
//			System.out.println("숫자를 입력하세요");
//			int num = sc.nextInt();
//			
//			if(i==num) {
//				check=!check;
//				break;
//				// continue; -> 증감식이 없으니 조건식으로 다시 돌아가라
		
		//1.정보입력 2.정보수정 3.정보출력 4.프로그램종료
		
		boolean flag=true;
		
		while(flag) {
			System.out.println("1.정보입력 2.정보수정 3.정보출력 4.프로그램종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1 : System.out.println("정보입력 코드 생성");
				break;
			case 2 : System.out.println("정보수정 코드 생성");
				break;
			case 4 : System.out.println("정보출력 코드 생성");
				break;
			default : System.out.println("다시 입력하세요");
			}
			
//			if(select==1) {
//				System.out.println("정보입력 코드 생성");
//			}else if (select==2) {
//				System.out.println("정보수정 코드 생성");
//			}else if(select==3) {
//				System.out.println("정보출력 코드 생성");
//			}else if(select==4) {
//				System.out.println("종료");
//				break;
//			}else {
//				System.out.println("다시 입력하세요");
//			}
//			
//			
		}
			}
		

	}


