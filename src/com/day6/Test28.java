package com.day6;

import java.util.Scanner;

//10�� �̳��� �̸��� ������ �Է¹޾� ���� ���ϱ�

public class Test28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//ranking selection sort�� �����
		//new�� ����� �⺻������ �ʱⰪ�� ��
				
		String[] name;
		int[] score;
		int[] rank;

		int i, j, inwon;
		
		do {
			System.out.println("Type how many member you want: ");
			inwon = sc.nextInt();
		}while(inwon < 1 || inwon > 10);
		
		//�迭�� �޸� �Ҵ��� �Ѵ�
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];
		
		for(i = 0; i < inwon; i++) {
			System.out.print(((i+1) + "��°" + "\tType your name: "));
			name[i] = sc.next();
			
			System.out.print("Type your score: ");
			score[i] = sc.nextInt();
		}	
		
		//���� �ʱ�ȭ
		for(i = 0; i < inwon; i++) {
			
		rank[i] = 1;
		
		}
		
		//���� ���
		for(i = 0; i < inwon; i++) {//0 1 2
			for(j = i + 1; j < inwon; j++) {//1 2 3
				if(score[i] < score[j]) { //0 1 -> 10 20 
					
					rank[i]++;
				  //rank[i] = score[i+1]; //1 + 1 = 2
				}
				else if(score[i] > score[j]){//0 1 -> 20 10
					
					rank[j]++;//1
				}
			}
		}
		
		//���
		for(i = 0; i < inwon; i++) {
			System.out.printf("Name:%6s Score:%4d Rank:%4d\n", name[i], score[i], rank[i]);
		}
	}
}


