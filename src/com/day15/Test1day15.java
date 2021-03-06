package com.day15;

//Generic -> list<000>

class Box<T>{
	
	private T t;//자료형 integer
	
	public void set(T t) {//매개변수 t를 받는다
		
		this.t = t;
	}
	
	public T get() {
		return t;//반환값 integer
	}
	
	
}
public class Test1day15 {

	public static void main(String[] args) {

		//Box<>안에 들어간 모든게 integer가 됨 
		Box <Integer> b1 = new Box<Integer>();
		
		b1.set(10);//Auto-boxing
		int i = b1.get();//Auto-unboxing
		System.out.println(i);
		
		Box<String> b2 = new Box<String>();
		//b2.set(10); -> 자료를 String값을 줘서 에러남
		b2.set("Seoul");
		String s = b2.get();
		System.out.println(s);
		
		Box b3 = new Box<>();
		b3.set(30);
		Integer ii = (Integer)b3.get();//downcast->get()에서 꺼내온 데이타가 Object로 부터 꺼내옴
		System.out.println(ii);
	}

}
