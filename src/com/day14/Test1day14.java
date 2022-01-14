package com.day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test1day14 {

	public static void main(String[] args) {

		ArrayList<String> lists = new ArrayList<>();
		
		lists.add("Seoul");
		lists.add("Busan");
		lists.add("Degu");
		
		Iterator<String> it = lists.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		
		//ListIterator
		ListIterator<String> it2 = lists.listIterator();
		
		while(it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}
		System.out.println("\n----------------");
		
		//Previous(): �ڿ��� ������ ����ϴ� method
		//�ι� ����� �����ϴ�. �Ϲ� iterator�� �ٸ���
		
		while(it2.hasPrevious()) {//hasP
			System.out.print(it2.previous() + " ");
		}
		System.out.println();
		
		List<String> list1 = new ArrayList<>();
		list1.addAll(lists);//addAll -> collection�� ���� �� ����
		list1.add("Incheon");
		
		int n = list1.indexOf("Busan");//index �� Busan ã��
		list1.add(n + 1, "Gwangju");
		
		for(String s : list1) {
			System.out.print(s + " ");
		}
		System.out.println("\n----------------");
		
		Iterator<String> it3 = lists.iterator();
		Iterator<String> it4 = list1.iterator();
		while(it3.hasNext()) {
			
			String str = it3.next();
			//String str2 = it4.next();
			
			if(str.startsWith("Bu")) {//Bu�� �����ϴ� String ã��
				System.out.println(str);
			}
			
			/*if(str2.startsWith("In")) {//In�� �����ϴ� String ã��
				System.out.println(str2);
			}*/
		}
	}

}
