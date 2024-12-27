package com.winter.app.controls;

import java.util.Random;

public class Studycontrol5 {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		int salt= 4;//random.nextInt(8)+1;//0~8미만의 정수 하나를 뽑자
		int ch =120; //random.nextInt(26)+97;//97~122
		char word = (char)ch;
		
		int result = word+salt; //122+3 +> 125
		
		if (result>122) {
			//97 : A
			//98 : B
			//99 : C
			result= 96+result-'z';
		}
		
		
		System.out.println(salt);
		System.out.println(word);
		System.out.println((char)result);
		
		//-------------------------------
		//디코딩 코드 작성 해보기
		
		
	}

}
