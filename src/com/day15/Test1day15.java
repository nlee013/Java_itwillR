package com.day15;

//Generic -> list<000>

class Box<T>{
	
	private T t;//�ڷ��� integer
	
	public void set(T t) {//�Ű����� t�� �޴´�
		
		this.t = t;
	}
	
	public T get() {
		return t;//��ȯ�� integer
	}
	
	
}
public class Test1day15 {

	public static void main(String[] args) {

		//Box<>�ȿ� �� ���� integer�� �� 
		Box <Integer> b1 = new Box<Integer>();
		
		b1.set(10);//Auto-boxing
		int i = b1.get();//Auto-unboxing
		System.out.println(i);
		
		Box<String> b2 = new Box<String>();
		//b2.set(10); -> �ڷḦ String���� �༭ ������
		b2.set("Seoul");
		String s = b2.get();
		System.out.println(s);
		
		Box b3 = new Box<>();
		b3.set(30);
		Integer ii = (Integer)b3.get();//downcast->get()���� ������ ����Ÿ�� Object�� ���� ������
		System.out.println(ii);
	}

}
