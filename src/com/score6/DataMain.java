package com.score6;

import java.util.Scanner;

public class DataMain {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		
		Data dt = new Data();
		
		int ch;//choice
		
		while(true) {
			
			do {
				System.out.println("Choolse one of 1)Type 2)Print 3)Exit");
				ch = sc.nextInt();

			}while(ch < 1);
			
			switch(ch) {
			
			case 1: 
				dt.input(); break;
			case 2: 
				dt.print(); break;
			default:
				//������ ���� method ���⿡ ����
				dt.saveData();
				System.out.println("The End");
				System.exit(0);
			}
		}
		
	}

}
