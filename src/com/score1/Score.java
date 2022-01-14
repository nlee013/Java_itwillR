		package com.score1;

import java.util.Scanner;

public class Score {
	
	//int[] inwon; -> inwon�̶�� �迭 ����(����� ������)
	
	int inwon;
	
	//Record[] rec = new Record[3];	
	Record[] rec; //-> rec ��� �迭 ����("). �ʱⰪ null��
	
	Scanner sc = new Scanner(System.in);

	public void set() {
		
		do {
			System.out.print("�ο���?: "); //3
			inwon = sc.nextInt();
			
		}while(inwon < 1 || inwon > 10);
		
		rec = new Record[inwon];
	}
	
	//void�� ��ȯ���� ����.
	public void input() {
		
		String[] title = {"Korean", "English", "Mathematics"};
		
	//--------- �� �ڵ带 �����ϴ� �ڵ�� for��
		for(int i = 0; i < inwon; i++ ) {
				
		rec[i] = new Record(); //rec[i] = new Record(); -> Record�� rec �� �ȿ� [0] ù��° �濡 name ���� �ֱ� ���� ����
		
		System.out.print("Type your name: "); //nayoung
		rec[i].name = sc.next();
		
		for(int j = 0; j < 3; j ++) {
		
			System.out.print(title[j]); //50
			rec[i].score[j] = sc.nextInt();
			
			rec[i].tot += rec[i].score[j]; //������ �����̴ϱ� += �� ǥ��.
		}
		
		rec[i].ave = rec[i].tot/3;	
		
	 }
	}
	
	private void ranking() {//
		
		int i, j;
		
		for(i  = 0; i < inwon; i++ ) {
		
			rec[i].rank = 1;
		}
		
		//selection sort
		
		for(i = 0; i < inwon-1; i++) {
			
			for(j=0; j< inwon; j++) {
				
				if(rec[i].tot > rec[j].tot) {
					rec[j].rank++;
				}else if(rec[i].tot < rec[j].tot) {
					rec[i].rank++;
					
				}
			}
		}
	}
	
	public void print() {
		
		ranking(); //method�ȿ��� method ȣ�� ����.
				   //ranking�� private���� ��������� ���� print method������ ȣ���� ����.
		
		for(int i = 0; i < inwon; i++) {
			
			System.out.printf("%6s", rec[i].name);
			
			for(int j = 0; j < 3; j++) {
				
				System.out.printf("%4d", rec[i].score[j]);
			}
			
			System.out.printf("%4d", rec[i].tot);
			System.out.printf("%4d", rec[i].ave);
			System.out.printf("%4d\n", rec[i].rank);
		}
	}
	
}
