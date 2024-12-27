package com.winter.app.controls;

public class Studycontrol4 {
	
	/**
	 * 여러개 중 하나 선택
	 * switch case
	 * 
	 * switch(정수식 또는 문자열){
	 * 		case 정수 또는 문자열:
	 * 		break;
	 * 
	 * 		case 정수 또는 문자열:
	 * 		break;
	 * }
	 * 
	 * */
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//A, B, C, D, F
		int avg =0;
		
		switch(avg/10) {
		case 10:
		case 9:
			System.out.println("A");
			//case는 변할 수 없는 상수만 가능
			//정수식의 결과물이 1일 때 실행
			break;
		case 8 :
			System.out.println("B");
			//정수식의 결과물이 2일 때 실행
			break;
		case 7 :
			System.out.println("C");
			//정수식의 결과물이 30일 때 실행
			break;
		
			default:
			//정수식의 결과가 case던지 일치하지 않은 경우
		}
		System.out.println();
	
		System.out.println("프로그램 종료");
		
	}
}
