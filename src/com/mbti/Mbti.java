package com.mbti;

import java.util.Scanner;

public class Mbti {

	int inwon;
	
	Mbti16[] m;
	
	Scanner sc = new Scanner(System.in);
	
	public void set() {
		
		do {
			System.out.print("�������� ���� �ο����� �Է����ּ���.");
			inwon = sc.nextInt();
		}while(inwon < 1 || inwon > 10);
		
		m = new Mbti16[inwon];
	}
	
	public void input() {
		String[] Q = {"����� ���ΰ��迡 �־ Ȱ������ ���ΰ���? [Y/N]: ",
					"����� ���縦 �߽��ϱ� ���� �̷� �������ΰ���? [Y/N]: ",
					"����� ����� ���� ���� ���ǰ� ��ǿ� �ְ����� �δ� ���ΰ���? [Y/N]: ",
					"����� ö���� ���� ��ȹ�� ü�������� ����� ���ΰ���?"};
		for(int i = 0; i < inwon; i++) {
			m[i] = new Mbti16();
			
			System.out.print("����� �̸��� �Է��ϼ���. ");
			m[i].name = sc.next();
			
			for(int j = 0; j < 4; j++) {
				
				System.out.print(Q[i]);
				m[i].Qs[j] = sc.next();
				
				//if() {
					
				}
			}
		}
	
	}
	

