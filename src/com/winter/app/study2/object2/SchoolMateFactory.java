package com.winter.app.study2.object2;

import java.util.Scanner;

public class SchoolMateFactory {
		
		//SchoolMate 객체 생성
		//모든 정보를 입력받아서 대입
		
		public SchoolMate[] make (SchoolMate [] schoolMates) {
			Scanner sc = new Scanner(System.in);
			SchoolMate schoolMate = new SchoolMate();
			
			System.out.println("이름을 입력하세요");
			schoolMate.name= sc.next();
			System.out.println("번호를 입력하세요");
			schoolMate.num=sc.nextInt();
			System.out.println("국어점수를 입력하세요");
			schoolMate.kor=sc.nextInt();
			System.out.println("수학점수를 입력하세요");
			schoolMate.math=sc.nextInt();
			System.out.println("영어점수를 입력하세요");
			schoolMate.eng=sc.nextInt();
			schoolMate.total=schoolMate.kor+schoolMate.eng+schoolMate.math;
			schoolMate.avg= schoolMate.total/3.0;
			
			//1. +1 된 새로운 배열 생성
			SchoolMate [] copys = new SchoolMate [schoolMates.length+1];
			
			//2. 기존의 값을 새로운 배열로 값을 저장
			for(int i=0;i<schoolMates.length;i++) {
				copys[i]=schoolMates [i];
			}
			
			//3. 마지막 index 새로만든 schoolmate 대입
			copys[schoolMates.length]=schoolMate;
			
			
			return copys;
			
			
		}
		public SchoolMate find(SchoolMate [] schoolMates) {
			Scanner sc = new Scanner(System.in);
			System.out.println("학생번호를 입력하세요");
			int num = sc.nextInt();
			SchoolMate schoolMate = null;
			for(int i=0;i<schoolMates.length;i++) {
				if(num==schoolMates[i].num) {
					 	schoolMate=schoolMates[i];
					 	break;
				}
			}
			
			return schoolMate;
		}
	
		
}
