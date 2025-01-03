package com.winter.app.study2.object1;

public class ObjectMain2 {
	
	public static void main(String[] args) {
		Student st = new Student();
		//멤버변수 사용
		//참조변수명.멤버변수명
		
		//멤버메소드 사용_ 메서드를 호출
		//참조변수명.멤버메소드명([인자값])
		int n=5;
		st.info('1',1.2); //int에서 char타입으로 형변환 가능
		
		st.info(n, 3.2);
		
		st.print();
		st.name="iu";
		st.num=1;
		
		Student student = new Student();
		student.name="winter";
		student.num=2;
		
		StudentView studentView = new StudentView();
		studentView.view(st);
		studentView.view(student);
		
//		Student st2 = new Student();
//		st2.info(1*2);
//		st2.print();
//		
//		Student [] students = new Student[5];
//		for(int i=0;i<5;i++) {
//				students[i]=st; //문법적으로 틀린 건 없지만 한명만 있는 거
//		}
		
		
	}

}
