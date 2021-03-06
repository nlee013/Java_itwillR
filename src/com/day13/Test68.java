package com.day13;

//3.내부 클래스 Inner class (중첩)
//: class를 static으로 만들 수 있음
//객체를 생성하지 않아도 메모리 상에 올라감

class Outer3{
	
	static int a =10;
	int b = 20;
	
	public static class Inner3{//Inner3은 따로 객체 생성 안해도됨.
							   //static으로 선언해서 메모리상에 이미 올라감
		
		int c = 30;
		
		public void write() {
		
			System.out.println(a);
			//System.out.println(b);
			System.out.println(c);
			
			Outer3 ob = new Outer3();//객체 생성했기에 아래 ob.b가 호출가능
			System.out.println(ob.b);
			
		}
	}
	
	public void print() {
		System.out.println(b);
	}
}

public class Test68 {

	public static void main(String[] args) {

		Outer3 out = new Outer3();
		out.print();
	}
}
