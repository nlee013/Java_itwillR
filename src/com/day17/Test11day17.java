package com.day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

//PrintStream�� ���:test11day17

public class Test11day17 {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out5.txt");
			PrintStream ps = new PrintStream(fos);
			
			ps.println("��");
			ps.println("��");
			ps.println("�ĳ�");
			
			ps.close();
			fos.close();

			//fos = new FileOutputStream("d:\\doc\\out5.txt");
			fos = new FileOutputStream("d:\\doc\\out5.txt", true);//true�� �����ض�//���ڿ� ������ append
			ps = new PrintStream(fos);
			
			ps.println("����");
			ps.println("����");
			ps.println("�� ��");

			ps.close();
			fos.close();
		} catch (Exception e) {
			
		}
	}

}
