package com.day6assign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd {
	
	int numb;
	String str = "";
	
	public void input() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Type numbers");
		
		numb = Integer.parseInt(br.readLine());
	}
	
	public String result() {
		
		if(numb%2 == 0) {
			str = "Even number";
		}
		else {
			str = "Odd number";
		}
		return str;
	}
	
	public void print(String strr) {
		System.out.println(numb + ":" + str);
	}
	
}
