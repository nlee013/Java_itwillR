package com.day11;

import java.io.WriteAbortedException;

class Test{
	
	protected int a = 10, b = 20;
	
	public void write() {
		
		System.out.println("Super Class write()...");
		System.out.println("a: " + a + "b: " + b);
	}
}

class Demo extends Test{//Test class�� �θ�� ����
	
	protected int b = 30, c = 40;
	
	@Override
	public void write() {
		System.out.println("Sub class write()...");
		System.out.println("a: " + a + ", b: " + b + ",c: " + c);// 10 30 40
		System.out.println("super.b: " + super.b);//20
	}
	
	public void print1() {
		
		System.out.println("Sub Class print1()���� write()ȣ��...");
		write();
	}
	
	public void print2() {
		
		System.out.println("Sub Class print1()���� write()ȣ��...");
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
		//�ڽ���((Test)ob).b�� ob�� Test �θ�� ����ȯ�ؼ� Test�� �Ǵ� ��
		//-> upCast
		System.out.println("--------");
		((Test)ob).write();
		//method�� override�� �� ����(�θ� ���� �ص�)���� �� ��ȯ�� ����ȵ�
	}

}
