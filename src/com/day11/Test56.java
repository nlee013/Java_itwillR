package com.day11;

import java.io.WriteAbortedException;

class Test{
	
	protected int a = 10, b = 20;
	
	public void write() {
		
		System.out.println("Super Class write()...");
		System.out.println("a: " + a + "b: " + b);
	}
}

class Demo extends Test{//Test class를 부모로 만듦
	
	protected int b = 30, c = 40;
	
	@Override
	public void write() {
		System.out.println("Sub class write()...");
		System.out.println("a: " + a + ", b: " + b + ",c: " + c);// 10 30 40
		System.out.println("super.b: " + super.b);//20
	}
	
	public void print1() {
		
		System.out.println("Sub Class print1()에서 write()호출...");
		write();
	}
	
	public void print2() {
		
		System.out.println("Sub Class print1()에서 write()호출...");
		super.write();
	}
	
}

public class Test56 {

	public static void main(String[] args) {

		Demo ob = new Demo();
		ob.write();
		ob.print1();
		ob.print2();
		
		System.out.println("ob.b: " + ob.b);
		System.out.println("((Test)ob).b: " + ((Test)ob).b);
		//자식을((Test)ob).b의 ob는 Test 부모로 형변환해서 Test가 되는 것
		//-> upCast
		System.out.println("--------");
		((Test)ob).write();
		//method는 override를 한 상태(부모 얼굴을 해도)에서 형 변환이 적용안됨
	}

}
