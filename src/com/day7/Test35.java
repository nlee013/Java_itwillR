package com.day7;

import java.util.Scanner;

class Hap{
	
	int su, sum; //instance var
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type an integer: ");
		su = sc.nextInt();
		
	}
	
	public int cnt() {
		
		for(int i = 0; i < su; i++) {
			sum += i; //sum = sum+i 
		}
		return sum;
	}
	
	public void print(int sum) {
		
		System.out.println("Total:" + sum);
	}
}
//class�� �ڷ����̴�
public class Test35 {

	public static void main(String[] args) {
		
		Hap h = new Hap();
		
		h.input();
		int sum = h.cnt();
		h.print(sum);
		
//		int[] num = new int[5];
//		Hap h = new Hap();
		//���� ����..?
		
	}

}
