package com.day16;
//������ �ð����� Ư�� �۾��� �ݺ��ؼ� ������ ��

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

//thread�� ��ӹް� �����
public class Test9day16 extends Thread{
	
	//c.getTime()�� 3000(3��)�� ��´ٰ� �� ��
	//�������ڸ��� 1�ʸ� ��� ������ �ʱⰪ 0�� ���� ��� ���� �ð��� ����� ��µǴ� ��
	
	//private int num = 0;
	private int num;
	
	public Test9day16() {
		TimerTask task = new TimerTask() {//java.util�� ����.�ڵ� override
			
			@Override
			public void run() {
				//�ݺ� ������ �۾� �ۼ�
				num = 1;
			}
		};
		
		Timer t = new Timer();//java.util
		Calendar c = Calendar.getInstance();
		
		//����� �������κ��� 5�ʸ��� �� �۾�(num�� 0���� �ʱ�ȭ)�� �����ض�
		t.schedule(task, c.getTime(), 5000);
		
		//EX) ���� 00�� 00�� 00�� ~ �Ϸ翡 1���� �ݺ� �۾��� �� ��
		/*
		c.add(Calendar.DATE, 1);
		c.set(Calendar.HOUR, 0);//����1�� = 13�� �̹Ƿ� 13���� �ۼ�
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);//�ڼ��� �ð��� ���� �̰ͱ��� �ۼ�
		t.schedule(task, c.getTime(), 1000*60*60*24);//�и�������*��*��*��
		*/
	}
	
	//t.schedule(task, c.getTime(), 5000);�̹Ƿ� �Ʒ� �۾��� 5�ʸ��� �ݺ� ����
	@Override
	public void run() {
		
		while(true) {
			
			System.out.println(num++);
			
			try {
				sleep(1000);//1�ʸ���
			} catch (Exception e) {
				
			}
		}
	}
	
	public static void main(String[] args) {

		//Test9day16 ob = new Test9day16();
		//ob.start();
		
		//�� �ڵ�� ����
		new Test9day16().start();//Event �ܰ迡�� ���� ��뿹��
	}
}
