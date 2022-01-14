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

		//Set : �ߺ����� ��� X
		Set<String> s = new HashSet<>();
		
		s.add("Seoul");
		s.add("Busan");
		s.add("Degu");
		
		System.out.println(s);
		
		s.add("Seoul");//����.ù��° Seoul ���� ���� �ִ� Seoul�� ������ ��. Seoul�� 2���� �ƴ�.
		
		System.out.println(s);
		
		System.out.println("--------------");
		
		//Stack: Interface�̴�. java.util�� ����. �� �Ⱦ���
		
		Stack<String> st = new Stack<>();
		
		//�Է��� ���� �ݴ�� ��µ�!!
		st.push("Seoul");
		st.push("Busan");
		st.add("Degu");//add�� ����
		
		while(!st.empty()) {//!st.empty()data�� ���� ������ �����ض�
			System.out.println(st.pop());//pop()��� ��ɾ�� �Է��ض�
			}	
		System.out.println("---------------");
		
		//Queue
		Queue<String> q = new LinkedList<>();//offer�� ���
		
		q.offer("Seoul");
		q.offer("Busan");
		q.offer("Degu");
		q.add("Gwangju");//add�� ����
		
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
		
		lists2.addAll(lists1);//Collection�ȿ� collection ���� �� ����. Map�� ����
		
		System.out.println("lists1.........");
		for(String ss : lists1) {
			System.out.println(ss);
		}
		
		System.out.println("\nlists2.........");
		for(String ss : lists2) {
			System.out.println(ss);
		}
		
		lists2.subList(2, 5).clear();//[2]���� [5]������ ���� ������
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
		
		Arrays.sort(str);//�ڸ� �ٲ�
		for(String ss : str) {
			System.out.print(ss + " ");
		}
	}

  }

