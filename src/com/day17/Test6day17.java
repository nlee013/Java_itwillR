package com.day17;

import java.io.FileOutputStream;

//�߿�
//���� ��������: FileOutputStream
public class Test6day17 {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\test.txt");
			
			int data;
			//����ڰ� �Է��� ���� ������ ���̴�
			System.out.print("Type characters: ");//ahah
			//���� �Է��ϰ� enter������ ctrl + z(������ ���α׷� ����)
			
			while((data = System.in.read()) != -1) {
				
				fos.write(data);
				fos.flush();
			}
			fos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
