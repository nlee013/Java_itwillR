package com.day16;

//Thread TTL = Time to Live = Thread�� ��� �ִ� �ð�
class MyThread6 extends Thread{
	
	@Override
	public void run() {

		//sleep�� try catch�� �ȿ� ����ߵ�. �Ⱦ��� compilt error
		try {
			System.out.println("Thread ����...");
			
			System.out.println("�켱 ����" + getPriority());//getPriority() �켱����
			System.out.println("Name of Thread: " + getName());
			
			//0.5�ʸ� ����
			sleep(500);
			
			//�켱���� ����
			setPriority(2);
			System.out.println("����� �켱����: " + getPriority());
			
			System.out.println("Thread ����...");
			
		} catch (Exception e) {

		}	
	}
	
}

public class Test6day16 {

	public static void main(String[] args) {

		Thread th1 = Thread.currentThread();//����(main)Thread�� th1�� �־��
		Thread th2 = new MyThread6();
		
		System.out.println("Main Thread �켱����:" + th1.getPriority());//5 -> thread�� �⺻���� 5�̴�.
		System.out.println("���� Thread�� �̸�" + th1.getName());//main
		System.out.println("th2 Thread�� �̸�" + th2.getName());//Thread-0
		
		//th2�� ������ �Ǿ���?(����ֳ�?)
		System.out.println("th2.start() method ȣ�� ���� isAlive: " + th2.isAlive());//false//����
		
		th2.start();
		
		//th2 �켱����
		System.out.println("th2 �켱����: " + th2.getPriority());//5
		
		//th2�� �켱���� ����
		th2.setPriority(1);
		
		try {
			//0.1��
			Thread.sleep(100);//main���� 0.1�� ����� ��
			
			//th2 ����Ȯ��
			System.out.println("th2 ����ֳ�?: " + th2.isAlive());
			
			//1��
			Thread.sleep(1000);
			System.out.println("1�� sleep�� th2 ����ֳ�?: " + th2.isAlive());
			
			th2.join();
			
			System.out.println("�׷��� ����ֳ�?: " + th2.isAlive());
			
		} catch (Exception e) {
			
		}
	}

}
