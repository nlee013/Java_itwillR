package com.day17;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//InputStreamReader:1byte Stream�� 2byte Stream���� ��ȯ���ִ� Stream.
//Bridge Stream�̶�� �� 
public class Test3day17 {

	public static void main(String[] args) throws IOException {

		int data;
		System.out.println("Type characters: ");
		
		//ȥ�� ���������� ���X.��� ��򰡿� �־���ߵ�
		//java�� ������ ����Ұ� ����-> Reader: ���� �ƹ��ų� �� ����������
		Reader rd = new InputStreamReader(System.in);//������ �ִ� BufferedReader
		
		while((data = rd.read()) != -1) {
			
			char ch = (char) data;
			System.out.print(ch);
		}
	}

}
