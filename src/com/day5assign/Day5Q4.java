package com.day5assign;

import java.util.Scanner;

public class Day5Q4 {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			//월별 날짜수를 배열에 저장
			int[] months = {31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
			
			int y, m, d, nalsu, w, i; //year month d날수 date날짜 day요일 week int i
			
			do {
				//사용자가 어떤 숫자를 입력할지 모르므로 do while문 쓰기
				
				System.out.println("Type any year: "); //2021
				y = sc.nextInt();
				
			}while(y < 1); //1보다 작은 값이 없음
			
			do {
				System.out.print("Type any month: ");
				m = sc.nextInt();
				
			}while(m < 1 || m > 12);
			
			//윤년이 먼저 계산되어야 됨
			if(y%4 == 0 && y%100 != 0 || y%400 == 0) {
				
				months[1] = 29; //윤년일 경우 28->29로 바꿈
			}

			do {
				System.out.print("Type any date: ");
				d = sc.nextInt();
				
			}while(d < 1 || d > months[m-1]);//m-1은 윤년 때문 두번째에 들어가기 때문 2-1 [1]index넘버
			
	
			//1년 1월 1일 ~ 사용자가 입력한 (y-1)년 12월 31일까지의 날수를 구하기
			
			nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
			
			//(m-1)월 말일까지의 날수
			for(i = 0; i< m-1; i++) { //숫자 누적은 += 로 표기
				nalsu += months[i];
			}
			
			nalsu += d; //y년 m월 1일
			
			//주 횟수 계산 (7로 나누기)
			w = nalsu%7;
			
			String[] day = {"월", "화","수","목","금","토","일"};
	
			System.out.printf("year:%d month:%d date:%d %sday", y, m, d, day[w]);
			
	}
}


