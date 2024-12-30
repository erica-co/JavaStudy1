package com.winter.app.study1.array;

import java.util.Scanner;

public class ArrayStudy2 {
	
	public static void main(String[] args) {
		//한반에서 국어시험의 결과를 저장
		//학생 수는 n명
		//학생 수를 입력 받아서 시작
		//국어의 총점과 평균을 계산

		Scanner sc= new Scanner(System.in);
		System.out.println("학생 수를 입력하세요");
		int count=sc.nextInt();		
		
		int [] scores= new int [count];
		// int num=0;
		for(int i=0;i<4;i++) {
			System.out.println("국어점수를 입력하세요");
			scores[i]= sc.nextInt();
			
		}
		
		
		for(int i=0;i<scores.length;i++) {
			
		System.out.println(scores[i]);
		}
		
		//int total = scores[0]+scores[1]+scores[2]+scores[3];
		int total = 0;
		for(int i=0;i<scores.length;i++) {
			total=total+scores[i];
		}
		double avg = total/4.0;
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		
		
		
	}

}
