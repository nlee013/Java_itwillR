package com.day16;

//우선순위(내가 정함)가 높은 프로그램을 먼저 실행시키고 돌아옴

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
				
				next.interrupt();//현재 thread를 (중지)막으므로써 다음 thread를 깨움
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
		
		//interrupt 순서를 정할 수 있다
		th2.interrupt();
		try {
			th2.join();
			th2.join();
			th3.join();
			
		} catch (Exception e) {
		}
	}
}
