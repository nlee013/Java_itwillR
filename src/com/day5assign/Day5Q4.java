package com.day5assign;

import java.util.Scanner;

public class Day5Q4 {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			//���� ��¥���� �迭�� ����
			int[] months = {31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
			
			int y, m, d, nalsu, w, i; //year month d���� date��¥ day���� week int i
			
			do {
				//����ڰ� � ���ڸ� �Է����� �𸣹Ƿ� do while�� ����
				
				System.out.println("Type any year: "); //2021
				y = sc.nextInt();
				
			}while(y < 1); //1���� ���� ���� ����
			
			do {
				System.out.print("Type any month: ");
				m = sc.nextInt();
				
			}while(m < 1 || m > 12);
			
			//������ ���� ���Ǿ�� ��
			if(y%4 == 0 && y%100 != 0 || y%400 == 0) {
				
				months[1] = 29; //������ ��� 28->29�� �ٲ�
			}

			do {
				System.out.print("Type any date: ");
				d = sc.nextInt();
				
			}while(d < 1 || d > months[m-1]);//m-1�� ���� ���� �ι�°�� ���� ���� 2-1 [1]index�ѹ�
			
	
			//1�� 1�� 1�� ~ ����ڰ� �Է��� (y-1)�� 12�� 31�ϱ����� ������ ���ϱ�
			
			nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
			
			//(m-1)�� ���ϱ����� ����
			for(i = 0; i< m-1; i++) { //���� ������ += �� ǥ��
				nalsu += months[i];
			}
			
			nalsu += d; //y�� m�� 1��
			
			//�� Ƚ�� ��� (7�� ������)
			w = nalsu%7;
			
			String[] day = {"��", "ȭ","��","��","��","��","��"};
	
			System.out.printf("year:%d month:%d date:%d %sday", y, m, d, day[w]);
			
	}
}


