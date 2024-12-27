package com.winter.app.controls;

import java.util.Scanner;

	public class Studycontrol1 {

	/**
	 * 제어문
	 * if- 만약 ~한다면      
	 * 1) 단일 if
	 * 
	 *  if(조건식){
	 *  	조건식이 true일 때만 실행
	 *  }
	 * */
	
	
	
	public static void main(String[] args) {
		
		int num= 2;
		
		if(num%2==0) {
			System.out.println("Num : "+num);

		}
		
		System.out.println("프로그램 종료");
		
		Scanner sc = new Scanner(System.in);
		//국어, 영어, 수학 점수를 입력 받아서
		//총점과 평균을 계산후 90점 이상이면 우수상 수상출력
		
		//국어점수를 담을 변수
		int kor=0;
		
		//영어점수
		int eng = 0;
		
		//수학 점수
		int math=0;
		
		//평균
		int avg=0;
			
		System.out.println("국어 점수를 입력하세요");
		kor = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요");
		eng = sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요");
		math = sc.nextInt();
		
		//math의 범위가 0이상 100이하가 아니라면 에러 출력
		if(math<0 || math>100) {
			System.out.println("error");	
		}
		
		
		
		
		avg = (kor+eng+math)/3;
		
	
		if(avg>=60) {
			if(avg>=90) {
			System.out.println("우수상 수상을 축하합니다");
		}
			System.out.println("통과");
		}
			
		System.out.println(avg);
		
		//평균 90이상 A출력
		//평균 80이상 B출력
		//평균 70이상 C출력
		//평균 60이상 D출력
		//그외 F출력
		
		if(avg>=90) {
			System.out.println("A");
		}
		if(avg>=80 && avg<90) {
			System.out.println("B");
		}
		if(avg>=70 && avg<80) {
			System.out.println("C");
		}
		if(avg>=60 && avg<70) {
			System.out.println("D");
		}
		if(avg<60) {
			System.out.println("F");
		}
	}
	}
	
		

		
		
		
		
		
		
	


