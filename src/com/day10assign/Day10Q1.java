package com.day10assign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Result{//�̰��� �ٲ��� ���� : �θ� class�� print�� ����ϱ�

	public void print(String r) {

		System.out.println(r);
	}
}

class Calc extends Result{//�ڽ� Calc �θ� Result

	String[] oper = {"+", "-", "*", "/"};
	private String str;
	private int pos, n1, n2, result, oper2;

	public void Calcul() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("���� [3 + 5]?");
		String str = br.readLine();

		str = str.replaceAll("\\s", "");

		for(String op : oper) {

			pos = str.indexOf(op);

			if(pos > -1) { 
				n1 = Integer.parseInt(str.substring(0, pos));
				n2 = Integer.parseInt(str.substring(pos + 1));

				result = 0;
				char oper2 = str.charAt(pos);

				switch(oper2) {
				case '+':
					result = n1 + n2; break;
				case '-':
					result = n1 - n2; break;
				case '*':
					result = n1 * n2; break;
				case '/':
					result = n1 / n2; break;
				}
				
				System.out.printf("%d %c %d = %d", n1, oper2, n2, result);
			}
		}
	}
}

public class Day10Q1 {

	public static void main(String[] args) throws IOException {

		Calc ob1 = new Calc();
		ob1.Calcul();
		String r = "";
		ob1.print(r);
	}
}

