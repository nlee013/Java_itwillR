package com.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test53 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("����[3 + 5]?");//������ 37 + 23�� �����
		String str = br.readLine();
		
		str = str.replaceAll("\\s", "");//������ null������ ����
		//System.out.println(str);//Ȯ�ο�
		
		//����ڰ� �Է��� �����ڸ� �о��
		//1)����
		String[] oper = {"+", "-", "*", "/"};
		for(String op : oper) {
			
			int pos = str.indexOf(op);
		
		//2)�� ���� ���ļ� �̷��Ե� �����
			/*for(String op : new String[] {"+", "-", "*", "/"}) {
				
				int pos = str.indexOf(op)
			}*/
			
			if(pos > -1) {//��ȯ���� ���� �� -1 <�� �ϱ�> //���� ������ ����
														  //�����ڸ� �������� -1, +1
				int num1 = Integer.parseInt(str.substring(0, pos)); //subString ����ϱ�
				int num2 = Integer.parseInt(str.substring(pos + 1));
				
				//System.out.println(num1 + ":" + num2); //Ȯ�ο�
				
				int result = 0;
				char oper2 = str.charAt(pos);
				
				switch(oper2) {
				case '+':
					result = num1 + num2; break;
				case '-':
					result = num1 - num2; break;
				case '*':
					result = num1 * num2; break;
				case '/':
					result = num1 / num2; break;
				}
				//System.out.printf("%d %c %d = %d", num1, oper2, num2,result);
				//�� �ڵ�� ������ ����.
				
				//<������>
				// �� �ڵ�� �� �ڸ����� �ٷ� ���.
				// �Ʒ� �ڵ�� �����ȿ� ���� �����صΰ� �ٸ� ������ ��� �� �� ���
				//->sf�� method�� ��ȯ���� return���� string���� ���� ���� ���� ���� ���.
				
				//����� ����� ���� ���ȿ� �� ��Ƴ� �� return������ �޾Ƴ���.
				String sf = String.format("%d %c %d = %d", num1, oper2, num2,result);
				
				System.out.println(sf);
			}
		}
	}
}
