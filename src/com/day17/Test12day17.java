package com.day17;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import com.day8.Data;

//File class
//File �� ������ ���� �� �� �ֵ��� ����� �������ִ� class
//File�� ���� �Ǵ� �̸� ���� ���� ������ �� ��쿡�� ���� ��
//File�� ������ ����� �ϱ� ���� method�� �������� �ʴ´�

public class Test12day17 {

	public static void main(String[] args) throws IOException {

		 File f = new File("d:\\doc\\test.txt");
		 
		 System.out.println("File name: " + f.getName());
		 System.out.println("File length: " + f.length());
		 System.out.println("File path: " + f.getAbsolutePath());
		 System.out.println("ǥ�� path: " + f.getCanonicalPath());
		 System.out.println("Crreated date: "  + new Date(f.lastModified()));
		 System.out.println("File ���� path: " + f.getParent());
		 System.out.println("�б� �Ӽ�: " + f.canRead());
		 System.out.println("���� �Ӽ�: " + f.canWrite());
		 
	}

}
