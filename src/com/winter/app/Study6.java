package com.winter.app;

import java.util.Scanner;

public class Study6 {
	
	public static void main(String[] args) {
		//나머지 연산자 %
		//double n1  =12.123%3;
		
		//System.out.println(n1);
		
		Scanner sc = new Scanner(System.in);
		//편의점 자동 계산 
		//물건의 총 합계금액 입력
		//25300
		//낸 돈 50000
		//거스름돈 24700
		//만원2, 천원4, 백원7
		
		int sum = 25300;
		int don = 50000;
		int jandon = don - sum;
		int m = jandon/10000;
		int c = (jandon-m*10000)/1000;
		int b = (jandon-m*10000-c*1000)/100;
		
		//--------------------------------------
		c= jandon%10000/1000;
		
		System.out.println(m);
		System.out.println(c);
		System.out.println(b);
		
		
		
		
	}

}
