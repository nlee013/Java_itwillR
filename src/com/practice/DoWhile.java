package com.practice;

import java.io.IOException;
import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		do {
			System.out.println("����? [��, ��]");
			str = sc.next();
			//System.in.skip(2);
			
		}while(str.equals(str));
		
		System.out.println(str + "----");
	}

}
