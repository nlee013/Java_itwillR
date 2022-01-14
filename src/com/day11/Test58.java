package com.day11;

//final
//instance ������ final�� ���̸� �� �ѹ��� �ʱ�ȭ ����
//method�� final ���̸� override �Ұ���
//class�� final�� ���̸� ��� �Ұ���

//final class TestA{//public ������ final.����� �ȵ�
class TestA{
	public static final double PI;
	
	static {//�ʱⰪ
		PI = 3.14;
	}
	
	public double area;//instance����
	public void write(String title) {//������ �ջ�Ǹ� �ȵ�
		//�ڽ��� ������ ��밡���ϵ�, override �Ұ���
		System.out.println(title + ":" + area);
	}
}

public class Test58 extends TestA{//�θ�ȭ ��Ű��

	/*@Override
	public void write(String title) {	
	}*/
	//method�� final ȣ�� ��, override �Ұ���.

	public void circleArea(int r) {
		area = (double)r*r*PI;
	}
	public static void main(String[] args) {

		Test58 ob = new Test58();
		ob.circleArea(10);
		ob.write("��");
	}

}
