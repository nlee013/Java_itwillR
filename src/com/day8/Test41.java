package com.day8;

//������
//����� ����: 1) ��ü ���� 2) class ���� �ʱ�ȭ ����
//1) ��ü ���� -> �޸� �Ҵ��� ���� �� ����� �ϰ� �����ڴ� class�� �̸��� ����.
//return ���� ���� ���� property(void ���� �ڸ�)�� �ʿ����
//�����ڴ� �ߺ����� (overloading)�� ����.
//������ �ȿ��� �ٸ� �����ڸ� ȣ�� ����
//ȣ�� ��, ���� ���ο����� ȣ�� ����

public class Test41 {
	
	private int x;
	
	public Test41() {//�⺻ ������(�׻� ������)
		
		this(50);//���� class�̸��� ���� ���ϹǷ� this ���. ������ ���ο��� ȣ�Ⱑ��
		System.out.println("�⺻ ������...");
		
		x = 10;
		System.out.println("x: " + x);
	}
	
	//�����ڴ� �ߺ����� (overloading)�� ����.
	public Test41(int x) {
		System.out.println("Overloading�� ������...");
		
		this.x = x;
		System.out.println("x: " + x);

	}
	
	public static void main(String[] args) {

		Test41 ob1 = new Test41(); //-> �⺻ �����ڿ��� ������ ��.
		Test41 ob2 = new Test41(50);
	}

}
