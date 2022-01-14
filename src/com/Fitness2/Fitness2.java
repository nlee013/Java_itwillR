package com.Fitness2;

import java.util.Scanner;

public class Fitness2 {

	int inwon;
	
	Health2[] ht2;
	
	Scanner sc = new Scanner(System.in);
	
	public void set() {
		
		do {
			System.out.print("How many members do you want to sign up?: ");
			inwon = sc.nextInt();
			
		}while(inwon < 1 || inwon > 10);
		
		ht2 = new Health2[inwon];
	}
	
	public void input() {
		String[] Q = {"Create new ID: ","Type your home address: "};
		String[] dataa = {"Type your height(cm): ", "Type your weight: "};

		for(int i = 0; i < inwon; i++) {
			
			ht2[i] = new Health2();
			
			System.out.print("Type your name: ");
			ht2[i].name = sc.next();
			
			for(int j = 0; j < 2; j++) {
				
				System.out.print(Q[j]);
				ht2[i].info[j] = sc.next();
				
				System.out.print(dataa[j]);
				ht2[i].data[j] = sc.nextDouble();
			}
		}
		
	}
	
	public void bmiMeasure() {
		
		for(int i = 0; i < inwon; i++) {
			
			ht2[i].bmi = ht2[i].data[i]/ht2[i].data[i]*100;
		
			if(ht2[i].bmi < 18.5) {
			
			System.out.print("Your BMI: " + ht2[i].bmi + "��ü�� �Դϴ�. �� �� �Ծ ��켼��");
			}else if(ht2[i].bmi > 18.5 && ht2[i].bmi < 22.9) {
			
			System.out.print("Your BMI: " + ht2[i].bmi + "���� ü�� �Դϴ�. ����ó�� �����ϼ���");

			}else if(ht2[i].bmi > 23 && ht2[i].bmi < 24.9) {
			
			System.out.print("Your BMI: " + ht2[i].bmi + "��ü�� �Դϴ�. ��ؼ� �� �� ���ô�!");

			}else if(ht2[i].bmi > 25) {
			System.out.print("Your BMI: " + ht2[i].bmi + "�� �Դϴ�. ��� �ܲ� �Ҹ��� �鸮�׿�. ���� ��սô�!");
			}
		}
		
	}
	
	public void print() {
		
		for(int i = 0; i < inwon; i++) {
			
			System.out.printf("%6s", ht2[i].name);
			
			for(int j = 0; j < 2; j ++) {
				
				System.out.printf("%6s", ht2[i].info[j]);
				System.out.printf("%4g", ht2[i].data[j]);
				System.out.printf("%5g", ht2[i].bmi);
			}
				
		}
	}
		
}
