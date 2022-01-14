package com.day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.excep.OperationAuthenticator;

//���� ����ó��

public class CalcExcep {

	public static void main(String[] args) {

		//����ó�� �� �� �۹��� ������ �����ϱ� ���Ƽ� ���µ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		double num1, num2, result;
		
		OperationAuthenticator auth = new OperationAuthenticator();
		
		try {
			
			System.out.println("�ΰ��� ��[a, b]");//10, 34
			str = br.readLine();
			
			auth.inputFormat(str);//OperationAuthenticator auth�� ���ٰ� ���� ������ �������� ��
			
			String[] temp  = str.split(",");//�˻簡 �ƴ϶� temp�� �ٽ� �־����
			
			auth.number(temp[0]);//�Է°��� �̻��� ������ Ȯ��
			num1 = Double.parseDouble(temp[0]);
			
			auth.number(temp[1]);
			num2 = Double.parseDouble(temp[1]);
			
			System.out.println("������?: ");//++
			str = br.readLine();
			
			auth.operator(str.charAt(0));
			
			char ch = str.charAt(0);
			
			result = 0;
			
			if(ch == '+')
				result = num1 + num2;
			
			else if(ch == '-')
				result = num1 - num2;
			
			else if(ch == '*')
				result = num1 * num2;
			
			else if(ch == '/')
				result = num1 / num2;
			
			System.out.printf("%g %c %g = %g\n", num1, ch, num2, result);
			
		} catch (Exception e) {	
		
			System.out.println(e.toString());
		}
	}

}
