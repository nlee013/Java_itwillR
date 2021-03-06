package com.day7;

//cpu에서 프로그램 갯수 만큼 thread생성함
//Heap안에 method를 저장하는 공간이 method 영역
//정석 : 하나의 file에는 하나의 class 만 들어감
//종종 하나의 file에 두개의 class를 만든다.

//method는 처음 만들 때 하나만 생성.

//main절에 들어간 곳만 public을 설정해야 VM(Virtual Machine)이
//main으로만 찾아가 인식하기 때문
//class파일은 bin 폴더에 있고 class파일을 2개 만들면 bin폴더에도 2개 생성

//public class 밖에 사용 가능하고 안에 써도 가능
	class SubClass{
		int a; // instance variable 변수
		int b;
	}
public class Test34 {
	
	public static void main(String[] args) {

		SubClass ob1 = new SubClass();
		SubClass ob2 = new SubClass();
		
		System.out.println("on1.a:" + ob1.a + "\ton1.b" + ob1.b);
		System.out.println("on2.b:" + ob2.b);
		
		//메모리 공간을 따로 사용함
		ob1.a = 10;
		ob1.b = 20;
		
		System.out.println("on2.a:" + ob2.a);
		System.out.println("on2.b:" + ob2.b);
		
		ob2.a = 100;
		ob2.b = 200;
		
		System.out.println("on1.a:" + ob1.a);
		System.out.println("on1.b:" + ob1.b);
	}

}
