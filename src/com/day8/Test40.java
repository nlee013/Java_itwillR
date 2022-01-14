package com.day8;

class Rect{
	
	private int w, h;//������ ������ private�� �����ϰ� �����ض�

	public void set(int w, int h) {
		
		this.w = w;
		this.h = h;
	}
		 
	public int area() {
		return w*h;
	}
	
	public int length() {
		return (w*h)*2;
	}
	//method �ߺ� ���� (Overload/Overloading) 100�� ���ܷ� ����صα�
	//1���� class �ȿ��� ����� ������ �ϴ� method�� �̸���
	//���Ͻ�Ű�� �۾����� �޼ҵ��� �̸��� ����������
	//��ȣ ���� �μ�(�Ű�����)�� ������ �μ��� �ڷ����� �ٸ��� �ָ�
	//���� �ٸ� �޼ҵ�� �ν��� �Ѵ�
	
	//overwriting�� ��� ���迡�� ��Ÿ����.

	public void print(int a, double l) {
		System.out.println("Width: " + w);
		System.out.println("Height: " + h);
		System.out.println("Area: " + a);
		System.out.println("Length: " + l);
	}

	public void print() {
	
		System.out.println("Width: " + w);
		System.out.println("Height: " + h);
	}

	public void print(int a) {
	
		System.out.println("Width: " + w);
		System.out.println("Height: " + h);
		System.out.println("Area: " + a);

	}

	public void print (double l) {
	
		System.out.println("Width: " + w);
		System.out.println("Height: " + h);
		System.out.println("Length: " + l);

	}
}
public class Test40 {

	public static void main(String[] args) {

		Rect ob = new Rect();
		
		ob.set(10, 20);
		
		int a = ob.area();
		double l = ob.length();
		
		ob.print();
		ob.print(a);
		ob.print(l);
		ob.print(a, l);
		
		String str;
		
	}
	
 }


