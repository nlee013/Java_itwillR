package com.day17;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Test10day17 {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out4.txt");
			
			//PrintStream(�������� stream)�� ���Ѵ�(������)->�� ����� �� ����Ϸ��� ���� ��
			//PrintStream�� ���:test11day17
			PrintStream ps = new PrintStream(fos);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Type characters: ");
			
			String str;
			
			while((str = br.readLine()) != null) {
				
				ps.println(str);
			}
			ps.close();
			fos.close();
			System.out.println("�Է� ����!");
			
		} catch (Exception e) {
			
		}
	}

}
