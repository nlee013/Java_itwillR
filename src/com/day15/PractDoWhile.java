package com.day15;

import java.io.IOException;
import java.util.Scanner;

public class PractDoWhile {

	public static void main(String[] args) throws IOException {
		
	Scanner sc = new Scanner(System.in);
	char str;
	
	do {			
		System.out.print("����?[w,m]");//w
		str = (char)System.in.read();
		System.in.skip(2);
		
	}while(str!='m'&&str!='w');
	
	System.out.println(str + "---");
	}
}
