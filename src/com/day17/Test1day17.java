package com.day17;

import java.io.IOException;

//Stream:������ Pipe Line
//->Data ����½�, ��� data�� ���¿� ������� �Ϸõ� �帧���� �����ϴ� ��
//�� �ʹ��⿡�� �������� �����Ϳ� �����µ� �����Ϳ� ���� stream������ ����������

//java���� ���� �⺻ Stream : in->����ڰ� �Է��� ���� �о�´�
public class Test1day17 {

	public static void main(String[] args) throws IOException {

		int data;
		System.out.println("Type characters:");//adhkl0001
		//try catch������ �ص� ��.���⼭�� throws IOException�� ó��.
		while((data = System.in.read()) != -1) {// -> ����ڰ� �Է��� ���� �о�´�.
												// 2byte �ѱ��� �о����
			
			char ch = (char)data;
			System.out.print(ch);
		}
	}

}
