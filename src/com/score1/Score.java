		package com.score1;

import java.util.Scanner;

public class Score {
	
	//int[] inwon; -> inwon이라는 배열 생성(몇개인지 모르지만)
	
	int inwon;
	
	//Record[] rec = new Record[3];	
	Record[] rec; //-> rec 라는 배열 생성("). 초기값 null값
	
	Scanner sc = new Scanner(System.in);

	public void set() {
		
		do {
			System.out.print("인원수?: "); //3
			inwon = sc.nextInt();
			
		}while(inwon < 1 || inwon > 10);
		
		rec = new Record[inwon];
	}
	
	//void는 반환값이 없음.
	public void input() {
		
		String[] title = {"Korean", "English", "Mathematics"};
		
	//--------- 긴 코드를 압축하는 코드는 for문
		for(int i = 0; i < inwon; i++ ) {
				
		rec[i] = new Record(); //rec[i] = new Record(); -> Record의 rec 방 안에 [0] 첫번째 방에 name 값을 넣기 위해 생성
		
		System.out.print("Type your name: "); //nayoung
		rec[i].name = sc.next();
		
		for(int j = 0; j < 3; j ++) {
		
			System.out.print(title[j]); //50
			rec[i].score[j] = sc.nextInt();
			
			rec[i].tot += rec[i].score[j]; //총점은 누적이니까 += 로 표기.
		}
		
		rec[i].ave = rec[i].tot/3;	
		
	 }
	}
	
	private void ranking() {//
		
		int i, j;
		
		for(i  = 0; i < inwon; i++ ) {
		
			rec[i].rank = 1;
		}
		
		//selection sort
		
		for(i = 0; i < inwon-1; i++) {
			
			for(j=0; j< inwon; j++) {
				
				if(rec[i].tot > rec[j].tot) {
					rec[j].rank++;
				}else if(rec[i].tot < rec[j].tot) {
					rec[i].rank++;
					
				}
			}
		}
	}
	
	public void print() {
		
		ranking(); //method안에서 method 호출 가능.
				   //ranking이 private으로 만들었지만 내부 print method에서는 호출이 가능.
		
		for(int i = 0; i < inwon; i++) {
			
			System.out.printf("%6s", rec[i].name);
			
			for(int j = 0; j < 3; j++) {
				
				System.out.printf("%4d", rec[i].score[j]);
			}
			
			System.out.printf("%4d", rec[i].tot);
			System.out.printf("%4d", rec[i].ave);
			System.out.printf("%4d\n", rec[i].rank);
		}
	}
	
}
