package com.day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

//���� ����
//���� ����? "d:\\doc\\test.txt"
//��� ����? "d:\\doc\\out2.txt"
//����Ϸ�
//��ĳ�� �Ἥ �Է°� �޾Ƽ� �ֱ�

public class Test7day17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str1, str2;
		int data;//in.read�� int��
		
		try {
			System.out.print("���� ����?");
			str1 = sc.next();
			
			System.out.println("��� ����?");
			str2 = sc.next();
			
			FileInputStream fis = new FileInputStream(str1);//����
			FileOutputStream fos = new FileOutputStream(str2);//����
			
			while((data = fis.read()) != -1) {
				
				//data = sc.nextInt();
				//System.out.write(data);
				//System.out.flush();
				
				fos.write(data);
				fos.flush();
				
			}
			fis.close();
			fos.close();
			System.out.print("����Ϸ�");
			
		} catch (Exception e) {
			
		}
	}

}
