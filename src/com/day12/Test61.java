package com.day12;

class TestA{
	
	public void print() {
		System.out.println("A class...");
	}
}

class TestB{
	public void print() {
		System.out.println("B class...");
	}
}
public class Test61 {

	public static void main(String[] args) {

		TestA a = new TestA();//객체생성 a 주소지
		TestB b;//선언만
		
		//b = a; ->안됨. 그릇이 다름 
		//b =(TestB)a ->형변환도 안됨.
		//둘다 Data type이 다름. TestB-> TestA로 변경하면 가능.
	}

}
