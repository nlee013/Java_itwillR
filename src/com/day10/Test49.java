package com.day10;

//String: string�� class�̴�(�ڷ����� �ƴϴ�)
//������ data�� ����ϰ� ��� �󵵴� ���� ������
//class�� �ڷ��� ó�� �����

//String data�� ������ equals�� ���ؾ� ��
//String�� �Һ��� ��Ģ�� ����: �� �� �޸� �� ����Ǹ� ����, ����, �ʱ�ȭ �Ұ���

//-> String�� class�̹Ƿ� ���� ���� �� ������ equals

public class Test49 {

	public static void main(String[] args) {

	String ob1 = "Seoul";
	String ob2 = "Seoul";
	String ob3 = new String("Seoul");//class�ϱ� ����ó�� ���� ����
	//new�� ���� ���� ������ ������ �����
	
	//String�� call by reference :data�� �Ȱ����鼭 �ּҸ� ���������� ���ؼ�(������)
	//�ּҸ� ���� ��������
	//���� �ڵ忡�� ==�� �ּ����� ���ϴ� ���̸�,
	//String data�� ������ equals�� ���ؾ� ��
	
	 System.out.println("ob1 == ob2: " + (ob1 == ob2));//true
	 System.out.println("ob1 == ob3: " + (ob1 == ob3));//false
	 //->�ּ� ��
	 System.out.println("ob1.equals(ob3): " + ob1.equals(ob3));//true
	 //-> �ּҿ� ����Ǿ��ִ� �� ��.
	 //String�� equals�� overriding�Ǿ��� ���� ����
	 
	 //equals & to String �Ѵ� override�� method�̴�.
	 
	 ob2 = "Korea";
	 System.out.println("ob1 == ob2: " + (ob1 == ob2));
	 //���ϴ� data�� ���� �ٸ��� ������ ����(�� �ּ�) ����
	 
	 ob2 = "UK";
	 System.out.println("ob1 == ob2: " + (ob1 == ob2));
	
	 //�ּҹ����� ����Ų ���� ���� ��(���� access���� ���� ��)
	 //garbage collector�̴�(������ ��)
	 
	 //������ ���� ������� method�� ���� ȣ���ؼ� ����� �����ߵ�
	 
	 ob2 = "Seoul";
	 System.out.println("ob1 == ob2: " + (ob1 == ob2));

	 System.out.println(ob2);//hash code X(�ȳ�����)
	 System.out.println(ob2.toString());//�ּҹ����� ����Ǿ� �ִ� �ڷ����� data�� ������   
	}
}
