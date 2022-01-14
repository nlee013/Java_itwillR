package com.day16;

//������ Main Thread �Ӹ� �ƴ϶� ��� thread�� �����ؾ��� ����Ǵ� ��

class MyThread2 implements Runnable{
	
	private int num;
	private String name;
	
	public MyThread2(int num, String name) {
		
		this.num = num;
		this.name = name;
	}
	
	@Override
	public void run() {
		
		int i = 0;
		
		while(i < num) {
			
			//���⿣ getName()�� ����
			System.out.println(name + ":" + i);
			 i++;
			 
			 try {
				Thread.sleep(100);//interval(�ð�)�ϸ� Thread.sleep(�ð�); 1000= 1��
			} catch (Exception e) {
				
			}
		}
	}
}
public class Test2day16 {

	public static void main(String[] args) {

		System.out.println("Main ����...");
		
		//���� ����new Thread�̸�(new Runnable�� ������� Thread �̸�(,)) ->new Thread(MyThread2)
		Thread th1 = new Thread(new MyThread2(100, "First: "));//Interface Runnable Thread
		Thread th2 = new Thread(new MyThread2(100, "Second"));//Interface Runnable Thread
		
		th1.start();
		th2.start();
		
		System.out.println("Main ����...");
				
	}

}
