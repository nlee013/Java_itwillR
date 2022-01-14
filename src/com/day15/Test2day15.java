package com.day15;

import java.util.Scanner;

//���� ó�� : Exception ����ϱ�

public class Test2day15 {

	public static void main(String[] args) {

		//�Ʒ� �ڵ嵵 try�ȿ� �־ ����.
		int num1, num2, result;
		String oper;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("�ΰ��� ��?: ");
			
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.print("������?: ");
			oper = sc.next();
			
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
			
			//catch�� ������ �ۼ� ����
			}catch (NumberFormatException e) {
				System.out.println("Type an integer: ");
			}
			catch (ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�");
			}
			catch (Exception e) {//���� �ִ� exception���� �ذ� �� �� ���ٸ� ���⼭ �ذ�
			//exception�� �ٸ� exception���� ���� �Ʒ��� �ۼ���
			//�����ϴٰ� error�� �߻��ϸ� catch�� �ް�
			//Exception�� ó���ǰ� e���� ��ȯ����
				
			System.out.println("�߸� �Է��߽��ϴ�. ���ڸ� �ٽ� �Է����ּ���. ");
			System.out.println(e.toString());//�� �κ� ���� ���� ����.
			e.printStackTrace();
				
			}finally {//error�� ���� �������� ������ �����
				System.out.println("�������� ����ȴ�.");
			}
			System.out.println("catch�� ��...");
		}
	}

