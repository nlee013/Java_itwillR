package com.score5;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Score ob = new ScoreImpl();
		
		int ch;
		
		while(true) {
			
			do {
				
				System.out.print("1) Type 2) Print 3) Delete 4) Revise" +
								 " 5) Search �й� 6) Search Name 7) Exit: ");
				ch = sc.nextInt();
				}while(ch < 1);
			
			switch(ch) {
			
			case 1:ob.input(); break;
			case 2: ob.print(); break;
			case 3: ob.delete(); break;
			case 4: ob.update(); break;
			case 5: ob.findHak(); break;
			case 6: ob.findName(); break;
			default :  System.out.print("The End"); System.exit(0);//��Ҵ� �Ƹ� exit(1);�̴�
			
			}
		}
	}
}
