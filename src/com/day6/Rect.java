package com.day6;

import java.util.Scanner;

public class Rect {

	int w, h; //�������� = ��� ������ �� ��밡���� ����
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		//int w, h; //��������
		
		System.out.print("Type a measure of width: ");
		w = sc.nextInt();
		
		System.out.print("Type a measure of height: ");
		h = sc.nextInt();
		
		return; //void�� ���� ����.return�� method�� ������ ��
	}
	public int area() {
		
		int result;
		result = w*h;
		
		return result;
	}
	//���� area �ڵ带 �Ʒ� length �ڵ�� �����ϰ� ���� ����.
	public int length() {
		
		return (w+h)*2;
	}
	
	public void print(int a, int l) {
		System.out.println("Width:" + w);
		System.out.println("Height:" + h);
		System.out.println("Area:" + a);
		System.out.println("Length:" + l);

	}
	
}
