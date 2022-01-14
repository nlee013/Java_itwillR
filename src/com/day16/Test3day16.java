package com.day16;

import java.util.Calendar;

//Thread ���� Runnable�� ���� ���� �� ����

class MyThread3 implements Runnable{

	@Override
	public void run() {
		
		while(true) {
			
			//�ڿ� �ִ� �μ� ��������� �� tF�� ��¥, tT�ð�
			System.out.printf("%1$tF %1$tT\n", Calendar.getInstance());
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}
	}
}

public class Test3day16 {

	public static void main(String[] args) {

		//���� �ý����� ��¥�� �ð��� 1�ʸ��� ����ض�
		
		Thread th = new Thread(new MyThread3());
		th.start();
		//Thread th = new Thread(new MyThread3()).th.start();���� �������ε� ����
	}
}
