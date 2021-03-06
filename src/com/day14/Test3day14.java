package com.day14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Test3day14 {

	public static void main(String[] args) {

		//Set : 중복값을 허용 X
		Set<String> s = new HashSet<>();
		
		s.add("Seoul");
		s.add("Busan");
		s.add("Degu");
		
		System.out.println(s);
		
		s.add("Seoul");//수정.첫번째 Seoul 위에 여기 있는 Seoul이 덮여진 것. Seoul이 2개가 아님.
		
		System.out.println(s);
		
		System.out.println("--------------");
		
		//Stack: Interface이다. java.util에 있음. 잘 안쓰임
		
		Stack<String> st = new Stack<>();
		
		//입력한 순서 반대로 출력됨!!
		st.push("Seoul");
		st.push("Busan");
		st.add("Degu");//add도 가능
		
		while(!st.empty()) {//!st.empty()data가 있을 때까지 실행해라
			System.out.println(st.pop());//pop()라는 명령어로 입력해라
			}	
		System.out.println("---------------");
		
		//Queue
		Queue<String> q = new LinkedList<>();//offer를 사용
		
		q.offer("Seoul");
		q.offer("Busan");
		q.offer("Degu");
		q.add("Gwangju");//add도 가능
		
		while(q.peek() != null) {
			System.out.println(q.poll());
		}
		System.out.println("---------------");
		
		List<String> lists1 = new LinkedList<>();
		
		lists1.add("A");
		lists1.add("B");
		lists1.add("C");
		lists1.add("D");
		lists1.add("E");
		lists1.add("F");
		lists1.add("G");
		lists1.add("H");
		lists1.add("I");
		
		List<String> lists2 = new LinkedList<>();
		
		lists2.add("Seoul");
		lists2.add("Busan");
		lists2.add("Degu");
		
		lists2.addAll(lists1);//Collection안에 collection 넣을 수 있음. Map도 가능
		
		System.out.println("lists1.........");
		for(String ss : lists1) {
			System.out.println(ss);
		}
		
		System.out.println("\nlists2.........");
		for(String ss : lists2) {
			System.out.println(ss);
		}
		
		lists2.subList(2, 5).clear();//[2]부터 [5]까지의 값이 지워짐
		System.out.println("\nlists2.........");
		for(String ss : lists2) {
			System.out.println(ss);
		}
		
		System.out.println("-------------");
		
		String[] str = {"H","E","L","L","O","!"};
		for(String ss : str) {
			System.out.print(ss + " ");
		}
		System.out.println("\n-------------");
		
		Arrays.sort(str);//자리 바꿈
		for(String ss : str) {
			System.out.print(ss + " ");
		}
	}

  }

