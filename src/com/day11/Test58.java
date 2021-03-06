package com.day11;

//final
//instance 변수에 final을 붙이면 단 한번만 초기화 가능
//method에 final 붙이면 override 불가능
//class에 final을 붙이면 상속 불가능

//final class TestA{//public 다음에 final.상속이 안됨
class TestA{
	public static final double PI;
	
	static {//초기값
		PI = 3.14;
	}
	
	public double area;//instance변수
	public void write(String title) {//원본이 손상되면 안됨
		//자식이 가져다 사용가능하되, override 불가능
		System.out.println(title + ":" + area);
	}
}

public class Test58 extends TestA{//부모화 시키기

	/*@Override
	public void write(String title) {	
	}*/
	//method에 final 호출 시, override 불가능.

	public void circleArea(int r) {
		area = (double)r*r*PI;
	}
	public static void main(String[] args) {

		Test58 ob = new Test58();
		ob.circleArea(10);
		ob.write("원");
	}

}
