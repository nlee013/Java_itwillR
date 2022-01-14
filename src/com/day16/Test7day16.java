package com.day16;

//�켱����(���� ����)�� ���� ���α׷��� ���� �����Ű�� ���ƿ�

class MyThread7 extends Thread{
	
	private Thread next;
	
	public void setNext(Thread next) {
	
		this.next = next;
	}
	
	@Override
	public void run() {

		for(int i = 0; i <= 20; i++) {
			
			try {
				sleep(2000);
			} catch (Exception e) {
				
			}
			
			System.out.println(getName() + ":" + i);
			
			if(next.isAlive()){
				
				next.interrupt();//���� thread�� (����)�����Ƿν� ���� thread�� ����
			}
		}
	}
}
public class Test7day16 {

	public static void main(String[] args) {

		MyThread7  th1 = new MyThread7();
		MyThread7  th2 = new MyThread7();
		MyThread7  th3 = new MyThread7();

		//
		th1.setNext(th1);
		th2.setNext(th2);
		th3.setNext(th3);	
		
		th1.start();
		th2.start();
		th3.start();
		
		//interrupt ������ ���� �� �ִ�
		th2.interrupt();
		try {
			th2.join();
			th2.join();
			th3.join();
			
		} catch (Exception e) {
		}
	}
}
