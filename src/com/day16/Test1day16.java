package com.day16;

/*1)Thread class �ٽ� �޼ҵ�� run() method
2) runnable interface

start
sleep�� �� ����ϱ�*/

//thread�� ��� �ο�->�ð� ����->�θ�ȭ��Ű��
//(java.lang�� ���� -> �ȿ� �� �͵鸹�� ����)

//Interface���ε� Thread ���� �� ����
class MyThread extends Thread{
	
	private int num;//MyThread variable
	private String name;//MyThread variable
	
	public MyThread(int num, String name) {
		
		this.num = num;
		this.name = name;
	}
	
	//�ݵ�� �ʿ��� Thread�� Run() method
	@Override
	public void run() {//������ �۾�.�ڹ��� VM�� ȣ����.�ٸ� start() ��ɾ�θ� VM ȣ����
		
		int i = 0;
		
		while(i < num) {//getName() �ǹ����� �� �Ⱦ��� ���⼱ thread �̸� �����ֱ� ���� �����ϻ�
			System.out.println(this.getName() + ":" + name + i);//Thread�� getName();-> �̸��� ������
																//getName()-> ó�� ����� thread�� �̸��� 0
			i++;
			
			//�ݵ�� try��
			try {
				
			//Thread�� th1�� ���� ������ ��� control�� ����. CPU ���� �޶���
			//������ sleep();���� 0.001�ʾ� ���鼭 ��� �� �� �ְ� ��
			
				sleep(100);
			} catch (Exception e) {
				
			}
		}
	}
}

public class Test1day16 {

	public static void main(String[] args) {//main thread.main�������� �ر��� �۾� ����

		System.out.println("Main ����...");
		
		MyThread th1 = new MyThread(100, "First:");
		MyThread th2 = new MyThread(200, "Second:");
		
		//����
		th1.start();
		th2.start();
		
		System.out.println("Main ����...");
	}

}
