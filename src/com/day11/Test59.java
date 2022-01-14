package com.day11;
//�߿��� ��

//�߻� abstract class:
//�޸𸮿� ���� ���� class�� method�� �̸� �����ϴ� ��
//method�� ������ �ؼ� ���
//abstract class���� �ݵ�� 1�� �̻��� abstract method�� �־�ߵ�
//abstract class �ȿ� �Ϲ� method�� ���� ����

abstract class ShapeClass{//�߻� class
	
	public abstract void draw(); //�߻� method

}

class Circle extends ShapeClass{//�߻� method�� ����ϸ�
								//�ݵ�� override �ؾߵ�
	
	@Override
	public void draw() {
		System.out.println("���� �׸���...");
	}
	
}

class Rect extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("�簢���� �׸���...");
	}
	
}
class Tri extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("�ﰢ���� �׸���...");
	}
}

public class Test59 {

	public static void main(String[] args) {

		Circle c = new Circle();
		Rect r = new Rect();
		Tri t = new Tri();
		
		c.draw();
		r.draw();
		t.draw();
		
		
	}

}
