package com.day17;

import java.io.FileInputStream;

//중요
//파일을 읽어오기:FileInputStream

public class Test5day17 {

	public static void main(String[] args) {

		
		try {
			//경로 쓸 때 반드시 \\ 두개.출력시 \1개로 보임
			FileInputStream fis = new FileInputStream("d:\\doc\\test.txt");
			
			int data;
			while((data = fis.read()) != -1) {
			//System.out.print((char)data); 파일이 깨져서 나오기 때문에 character로 읽으면 안된다는 의미
			
			System.out.write(data);
			System.out.flush();//System도 마지막 data를 읽어내기 위해 flush()
			}
			fis.close();//쓰레기값이 들어가지 않게 닫아줌
		} catch (Exception e) {

			System.out.println(e.toString());
		}
	}

}
