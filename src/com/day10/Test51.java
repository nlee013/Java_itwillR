package com.day10;
//StringBuffer : ����ȭ�� �����ϴ� ��
//StringBuilder : ����ȭ�� �������� �ʴ� ��
//����ȭ�� �����ϴ� �ִ� ����ȭ�� �������� �ʴ� �ֺ��� �����(�� �� �ɸ���)

public class Test51 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();//�ּҹ����� ����� data�� ������
		
		sb.append("Seoul");
		sb.append("Busan");
		
		System.out.println(sb);
		
		String str = sb.toString();//to String�� string���� �ٲ�� ��� �ǹ�
		System.out.println(str);//�����Ⱚ�� ������ �ʴ´�
		
		
	}

}
