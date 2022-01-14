package com.day16;

//Thread�� Runnable�� ��ɾ �ٸ� ������, �Ȱ��� Thread�̴�

class MyThread5 implements Runnable{
	
	@Override
	public void run() {
		
		for(int i = 1; i <= 20; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
	}
}
	

public class Test5day16 {

	public static void main(String[] args) {

		System.out.println("Main ����...");
		
		Thread th1 = new Thread(new MyThread5());
		Thread th2 = new Thread(new MyThread5());
		Thread th3 = new Thread(new MyThread5());
		
		
		//�⺻ default�� ��� thread�� ����Ǹ� ������ ��������,
		//Main Tread�� ����� ������ �����Ű�� �������� Daemon Thread ����ϱ�
		//->Daemon Thread : �ٸ� Thread�� ������ �ִ� Thread.
		//�ٸ�(���⼭�� Main) Thread�� ����Ǹ�, Daemon Thread�� ������� �ʾƵ� Process�� �����
		
		//Daemon ���� ����
		th1.setDaemon(true);
		th2.setDaemon(true);
		th3.setDaemon(true);
		
		th1.start();
		th2.start();
		th3.start();
		
		/*try {
			Thread.sleep(1000);//������ ���ᰡ �Ǵ� ���ÿ� ���� �����
		} catch (Exception e) {

		}*/
		
		try {
			//join(); ->  �Ϲ������� Main�� ���� ������ ��ٷ�
			//join()�� A thread()�ȿ� ���� A thread�� ���������� ��ٸ��� ��
			th1.join();
			th2.join();
			th3.join();
		} catch (Exception e) {
			
		}
		
		System.out.println("Main ����...");
	}
}
