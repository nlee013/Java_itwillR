package com.day6;

//Class�� ����� ������ ���뼺 ����.
//���������� ���� �ٲ�� method�� ���������� �� �ٲ�
//instance����
//return���� ���� �� void�� ǥ�� -> void�� return���� �ʿ����


public class Test33 {

	public static void main(String[] args) {
		//��ü ����
		Rect r1 = new Rect();
		
		r1.input();
		int a = r1.area();
		
		r1.length();
		int l = r1.length();
		
		r1.print(a, l);
	}

}
