package com.day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

//파일 복사
//원본 파일? "d:\\doc\\test.txt"
//대상 파일? "d:\\doc\\out2.txt"
//복사완료
//스캐너 써서 입력값 받아서 넣기

public class Test7day17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str1, str2;
		int data;//in.read가 int라서
		
		try {
			System.out.print("원본 파일?");
			str1 = sc.next();
			
			System.out.println("대상 파일?");
			str2 = sc.next();
			
			FileInputStream fis = new FileInputStream(str1);//원본
			FileOutputStream fos = new FileOutputStream(str2);//복사
			
			while((data = fis.read()) != -1) {
				
				//data = sc.nextInt();
				//System.out.write(data);
				//System.out.flush();
				
				fos.write(data);
				fos.flush();
				
			}
			fis.close();
			fos.close();
			System.out.print("복사완료");
			
		} catch (Exception e) {
			
		}
	}

}
