package com.day10assign;

import java.io.IOException;
import java.util.Scanner;

class Result2{//�̰��� �ٲ��� ���� : �θ� class�� print�� ����ϱ�

	public void print(String r) {

		System.out.println(r);
	}
}

class Calc2 extends Result{
	
	int num1, num2;
	String num;
	char op2;
	
	public void input() throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ΰ��� ��[5, 2]");
		num = sc.next();
		
		String[] ss = num.split(",");
		num1 = Integer.parseInt(ss[0]);
		num2 = Integer.parseInt(ss[1]);
		
		System.out.print("������");
		op2 = (char) System.in.read();
	}
	
	public String calc() {
		
		int result2 = 0;
		
		switch(op2) {
		case '+':
			result2 = num1 + num2; break;
		case '-':
			result2 = num1 - num2; break;
		case '*':
			result2 = num1 * num2; break;
		case '/':
			result2 = num1 / num2; break;
		}
		
		return String.format("%d %c %d = %d", num1, op2, num2, result2);
	}
}

public class Day10Q1Scanner {

	public static void main(String[] args) throws IOException {

		Calc2 ob = new Calc2();
		ob.input();
		String r = ob.calc();
		ob.print(r);
	}

}
