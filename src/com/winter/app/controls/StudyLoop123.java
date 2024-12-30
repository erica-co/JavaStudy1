package com.winter.app.controls;

import java.util.Scanner;

public class StudyLoop123 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int level=1;
		int gold=0;
		
		for(level=1;level<15;level++) {
			System.out.println("1.사냥 2.종료");
			int select = sc.nextInt();
			if(select != 1) {
				break;
			}
			
			
			for(int mon=0;mon<level*3;mon++) {
				System.out.println(mon+1 +" 마리 사냥 성공");
			}
			
			System.out.println("축 레벨업!!");
			
			if((level+1)%5==0) {
				//5/5*1000 => 1000
				//10/5*1000 => 2000
				//15 => 3000
				gold=gold+(level+1)/5*1000;
			}
			

			
		}
		
		System.out.println("현재 레벨 : "+level);
		System.out.println("현재 골드 : "+gold);
		
		
	}

}


