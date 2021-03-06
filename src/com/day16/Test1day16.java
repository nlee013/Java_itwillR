package com.day16;

/*1)Thread class 핵심 메소드는 run() method
2) runnable interface

start
sleep는 꼭 기억하기*/

//thread의 기능 부여->시간 없음->부모화시키기
//(java.lang에 있음 -> 안에 든 것들많이 쓰임)

//Interface으로도 Thread 만들 수 있음
class MyThread extends Thread{
	
	private int num;//MyThread variable
	private String name;//MyThread variable
	
	public MyThread(int num, String name) {
		
		this.num = num;
		this.name = name;
	}
	
	//반드시 필요한 Thread의 Run() method
	@Override
	public void run() {//실행할 작업.자바의 VM이 호출함.다만 start() 명령어로만 VM 호출함
		
		int i = 0;
		
		while(i < num) {//getName() 실무에선 잘 안쓰고 여기선 thread 이름 보여주기 위한 예시일뿐
			System.out.println(this.getName() + ":" + name + i);//Thread의 getName();-> 이름을 보여줌
																//getName()-> 처음 만드는 thread의 이름은 0
			i++;
			
			//반드시 try문
			try {
				
			//Thread는 th1을 먼저 실행해 라는 control이 없음. CPU 따라 달라짐
			//하지만 sleep();으로 0.001초씩 쉬면서 출력 할 수 있게 함
			
				sleep(100);
			} catch (Exception e) {
				
			}
		}
	}
}

public class Test1day16 {

	public static void main(String[] args) {//main thread.main에서부터 밑까지 작업 실행

		System.out.println("Main 시작...");
		
		MyThread th1 = new MyThread(100, "First:");
		MyThread th2 = new MyThread(200, "Second:");
		
		//실행
		th1.start();
		th2.start();
		
		System.out.println("Main 종료...");
	}

}
