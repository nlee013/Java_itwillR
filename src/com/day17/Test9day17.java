package com.day17;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test9day17 {

	public static void main(String[] args) {

		try {
		FileInputStream fis = new FileInputStream("d:\\doc\\test.txt");
		
		//���� system.in(����ڰ� �Է��� ��)�� �ƴ� ����(�о�� ����)fis�� �ֱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		String str;
		
		//���ڴ� -1.���ڴ� null(data�� ���� ������ �����ض�)
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
		fis.close();
		}catch (Exception e) {
			
		}
	}

}
