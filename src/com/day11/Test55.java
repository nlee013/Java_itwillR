package com.day11;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test55 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		//Calendar no2 = new GregorianCalendar();//�ڽ��� ��ü �����ؼ� �ø��� -> upCast(���߿� ���)
	
		//get�� ������ ���� ������ ��
		//set�� �ʱ�ȭ?
		//������ ���� static
		
		now.set(2021,10-1,10);//���� ���� ���� set 
		//���� 0��~11������ ����Ǿ�����
		//���� ���� get 10+1.���� ���� set 10-1
		
		int y = now.get(Calendar.YEAR);//��
		int m = now.get(Calendar.MONTH)+1; //��(0~11)-> 0���� ���� �����Ƿ� +1
		int d = now.get(Calendar.DATE); //��
		int w = now.get(Calendar.DAY_OF_WEEK);//���� ��(1~7, 1:�Ͽ���) 1���� ��ȯ��
		
		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};
		System.out.println(y + "-" + m + "-" + d + "-" + week[w-1]);
		
		//�� �Ⱦ� : ���� ������ ��¥ ���
		int startDay = now.getActualMinimum(Calendar.DATE);//���� ù ��
		int lastDay = now.getActualMaximum(Calendar.DATE);//���� ������ ��
		
		System.out.println(startDay + ":" + lastDay);
		
		System.out.printf("%tF\n", now);//2022-01-04
		System.out.printf("%tT\n", now);//11:48:34
		
		System.out.printf("%tF %tT\n", now, now);//������ ���� ���
		System.out.printf("%1$tF %1$tT\n", now);//1$ -> ù��° �μ��� �����ؼ� ����ϰڴ�
		
		y = now.get(Calendar.YEAR);//��
		m = now.get(Calendar.MONTH)+1; //��(0~11)-> 0���� ���� �����Ƿ� +1
		d = now.get(Calendar.DATE); //��
		w = now.get(Calendar.DAY_OF_WEEK);//���� ��(1~7, 1:�Ͽ���) 1���� ��ȯ��
		
		System.out.println(y + "-" + m + "-" + d + "-" + week[w-1]);
	}
}
