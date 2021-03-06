package com.day16;

//Thread TTL = Time to Live = Thread가 살아 있는 시간
class MyThread6 extends Thread{
	
	@Override
	public void run() {

		//sleep은 try catch문 안에 써줘야됨. 안쓰면 compilt error
		try {
			System.out.println("Thread 시작...");
			
			System.out.println("우선 순위" + getPriority());//getPriority() 우선순위
			System.out.println("Name of Thread: " + getName());
			
			//0.5초만 쉬어
			sleep(500);
			
			//우선순위 변경
			setPriority(2);
			System.out.println("변경된 우선순위: " + getPriority());
			
			System.out.println("Thread 종료...");
			
		} catch (Exception e) {

		}	
	}
	
}

public class Test6day16 {

	public static void main(String[] args) {

		Thread th1 = Thread.currentThread();//현재(main)Thread를 th1에 넣어라
		Thread th2 = new MyThread6();
		
		System.out.println("Main Thread 우선순위:" + th1.getPriority());//5 -> thread의 기본값은 5이다.
		System.out.println("현재 Thread의 이름" + th1.getName());//main
		System.out.println("th2 Thread의 이름" + th2.getName());//Thread-0
		
		//th2가 실행이 되었나?(살아있나?)
		System.out.println("th2.start() method 호출 전의 isAlive: " + th2.isAlive());//false//죽음
		
		th2.start();
		
		//th2 우선순위
		System.out.println("th2 우선순위: " + th2.getPriority());//5
		
		//th2의 우선순위 변경
		th2.setPriority(1);
		
		try {
			//0.1초
			Thread.sleep(100);//main보고 0.1초 쉬라는 것
			
			//th2 종료확인
			System.out.println("th2 살아있나?: " + th2.isAlive());
			
			//1초
			Thread.sleep(1000);
			System.out.println("1초 sleep후 th2 살아있나?: " + th2.isAlive());
			
			th2.join();
			
			System.out.println("그래도 살아있나?: " + th2.isAlive());
			
		} catch (Exception e) {
			
		}
	}

}
