package com.winter.app.study2.object1;

public class StudentFactory {
	
	//return type : 리턴할 데이터 타입 (void 자리에)
	//void 뜻 : 리턴이 없음
	public int t1(int num, int num2) {
			int sum = num + num2;
			int avg = sum/2;
			
			if(sum<0) {
				return sum;
			}
			
			//리턴은 한 개의 값만 리턴 가능
			//메서드의 종료는 {} 끝을 만나거나 
			//return을 만났을 때
			return sum;
			
	}
	public String t2() {
			
			return "";
	}
	public void t3(int num) {
			if(num<0) {
				
					return;
			}
		
	}
	
	
	
	
	

}
