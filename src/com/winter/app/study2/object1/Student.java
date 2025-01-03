package com.winter.app.study2.object1;

public class Student {
	
	 //멤버변수 (instance 변수 heap에 위치)
	//접근지정자 [그외지정자] 데이터타입 변수명;
	//이름. 학번, 국어, 영어,수학,총점,평균
	
	//reference, instance, 참조변수
	String name;
	//primitive, instance
	 int num;
	 int kor;
	 int eng;
	 int math;
	 int total;
	 double avg;
	 
	 
	//하는 일 멤버메서드(instance 메서드)
	 //접근지정자 [그 외 지정자] 리턴타입 메서드명([매개변수들 선언]){
	 // 실행코드들,,,
	 //}
	 
	 public void info(int num1, double num2) {
		 System.out.println("학생입니다");
		 //두개의 숫자의 합을 계산
		 System.out.println(num1+num2);
		 
	 }
	 
	 //print.
	 public void print() {
		 System.out.println("print");
	 }

}
