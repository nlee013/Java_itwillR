/*package com.day16;

import java.util.Random;
import java.util.Scanner;

class MyRandom extends Thread{
	
	Scanner sc = new Scanner(System.in);
	
	private int inwon;
	
	private int []type;
	
	private static String[] name =
		{"�����","��  ��","������","������","������",
		"�ڰ���","������","�缼��","��â��","������",
		"������","������","������","�輺��","ä����",
		"������","������","�̳���","���ȯ","���Ѽ�"};
	
	public MyRandom(String[] name) {
		
		this.name = name;
	
	}
	
	@Override
	public void run() {
	
		for(int i = 0; i <= 10; i++) {
			System.out.println(".");
		
			try {
				Thread.sleep(100);
			}catch (Exception e) {
				
			}
		}
		do {
			System.out.print("�ʰԱ��� ������ ��� �ο���?: ");
			inwon = sc.nextInt();
			
		}while(inwon > name.length || inwon < 1);
		
		
			//Random rd = new Random();
			while(type[] < inwon) {
				
				type[] = rd.toString();
				
				for(int i = 0; i < name.length; i ++) {
					
					name[i] = sc.next();
				}
			}	
	}
	
	
}
public class Day16Assign2 {
	
		public static void main(String[] args) {

			MyRandom r1 = new MyRandom(100, "ù��°:");
			r1.start();

			//Thread r1 = new Thread(new MyRandom(num, inwon, name));
			
			//r1.start();
			
			System.out.print("�����");
			//System.out.println("�����մϴ�!!, ���Ƽ� �����սô�!"
			//		+ "\n��ǥ��: " + name);
		}
}
*/