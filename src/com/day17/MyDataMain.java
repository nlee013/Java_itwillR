package com.day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyDataMain {

	public static void main(String[] args) throws Exception{

		FileOutputStream fos = new FileOutputStream("d:\\doc\\data.txt");
		
		//����ȭ �����͸� �������� ���ؼ� �Ʒ��ڵ��(���α�) ���
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new MyDataVO("nayoung", 25));
		oos.writeObject(new MyDataVO("yulgon", 27));
		oos.writeObject(new MyDataVO("hyemin", 27));
		oos.writeObject(new MyDataVO("jongwon", 27));
		
		oos.close();
		fos.close();//����ȭ ��
		System.out.println("����ȭ ����!\n");
	
		//������ȭ//���� fis ������ ��밡���ϹǷ� �� ������� �ۼ��Ѵ�.
		FileInputStream fis = new FileInputStream("d:\\doc\\data.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		MyDataVO ob = null;
		
		try {
			while(true) {
				
				ob = (MyDataVO)ois.readObject();//MyDataVO�� ����ȯ -> downCast
				
				if(ob == null) {
					break;
				}
				System.out.println(ob.toString());
			}
			
		} catch (Exception e) {
			
		}
		ois.close();
		fis.close();
		//list�� iterator�� ������ ��
	}

}
