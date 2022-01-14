package com.day6;

import java.util.Scanner;

public class Rect {

	int w, h; //전역변수 = 모든 곳에서 다 사용가능한 변수
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		//int w, h; //지역변수
		
		System.out.print("Type a measure of width: ");
		w = sc.nextInt();
		
		System.out.print("Type a measure of height: ");
		h = sc.nextInt();
		
		return; //void일 때는 생략.return은 method를 끝내게 함
	}
	public int area() {
		
		int result;
		result = w*h;
		
		return result;
	}
	//위의 area 코드를 아래 length 코드로 간편하게 많이 쓰임.
	public int length() {
		
		return (w+h)*2;
	}
	
	public void print(int a, int l) {
		System.out.println("Width:" + w);
		System.out.println("Height:" + h);
		System.out.println("Area:" + a);
		System.out.println("Length:" + l);

	}
	
}
