package com.winter.app;

import java.util.Scanner;

public class Study5 {
	/**
	 * 연산자
	 * 산술연산자- 숫자 계산
	 * +, -, *, /, %(나머지값 구하는 연산자)
	 * 
	 * + 
	 *  1) 산술연산자
	 *  2) 연결연산자 문자열 + primitive
	 */
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 50;
		int num2 = num1 + 20;
		num2 = (int)(num1 + 1.2);
		
		System.out.println("국어점수를 입력하세요");
		int n1 = sc.nextInt();
		
		System.out.println("수학점수를 입력하세요");
		int n2 = sc.nextInt();
		
		System.out.println("영어점수를입력하세요");
		int n3 = sc.nextInt();
		
		double total = n1+n2+n3;
		double avg = total/3;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(total);
		System.out.println(avg);
		
		System.out.println("프로그램 종료");
		
		
	
		
	}

}
