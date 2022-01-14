package com.day10;

import java.util.GregorianCalendar;

//��� class�� �θ�� object.class�� �ڷ���.
//�ڹپȿ��� �ؿ� �ִ� class�麸�� Object�� ���� ū �ڷ����̴�.
//Class Object is the root of the class hierarchy. Every class has Object as a superclass.
//All objects, including arrays, implement the methods of this class.

class TestA /*extends Object�� ������ ��*/{
	private int a = 10;
	
	public void write() {
		System.out.println("a: " + a);
	}
}

public class Test48 {//object�� method: equals(object) & to string()�� ���� ���� ���

	public static void main(String[] args) {

		//Calendar now = new GregorianCalendar();-> ���߿� interface ���� �˰� �� �� ���ص� ����
		
		TestA ob1 = new TestA();
		TestA ob2 = new TestA();
		//ob1�� ob2�� ���ÿ� ���� �Ұ� �׷��� write()�� ���� ���� ���� ���
		
		System.out.println("ob1 == ob2: " + (ob1 == ob2));//false
		//�ּ� ���� ��
		
		System.out.println("ob1.equals(ob2): " + ob1.equals(ob2));//false
		//���� ���� ��
		//-> equals�� TestA�� �θ��� method�̰� Object�� equals�� �θ��̹Ƿ� extends Object�� ������
		
		System.out.println("ob1: " + ob1);//�޸��� ù ��° �ּ�-> hash code
		System.out.println("ob2: " + ob2);//�޸� �ּ�
		System.out.println("ob1.toString(): " + ob1.toString());
		//-> �ڷ����� �����̵� �״�� string���� ������
		//toString�� �θ� Object�̸�, ��ȯ���� string��

	}

}
