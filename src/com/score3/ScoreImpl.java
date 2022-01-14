package com.score3;

import java.util.Scanner;

//�ݵ�� ���� -> implements
public class ScoreImpl implements Score{

	private int inwon;
	private Record[] rec;
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void set() {//scanner �־�ߵ�
		
		do {
		System.out.println("How many people want to type in here: ");
		inwon = sc.nextInt();
		
		}while(inwon < 1 || inwon > 10);
		
		rec = new Record[inwon];	
	}

	@Override
	public void input() {//scanner �־�ߵ�
		//�ݺ���
		for(int i = 0; i < inwon; i++) {
			
			rec[i] = new Record();
			
			System.out.println("Type your �й�: ");
			rec[i].hak = sc.next();
			
			System.out.println("Type your name: ");
			rec[i].name = sc.next();
			
			System.out.println("Type your score of Korean: ");
			rec[i].kor = sc.nextInt();
			
			System.out.println("Type your score of English: ");
			rec[i].eng = sc.nextInt();

			System.out.println("Type your score of Mathematics: ");
			rec[i].mat = sc.nextInt();
			
			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			
			rec[i].ave = rec[i].tot/3;
		}
	}

	private String panjug(int score) {
		
		String pan = "";
		
		switch(score/10) {
		
		case(10):
		case (9): pan = "A"; break;
		case (8): pan = "B"; break;
		case (7): pan = "C"; break;
		case (6): pan = "D"; break;
		default : pan = "F"; break;
		
		}
		return pan;
	}
	
	@Override
	public void print() {
	//�й� �̸� ����(����) ����(����) ����(����) total average
		
		String[] title = {"  �й�   Name   Korean   English   Mathematics   Total   Average"};
		
		for(int i = 0; i < inwon; i++) {
			
			System.out.println(title[i]);
	
			System.out.printf("%4s %5s %4d(%2s) %4d(%2s) %4d(%2s)"
					, rec[i].hak, rec[i].name
					, rec[i].kor, panjug(rec[i].kor)
					, rec[i].eng, panjug(rec[i].eng)
					, rec[i].mat, panjug(rec[i].mat));
			
			
			System.out.printf("%4d %4d", rec[i].tot, rec[i].ave);
			}
		}
	}

