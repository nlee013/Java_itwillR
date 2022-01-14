package com.day17;

import java.io.File;
import java.io.FileOutputStream;

public class Test13day17 {

	public static void main(String[] args) {

		String str = "d:\\doc\\temp\\java1\\itwill.txt";
		
		//1�� ���
		/*String path = str.substring(0, str.lastIndexOf("\\"));//�ڿ������� \\�� ã�Ƽ� path�� ��
		//System.out.println(path);//Ȯ��
		
		//���־���!!***��θ� ã�Ƽ� �Է��Ѵ�.
		File f = new File(path);
		
		if(!f.exists()) {
		
			f.mkdirs();//make directory
		}
		*/
		
		//2�� ���
		File f = new File(str);
		
		if(!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();
		}
		
		//����
		try {
			
			FileOutputStream fos = new FileOutputStream(str);
			
			int data;
			System.out.println("Type characters: ");
			
			while((data = System.in.read()) != -1) {
				
				fos.write(data);
				fos.flush();
			}
			fos.close();
			System.out.println("�Է� ����!");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
