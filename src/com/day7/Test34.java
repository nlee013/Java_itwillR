package com.day7;

//cpu���� ���α׷� ���� ��ŭ thread������
//Heap�ȿ� method�� �����ϴ� ������ method ����
//���� : �ϳ��� file���� �ϳ��� class �� ��
//���� �ϳ��� file�� �ΰ��� class�� �����.

//method�� ó�� ���� �� �ϳ��� ����.

//main���� �� ���� public�� �����ؾ� VM(Virtual Machine)��
//main���θ� ã�ư� �ν��ϱ� ����
//class������ bin ������ �ְ� class������ 2�� ����� bin�������� 2�� ����

//public class �ۿ� ��� �����ϰ� �ȿ� �ᵵ ����
	class SubClass{
		int a; // instance variable ����
		int b;
	}
public class Test34 {
	
	public static void main(String[] args) {

		SubClass ob1 = new SubClass();
		SubClass ob2 = new SubClass();
		
		System.out.println("on1.a:" + ob1.a + "\ton1.b" + ob1.b);
		System.out.println("on2.b:" + ob2.b);
		
		//�޸� ������ ���� �����
		ob1.a = 10;
		ob1.b = 20;
		
		System.out.println("on2.a:" + ob2.a);
		System.out.println("on2.b:" + ob2.b);
		
		ob2.a = 100;
		ob2.b = 200;
		
		System.out.println("on1.a:" + ob1.a);
		System.out.println("on1.b:" + ob1.b);
	}

}
