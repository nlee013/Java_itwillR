package com.score2Impl;

import java.util.Scanner;

import com.score2.Ranking;

public class Score2Impl implements Score2{

	private int inwon;
	private Ranking[] rk;
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void set() {
		
		do {
			System.out.print("�ο���?: ");//3
			inwon = sc.nextInt();
			
		}while(inwon < 1 || inwon > 10);
		
		rk = new Ranking[inwon];
	}

	@Override
	public void input() {
		String[] title = {"Korean","English","Mathematics"};
		
		for(int i = 0; i < inwon; i++) {
			
			rk[i] = new Ranking();
			
			System.out.print("Type your name: ");
			rk[i].name = sc.next();
			
			for(int j = 0; j < 3; j++) {//score
				
				System.out.print(title[j]);
				rk[i].score2[j] = sc.nextInt();
				rk[i].tot += rk[i].score2[j];	
			}
			rk[i].ave = rk[i].tot/3;	
		}
	
	}

private String judging(int score) {
		
		String jud = "";
		

		switch(score/10) {
		
		case 100:
		case 9: 
		jud = "��"; break;
		
		case 8: 
		jud = "��"; break;

		case 7: 
		jud = "��"; break;
		
		case 6: 
		jud = "��"; break;
		
		default: 
		jud = "��"; break;
					
		}
		return jud;
	}

	@Override
	public void print() {
		
		for(int i = 0; i < inwon; i++) {
			
			System.out.printf("%6s", rk[i].name);
			
			for(int j = 0; j < 3; j++) {
				
				System.out.printf("%4d (%2s)", rk[i].score2[j], judging(rk[i].score2[j]));		
			}
			System.out.printf("%4d", rk[i].tot);
			System.out.printf("%4d", rk[i].ave);
		}
	}
}
