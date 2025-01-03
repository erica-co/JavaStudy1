package com.winter.app.study2.modifier;

public class ModMain {

	public static void main(String[] args) { //static이 있으면 객체생성 따로 안해도 됨
			Test test = new Test ();
			test.num1=30;
			test.num3=1010;
			System.out.println(Test.num3);
			System.out.println(test.num1);
			
			
			System.out.println("====================");
			Test test2 = new Test();
			
			System.out.println(Test.num3);
			System.out.println(test2.num1);
			
			//stack_지역변수/ heap_instacn변수/ 메서드_class변수
			
			System.out.println("=================");
			Test3 t3 = Test3.getInstance();
			t3.getName();
			t3.setName("");
	}

}
