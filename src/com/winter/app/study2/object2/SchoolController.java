package com.winter.app.study2.object2;

import java.util.Scanner;

public class SchoolController {
	
	//메서드명 start
		public void start() { 
				
			//1. 학생정보입력  2. 학생정보출력  3.프로그램종료
			Scanner sc = new Scanner (System.in);
			boolean check=true;
			SchoolMateFactory sf= new SchoolMateFactory(); // 객체생성
			SchoolMateView sv = new SchoolMateView(); //클래스명 참조변수명 = new 클래스명();
			SchoolMate st = null;
			SchoolMate [] schoolMates = new SchoolMate [0];
			
			while(check) { 
				System.out.println("1. 학생정보입력  2.학생정보출력  3. 학생정보검색  4.프로그램종료");
				int select = sc.nextInt();
				if(select==1) {
						schoolMates = sf.make (schoolMates);
				}else if(select==2 ) {
						sv .viewAll(schoolMates);
				}else if(select==3) {
						SchoolMate schoolMate = sf.find(schoolMates);
						if(schoolMate !=null) {
							sv.view(schoolMate);
						}else {
							System.out.println("일치하는 학생이 없다");
						}
				}else {
					System.out.println("종료");
					break;
				}
			
			}

		}

}
