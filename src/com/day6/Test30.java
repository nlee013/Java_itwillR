package com.day6;

import java.util.Scanner;

//�ֹε�Ϲ�ȣ
public class Test30 {

	public static void main(String[] args) {
		
		//�� = (9*2) + (4*3) + ... + (8*5)
		//�� = 11 - ��%11
		//�� = ��%10
		//�� == 9
		
		Scanner sc = new Scanner(System.in);
		
		String jumin;
		int[] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
		int i , tot, su; //total ���� su��
		
		System.out.print("�ֹι�ȣ:[******-*******]?");
		jumin = sc.next();
		
		//i��� ������ �ڷ����̿��� method����.
		//���⼭ jumin�� class�̹Ƿ� method����
		//�迭�� length�� �޸� ()��ȣ�� ����
		
		//14�ڸ�
		if(jumin.length() != 14) {
			System.out.println("Wrong Type!!!");
			return; //exit(���α׷� ��ü��) ����. return 0; 0���� ���ư�
		}
		//System.out.println("14�ڸ� Success!!"); //Ȯ�ο�
		
		tot =0; //�ʱⰪ. tot <- �� �հ� ���� �����ϴ� ��
		
		//index : 01234567890123
		//jumin : 941228-2056789
		//check : 234567 892345
		
		for(i = 0; i < 12; i++) {
			
			if(i >= 6) {//���ڸ� ��
				tot+= chk[i]*Integer.parseInt(jumin.substring(i+1, i+2));
				
			}else {//(���ڸ�)������� ��
				tot+= chk[i]*Integer.parseInt(jumin.substring(i, i+1));
			}
		}
		
		su = 11 - tot%11;
		su = su % 10;
		
		if(su == Integer.parseInt(jumin.substring(13))){
			System.out.println("��Ȯ�� �ֹι�ȣ!!");
		}else {System.out.println("����Ȯ�� �ֹι�ȣ!!");
		
		}

		/*String str = "Seoul Korea"; //String �ڷ��� ���� Ŭ����
		//index�� ������� : 0123456789
		
		System.out.println(str);
		System.out.println(str.substring(0, 3));//��.�� ������ ������ method�� ����
		System.out.println(str.substring(6, 8));//�Ϻκи� ���. ����� index�� ���.
		System.out.println(str.substring(6)); //������
		*/	
		
		}

}
