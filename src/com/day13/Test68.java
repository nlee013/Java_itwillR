package com.day13;

//3.���� Ŭ���� Inner class (��ø)
//: class�� static���� ���� �� ����
//��ü�� �������� �ʾƵ� �޸� �� �ö�

class Outer3{
	
	static int a =10;
	int b = 20;
	
	public static class Inner3{//Inner3�� ���� ��ü ���� ���ص���.
							   //static���� �����ؼ� �޸𸮻� �̹� �ö�
		
		int c = 30;
		
		public void write() {
		
			System.out.println(a);
			//System.out.println(b);
			System.out.println(c);
			
			Outer3 ob = new Outer3();//��ü �����߱⿡ �Ʒ� ob.b�� ȣ�Ⱑ��
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
