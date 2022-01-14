package com.day5;

import java.util.Scanner;

public class Test24 {

	public static void main(String[] args) {

		//���� �޷� ����� -> ������ ���� �Է½� �޷� ���·� ���.
		
		//����ڿ��� ������ ���� ���� �� ->scanner
		
		Scanner sc = new Scanner(System.in);
		
//		int[] months = new int[12];
		
//		months[0] = 31;
//		months[1] = 28;
//		... 12�� ����� ������, ������ �ٸ� ����� �Ʒ��� ����
		
		//���� ��¥���� �迭�� ����
		int[] months = {31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
		
		int y, m, d, w, i; //year month day week int i
		
		do {
			//����ڰ� � ���ڸ� �Է����� �𸣹Ƿ� do while�� ����
			
			System.out.println("Type any year: "); //2021
			y = sc.nextInt();
			
		}while(y < 1); //1���� ���� ���� ����
		
		do {
			System.out.print("Type any month: ");
			m = sc.nextInt();
			
		}while(m < 1 || m > 12);
		
		//�������� ���� 2������ �� ��(��) day
		
		if(y%4 == 0 && y%100 != 0 || y%400 == 0) {
			
			months[1] = 29; //������ ��� 28->29�� �ٲ�
		}
		
		//1�� 1�� 1�� ~ ����ڰ� �Է��� (y-1)�� 12�� 31�ϱ����� ������ ���ϱ�
		//% ������ -> ���� -, || -> ���ϱ� +
		
		d = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		/*
		int yy = (y-1)/4 - (y-1)/100 + (y-1)/400;
		System.out.println(d);
		System.out.println(yy);
	
		//�迭�� index	 0	 1	 2	 3	 4	 5	 6	 7	 8	 9	 10	 11
		//�迭 : 		{31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
		//��   :		 1	 2	 3	 4	 5	 6	 7	 8	 9	 10	 11	 12
		*/
		
		//(m-1)�� ���ϱ����� ����
		for(i = 0; i< m-1; i++) { //���� ������ += �� ǥ��
			d += months[i];
		}
		
		d += 1; //y�� m�� 1��
		
		//�� Ƚ�� ��� (7�� ������)
		w = d%7;
		
		//System.out.println(w); //������ ���� Ȯ���ϱ� ���� �� ���̷� �ڵ��� ���� ��� �ּ� ó��
		
		System.out.println("\n  Mon  Tus  Wed  Thu  Fri  Sat  Sun");
		System.out.println("---------------------------------------");

		for(i = 0; i < w; i++) {
			System.out.print("     "); //5ĭ
		}
		
		//m-1 -> ���� 3���� �ְ� ������ 3-1 = 2 -> index���� 2�̴�.
		
		for(i = 1; i <= months[m-1]; i++) {
			 
			//�ڸ����� ���� �� ���ڴ� ����. ���ڴ� ������ ���ĵ�
			System.out.printf("%5d", i); //5ĭ
			
			//�� �ֿ� ��¥�� ��� ��, �� �ٲ�
			w++;
			
			if(w%7 == 0) {
				System.out.println();
			}
		}
		
		if(w%7 != 0) {
			System.out.println();
		}
		System.out.println("---------------------------------------");
	}
}