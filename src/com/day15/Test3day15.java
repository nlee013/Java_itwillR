package com.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//���ܸ� �ǵ������� �߻� ��Ű�� ���

public class Test3day15 {

	public static String getOper() throws Exception {//������ �޴� �ڵ�
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String oper = "";//null;
		
		try {
			System.out.println("������?: ");
			oper = br.readLine();
			
			if(!oper.equals("+") && !oper.equals("-") &&//�Ѵ� �����̸� &&
			   !oper.equals("*") && !oper.equals("/")) {
				
				//exception�� class.
				//����� ���� ������ ������ Exception�� �ñ��.
				//�׷��Ƿ� ������ throw Exception �ۼ�
				//e.toString()���� �ѷ��ش�(���)
				throw new Exception("������ �Է� ����!!");	
			}
			
		} catch (IOException e) {//���⼭ Exception ������ �Ұ��� �Ұ���
			//IOException�� ����ϸ� ���� throw new Exception���� ������.
			//�׷��Ƿ� public static String getOper()�� throws Exception �߰��ؾߵ�
			System.out.println("�Է� ERROR!!");
		}
		
		return oper;//�����ڸ� ��ȯ������ߵǴϱ�
	}
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2, result;
		String oper;
		
		try {
			System.out.println("First nuebr: ");
			num1 = Integer.parseInt(br.readLine());
			
			System.out.println("Second number: ");
			num2 = Integer.parseInt(br.readLine());
			
			oper = Test3day15.getOper();//����� ������. ������ ���ٸ� ���⼭ ������ ���� ����
			
			result = 0;
			
			if(oper.equals("+")) {
				
				result = num1 + num2;
			}else if(oper.equals("-")) {
				result = num1 - num2;
			}else if (oper.equals("*")) {
				result = num1*num2;
			}else if (oper.equals("/")) {
				result = num1/num2;
			}
			
			System.out.printf("%d %s %d = %d\n", num1, oper, num2, result);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}	

}
