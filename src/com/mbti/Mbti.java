package com.mbti;

import java.util.Scanner;

public class Mbti {

	int inwon;
	
	Mbti16[] m;
	
	Scanner sc = new Scanner(System.in);
	
	public void set() {
		
		do {
			System.out.print("질문지에 답할 인원수를 입력해주세요.");
			inwon = sc.nextInt();
		}while(inwon < 1 || inwon > 10);
		
		m = new Mbti16[inwon];
	}
	
	public void input() {
		String[] Q = {"당신은 대인관계에 있어서 활동적인 편인가요? [Y/N]: ",
					"당신은 현재를 중시하기 보다 미래 지향적인가요? [Y/N]: ",
					"당신은 사람과 관계 보다 진실과 사실에 주관심을 두는 편인가요? [Y/N]: ",
					"당신은 철저한 사전 계획을 체계적으로 세우는 편인가요?"};
		for(int i = 0; i < inwon; i++) {
			m[i] = new Mbti16();
			
			System.out.print("당신의 이름을 입력하세요. ");
			m[i].name = sc.next();
			
			for(int j = 0; j < 4; j++) {
				
				System.out.print(Q[i]);
				m[i].Qs[j] = sc.next();
				
				//if() {
					
				}
			}
		}
	
	}
	

