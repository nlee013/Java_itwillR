package com.day10;

import org.omg.Messaging.SyncScopeHelper;

//String�� �����ִ� Class 2�� : StringBuffer, StringBuilder-> java.lang�� ����
//StringBuffer: ����ȭ O, �� ����
//StringBuilder:����ȭ X, ����

public class Test50 {

	public void stringTime() {
		
		System.out.println("String test...");
		
		//long start = System.currentTimeMillis(); //<- ��ž��ġ ���� 2���� �� �ϳ� 
		long start = System.nanoTime();//<- �� �� ���� �ð� ���� ����
		//System.out.println(start); //Ȯ�ο�
		
		//long -> ������ �� ���� ū ��
		
		String str = "A";
		
		for(int i = 1; i <= 50000; i++) {
			str += "A";
		}
		
		long end = System.nanoTime();
		
		System.out.println("���� �ð�: " + (end-start));
	}
	
	public void stringBufferTime() {
	
		System.out.println("String test...");
		
		long start = System.nanoTime();//<- �� �� ���� �ð� ���� ����
		
		StringBuffer str = new StringBuffer("A");//�Ϲ� class�̹Ƿ� �̷��� �ۼ��ϸ�,
												 //�ʱ�ȭ�� ���ڷ� ���� "A".
		
		for(int i = 1; i <= 50000; i++) {
			str.append("A");
			//�ϳ��� method�ȿ� method ȣ�� : overloading
		}
		
		long end = System.nanoTime();
		
		System.out.println("���� �ð�: " + (end-start));
		
	}
	
	
	public void stringBuilderTime() {
		
		System.out.println("String test...");
		
		long start = System.nanoTime();
		
		StringBuilder str = new StringBuilder("A");//java.lang�� �־ import �ȵ�
		
		for(int i = 1; i <= 50000; i++) {
			str.append("A");
		}
		
		long end = System.nanoTime();
		
		System.out.println("���� �ð�: " + (end-start));
	}
	public static void main(String[] args) {
		
		Test50 ob = new Test50();
		ob.stringTime();
		ob.stringBufferTime();
		ob.stringBuilderTime();
	}

}
