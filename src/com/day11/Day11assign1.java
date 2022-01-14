package com.day11;

import java.util.Calendar;
import java.util.Scanner;

public class Day11assign1 {

	public static void main(String[] args) {

		//����� �Է¹޾� Calendar�� ����޷� �����
		
		Scanner sc = new Scanner(System.in);
		
		Calendar cal = Calendar.getInstance();
		int y, m, w;

		do {
			System.out.println("Type any year: ");
			y = sc.nextInt();
		}while(y < 1);
		
		do {
			System.out.println("Type any month: ");
			m = sc.nextInt();
		}while(m < 1 || m > 12);
		
		cal.set(y, m-1, 1);
		w = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("\n  Mon  Tus  Wed  Thu  Fri  Sat  Sun");
		System.out.println("---------------------------------------");
		
		for(int i = 1; i < w; i++) {
			System.out.print("     ");//5ĭ
		}
		
		for(int i = 1; i <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++){
		//for(int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++){	
			System.out.printf("%5d", i);
			
			w++;
			
			if(w%7 == 1) {
				System.out.println();
			}
		}
		
		if(w%7 != 1) {
			System.out.println();
		}
		System.out.println("---------------------------------------");
	}
}
