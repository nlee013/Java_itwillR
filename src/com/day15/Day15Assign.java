package com.day15;
//�Ϲ������� List �� Array List ���������� ���� �����
import java.util.Scanner;

//5~10�� �̳��� �����ڸ� �Է¹޾� ����ϴ� ���α׷� �����
//����ڰ� ���ڿ�: abcdefg ���: abcd
//���ڿ�: abc ���: ���ڿ��� ���̴� 5~10�� �Դϴ�
//���ڿ�: abcde2345 ���: �����ڸ� �����մϴ�

class MyAuthException{//����� ���Ǹ� �������ִ� ����ó����
	
	public void inputFormat(String str) throws Exception {//MyException�� ������. �ٸ� ���� ���ٽᵵ ��
		//����� ���� ������ exception���� �޾Ƽ� Ȯ����
		
		//���ܹ߻� �� : ���� ����
		if(str.length() < 5 || str.length() >10) {//������ ���� ��츸 �����
			
			throw new Exception("5~10�ڸ� �Է� �����մϴ�.");
		}
		
		//���ܹ߻� �� : ������
		
		//1�� ���
		//int eng = 0, num = 0;
		
		//2�� ���
		boolean eng = false;
		boolean num = false;
		
		//3�� ���
		//boolean eng, num = false; -> false�� num(������ ��)���� ��
		//eng = num = false;
		
		for(int i = 0; i < str.length(); i++) {
				
			char ch = str.charAt(i);
			
			//if((ch < 65 || ch > 90) && (ch < 97 || ch > 122)) {	
			
			//���� ���̹Ƿ� &&�� �ؾߵ�
			if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				//eng++;
				eng = true;
				
			}else if((ch >= '0' && ch <= '9')){
				//num++;
				num = true;
			}		
		}	
		
	  //if(eng == 0 || num == 0)
	  if(eng == false || num == false)	
			throw new Exception("�����ڿ� ���� ȥ�븸 �����մϴ�.");
	}
}

public class Day15Assign {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str;
		
		MyAuthException auth = new MyAuthException();
		
		try {//���⼭ ���� ����� �Է°� �ޱ�
			
			System.out.println("Type ���ڿ�: ");
			str = sc.next();
			
			auth.inputFormat(str);
			System.out.println(str);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
