package com.day17;

import java.util.Random;
import java.util.Scanner;

public class Day16Assign implements	Runnable{
	
	private static String[] name =
		{"�����","��  ��","������","������","������",
		"�ڰ���","������","�缼��","��â��","������",
		"������","������","������","�輺��","ä����",
		"������","������","�̳���","���ȯ","���Ѽ�"};
	
	private int[] type;
	
	public void RandomName(String[] name) {
		
		this.name = name;
	}
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int inwon, i = 0;
		
		do {
			System.out.println("���� �ʰԱ��� �ϰ� �� �ο���?: ");
			
			inwon = sc.nextInt();
			
		}while(inwon > name.length || inwon < 1);
		
		type = new int[inwon];
		
		while(i < inwon) {
			
			type[i] = rd.nextInt(20) + 1;
			
			for(int j = 0; j < i; j++) {
				
				if(type[i] == type[j]) {
					
					i--;
					break;
				}
			}
			i++;
		}
	}
	
	public void print() {
		
		System.out.println("�����մϴ�!! 8�� 50�б��� �����սô�!\n");
		
		for(int i = 0; i < type.length; i++) {
			
			System.out.printf("%d�� ������: %s \n", (i + 1), name[type[i]]);
		}
	}
	@Override
	public void run() {
		
		System.out.println("�����");
		
		int i = 0;
		
		while(i < 21) {
			System.out.print(".");
			
			try {
					Thread.sleep(100);
				} catch (Exception e) {
		}
		i++;
		}
	}	
	public static void main(String[] args) {
		
		Day16Assign ri = new Day16Assign();
		
		ri.input();
		ri.run();
		ri.print();
		//ri.setDaemon(true);
		
		
	}
}