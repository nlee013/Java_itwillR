package com.Fitness;

import java.util.Scanner;

public class Fitness {
	
	Scanner sc = new Scanner(System.in);
	Health[] ht;
	
	public void input() {
		
		ht = new Health[1];
		
		String[] title = {"Create new ID: ","Type your home address: "};
		String[] data = {"Type your height(cm): ", "Type your weight: " };
		
		System.out.print("Type your name: ");
		
		ht[0] = new Health();
		ht[0].name = sc.next();
		
		for(int i = 0; i < 2; i++) {
			
			System.out.print(title[i]);
			ht[0].info[i] = sc.next();
			
			//System.out.printf("%6s %15s",ht[0].id, ht[0].address);
		}
		
		
		for(int i = 0; i < 2; i++) {
			
			System.out.print(data[i]);
			ht[0].dataa[i] = sc.nextDouble();
			
			//System.out.printf("%3d %4d", ht[0].dataa[i]);
		}
	}
	
	public void bmiMeasure() {
		
		ht[0].bmi = ht[0].dataa[0]/ht[0].dataa[1]*100;
		
		if(ht[0].bmi < 18.5) {
			
			System.out.print("Your BMI: " + ht[0].bmi + "��ü�� �Դϴ�. �� �� �Ծ ��켼��");
		}
		else if(ht[0].bmi > 18.5 && ht[0].bmi < 22.9) {
			
			System.out.print("Your BMI: " + ht[0].bmi + "���� ü�� �Դϴ�. ����ó�� �����ϼ���");

		}
		else if(ht[0].bmi > 23 && ht[0].bmi < 24.9) {
			
			System.out.print("Your BMI: " + ht[0].bmi + "��ü�� �Դϴ�. ��ؼ� �� �� ���ô�!");

		}
		else if(ht[0].bmi > 25) {
			System.out.print("Your BMI: " + ht[0].bmi + "�� �Դϴ�. ��� �ܲ� �Ҹ��� �鸮�׿�. ���� ��սô�!");

		}
		
	}
	
}
