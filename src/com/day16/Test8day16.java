package com.day16;

//Thread�� ����ȭ
class MyThread8 implements Runnable{
	 
	private int bank = 10000;//�� ���� �ܰ�
	
	private int getBank() {
		
		return bank;
	}
	
	private int drawMoney(int m) {
		
		bank  -= m;//���� bank = bank -m;
		return m; //���� �ݾ�
	}
	
	@Override
	public void run() {
		
		int moneyNeed = 6000;//������ �ݾ�
		int money;
		String msg = "";
		
		try {
			//����ȭ ��
			//synchronized (this) {
				
				if(getBank() >= moneyNeed) {
						money = drawMoney(moneyNeed);
						msg = "���� ����!!";
				}else {
						money = 0;
						msg = "���� ����!!";
				}
			//}
			
			System.out.println(Thread.currentThread().getName() + msg + "���� �ݾ�: " + money + ",�ܰ�: " + getBank());
			
		} catch (Exception e) {
		
		}
	}
}

	public class Test8day16 {

	public static void main(String[] args) {

		MyThread8 ob = new MyThread8();//�ٽɳ���: ��ü�� �ϳ���
		
		//�� thread th1�� th2�� ���� MyThread8 ob�� ob �ϳ������� ������
		//public void run()������ ������
		Thread th1 = new Thread(ob);
		Thread th2 = new Thread(ob);
				
		th1.start();
		th2.start();
	}
}
