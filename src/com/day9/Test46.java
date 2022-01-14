package com.day9;

//constructor ������ property error�� method ����
class TestC{
	
	private String title;
	protected int area;
	
	public TestC(String title) {//overloading�� �����ڸ� ����.�⺻�����ڰ� ���⿡ �⺻�����ڴ� ������
		this.title = title;
	}
	public void print() {
		System.out.println("title: " + area);
	}
}

class RectC extends TestC{
	private int w, h;
	
	public RectC(int w, int h) {
		super("Square"); //super�� 1���� ȣ�Ⱑ��. �������� �ۼ�(���� ȣ��Ǿ����)
						//super�� ���� �����Ǿ�����.super�� �������ִ� ������.
						 //TestC��� �θ�
		
		//->super("Square"); �� ������ �⺻ �����ڰ� �־�ߵ�
		//super�� ���� �⺻ ������, overloading�� ������� �׻� �����Ǿ�����.
		//super�� �θ� ������(�θ� class)�� �ǹ���
		
		//�׷��Ƿ� super�� �θ� �������̹Ƿ�
		//�⺻ ������ ��� O, overloading ��� X -> super(); ���
		//�⺻ ������ ��� X, overloading ��� O -> super(�ڷ���); ��� O
		//super(�θ� ������)�ȿ� �� ���� ���.
		
		this.w = w;
		this.h = h;
	}
	
	public void rectArea() {
		area = w*h;
	}
}

public class Test46 {

	public static void main(String[] args) {
		
		RectC ob = new RectC(10, 20);
		ob.rectArea();
		ob.print();
		
	}

}
