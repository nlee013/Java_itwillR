package com.day17;

import java.io.FileInputStream;

//�߿�
//������ �о����:FileInputStream

public class Test5day17 {

	public static void main(String[] args) {

		
		try {
			//��� �� �� �ݵ�� \\ �ΰ�.��½� \1���� ����
			FileInputStream fis = new FileInputStream("d:\\doc\\test.txt");
			
			int data;
			while((data = fis.read()) != -1) {
			//System.out.print((char)data); ������ ������ ������ ������ character�� ������ �ȵȴٴ� �ǹ�
			
			System.out.write(data);
			System.out.flush();//System�� ������ data�� �о�� ���� flush()
			}
			fis.close();//�����Ⱚ�� ���� �ʰ� �ݾ���
		} catch (Exception e) {

			System.out.println(e.toString());
		}
	}

}
