package com.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test8day17 {

	public boolean fileCopy(String str1, String str2) {
		
		File f = new File(str1);//��������(����) ���.���� ����(���� ��������)
		
		if(!f.exists()) {//-> ������ ������~. f.exists()-> ������ ������~. 
		return false;
		}
		
		try {
		//***������ �ްų� ������ �� ����ϴ� �ڵ��̹Ƿ� ������ ����ϱ�!!!
			//���� ���� ���� �� ����. ���� ���� �Ұ�
			FileInputStream fis = new FileInputStream(f);//������ str1
			FileOutputStream fos = new FileOutputStream(str2);
			
		//***������ �ްų� ������ �� ����ϴ� �ڵ��̹Ƿ� ������ �ܿ��!!!**�������*
			int data = 0;
			
			byte[] buffer = new byte[1024];//1024���� buffer(�迭)�� ����.
			
			while((data = fis.read(buffer, 0, 1024)) != -1) {//�ѹ� ó�� �� ������ 1024���� �ϳ��� �� ����
				fos.write(buffer, 0, data);
		////***������ �ްų� ������ �� ����ϴ� �ڵ��̹Ƿ� ������ �ܿ��!!!**�������*
			}
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return true;
		
	}
	public static void main(String[] args) {

		Test8day17 ob = new Test8day17();
		
		if(ob.fileCopy("d:\\doc\\test.txt", "d:\\doc\\out3.txt")) {
			
			System.out.println("���� ���� ����!");
		}else {
			System.out.println("���� ���� ����!");
		}
		
	}

}
