package com.day13;

//2.���� Ŭ���� Inner class(Local)
//method �ȿ� class ���� �� ����
class Outer2{
	
	static int a = 10;
	int b = 20;
	
	public void write() {
		
		int c = 30;
		final int d = 40;
		
		class Inner2{//Outer�� ��ü ������ ���� ���߱� ������ public �� ������� �ʴ´�
			
			public void print() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			}
		}
		Inner2 ob = new Inner2();//method �ȿ����� ��ü ���� ����
		ob.print();
	}
}
public class Test67 {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.write();
	}

}
