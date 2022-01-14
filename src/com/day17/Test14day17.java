package com.day17;

import java.io.File;
import java.io.FileFilter;

//FileFilter

class MyFilterList implements FileFilter{

	private File f;//f->�ʼ� ����
	
	//������ ���� ��, String filePath��� ��θ� �ش�.
	//��ü�� �� ���� �� ������ �Ѱ���
	public MyFilterList(String filePath) {//Spring���� ������ �ӽñ�?�̴�
		
		f = new File(filePath);
	}
	
	//���� �׳� ����� method
	public void result() {
		
		try {
			if(!f.exists()) {
				System.out.println("File is not exist.");
				return;//�� �̻� �������� ����
			}
			System.out.println("���� ���: " + f.getAbsolutePath());
			System.out.println("File size: " + f.length());
			
			//������� directory�� �����޶�
			String p = System.getProperty("user.dir");
			System.out.println("���� ������Ʈ ���: " + p);
			
			//����
			if(f.isDirectory()) {
				
				//���� ��������:���Ͽ� ���� ������ this�� �ҷ�����
				//File[] lists��� �迭�� ����ִ´�
				File[] lists = f.listFiles(this);//accept
				System.out.println("������ ����...");
				
				for(int i = 0; i < lists.length; i++) {
					
					System.out.print(lists[i].getName());
					System.out.println("\t" + lists[i].length());
				}
			}
			
			//�� ��Ƽ�� �̸� -> C:,D:�� ���� ����̺� �� ���
			System.out.println("Eaxh partion name...");
			File[] root = File.listRoots();
			
			for(int i = 0; i < root.length; i++) {
				System.out.println(root[i].getPath());
			}
		} catch (Exception e) {
			
		}
	}
	
	@Override
	public boolean accept(File pathname) {
		
		//File pathname -> ���Ͽ� �ִ� ������ ���� ��
		return pathname.isFile() || pathname.isDirectory();//isDirectory(); -> ������ ���� ��
	}	//interface�� ���������� ������ override �ؾߵ�
}

public class Test14day17 {

	public static void main(String[] args) {

		MyFilterList m = new MyFilterList("d:\\doc");
		MyFilterList m2 = new MyFilterList("c:\\windows");//���� ���ϵ� �� ������
		
		m.result();
		m2.result();
	}
}
