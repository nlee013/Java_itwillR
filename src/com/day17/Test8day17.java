package com.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test8day17 {

	public boolean fileCopy(String str1, String str2) {
		
		File f = new File(str1);//오리지날(원본) 경로.파일 관리(내용 수정못함)
		
		if(!f.exists()) {//-> 파일이 없으면~. f.exists()-> 파일이 있으면~. 
		return false;
		}
		
		try {
		//***파일을 받거나 내보낼 때 사용하는 코딩이므로 무조건 기억하기!!!
			//파일 내용 수정 다 가능. 파일 삭제 불가
			FileInputStream fis = new FileInputStream(f);//원래는 str1
			FileOutputStream fos = new FileOutputStream(str2);
			
		//***파일을 받거나 내보낼 때 사용하는 코딩이므로 무조건 외우기!!!**여기부터*
			int data = 0;
			
			byte[] buffer = new byte[1024];//1024개의 buffer(배열)가 생성.
			
			while((data = fis.read(buffer, 0, 1024)) != -1) {//한번 처리 할 때마다 1024개를 하나씩 다 꺼냄
				fos.write(buffer, 0, data);
		////***파일을 받거나 내보낼 때 사용하는 코딩이므로 무조건 외우기!!!**여기까지*
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
			
			System.out.println("파일 복사 성공!");
		}else {
			System.out.println("파일 복사 실패!");
		}
		
	}

}
