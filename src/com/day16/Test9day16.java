package com.day16;
//정해진 시간마다 특정 작업을 반복해서 실행할 때

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

//thread가 상속받게 만들기
public class Test9day16 extends Thread{
	
	//c.getTime()를 3000(3초)를 찍는다고 할 때
	//시작하자마자 1초를 찍기 때문에 초기값 0을 먼저 찍고 정한 시간차 순대로 출력되는 것
	
	//private int num = 0;
	private int num;
	
	public Test9day16() {
		TimerTask task = new TimerTask() {//java.util에 있음.자동 override
			
			@Override
			public void run() {
				//반복 실행할 작업 작성
				num = 1;
			}
		};
		
		Timer t = new Timer();//java.util
		Calendar c = Calendar.getInstance();
		
		//현재ㅐ 시점으로부터 5초마다 이 작업(num을 0으로 초기화)을 실행해라
		t.schedule(task, c.getTime(), 5000);
		
		//EX) 내일 00시 00분 00초 ~ 하루에 1번씩 반복 작업을 할 때
		/*
		c.add(Calendar.DATE, 1);
		c.set(Calendar.HOUR, 0);//오후1시 = 13시 이므로 13으로 작성
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);//자세한 시간을 위해 이것까지 작성
		t.schedule(task, c.getTime(), 1000*60*60*24);//밀리세컨드*초*분*시
		*/
	}
	
	//t.schedule(task, c.getTime(), 5000);이므로 아래 작업을 5초마다 반복 실행
	@Override
	public void run() {
		
		while(true) {
			
			System.out.println(num++);
			
			try {
				sleep(1000);//1초마다
			} catch (Exception e) {
				
			}
		}
	}
	
	public static void main(String[] args) {

		//Test9day16 ob = new Test9day16();
		//ob.start();
		
		//위 코드와 동일
		new Test9day16().start();//Event 단계에서 많이 사용예정
	}
}
