package com.day13;

//1.(����)Inner class : class �ȿ� class�� ���� �ǹ�

//���� Inner class�� ������� Outer class ��ü �����ؾߵ�.
//Outer�� �����ߴٰ� Inner�� ������ ���� �ƴ϶�,
//Inner�� ������ ��ü �����ؾߵ�
//Inner ��ü�� ���� �Ұ���

class Outer1{
	
	static int a = 10;//�ڵ� �޸�ȭ
	int b = 20;//new�� �־�ߵ�
	
	//class �ȿ� class ���� �� ���� -> ���߿� ���� ���
	public class Inner1{//���� class
		
		int c = 30;//���� ���� ����
		
		public void write() {//method ���� ���� -> outer�� method
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	}
	public void print() {	
		Inner1 ob = new Inner1();
		//Inner ��ü ���������ϱ� �Ʒ� ob.write(); �ۼ�����
		ob.write();
	}
}

public class Test66 {

	public static void main(String[] args) {
		
		//���⼭ Outer ��ü ���� �߱� ������ Inner ���� ����
		Outer1 out = new Outer1();
		//Outer1 out = new Outer1();�� ������ٴ� ���� �Ͽ� �Ʒ� �ڵ� ����
		out.print();
		
		//�����常 ���. �ؿ� �ܿ��� �ʾƵ� �� (���̷�Ʈ�� �����ϴ� ��)
		//Outer1 out = new Outer1();�� ������ٴ� ���� �Ͽ�  out.new Inner1(); ��ü ����
		Outer1.Inner1 in = out.new Inner1();
		in.write();
	}

}
