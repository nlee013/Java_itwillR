package com.day17;

import java.io.FileOutputStream;

//중요
//파일 내보내기: FileOutputStream
public class Test6day17 {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\test.txt");
			
			int data;
			//사용자가 입력한 값을 내보낼 것이다
			System.out.print("Type characters: ");//ahah
			//값을 입력하고 enter누르고 ctrl + z(실행한 프로그램 종료)
			
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
