package com.day12;

class TestA{
	
	public void print() {
		System.out.println("A class...");
	}
}

class TestB{
	public void print() {
		System.out.println("B class...");
	}
}
public class Test61 {

	public static void main(String[] args) {

		TestA a = new TestA();//��ü���� a �ּ���
		TestB b;//����
		
		//b = a; ->�ȵ�. �׸��� �ٸ� 
		//b =(TestB)a ->����ȯ�� �ȵ�.
		//�Ѵ� Data type�� �ٸ�. TestB-> TestA�� �����ϸ� ����.
	}

}
