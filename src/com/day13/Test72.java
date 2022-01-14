package com.day13;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Test72 {

	private static final String[] city = {"Seoul", "Busan", "Degu", "Inchon", "Gwangju", "Daejeon", "Woolsan"};

	public static void main(String[] args) {


		//Generic : Collection�� �ڷ���
		Vector<String> v = new Vector<>();
		
		String str;
		
		System.out.println("Vector�� �ʱ� �뷮: " + v.capacity());//10
		
		for(String s : city) {
			v.add(s);
		}
		
		Iterator<String> it = v.iterator();//<-����. ������ �ȹٲ�
		
		while(it.hasNext()) {
			
			str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println("...Data�� ����: " + v.size());//7
		
		//Revise ����
		v.set(0, "Seoul");//index [0]�� Seoul�� �ٲ��
		v.set(1, "Busan");
		
		for(String s : v) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		//Insert ����
		v.insertElementAt("���ѹα�", 0);//index [0]�� Seoul�� [1]�� ���� [0]�� ���ѹα��� ��
		
		for(String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("Vector�� �뷮: " + v.capacity());//10
		System.out.println("...Data�� ����: " + v.size());//8
		
		//index �˻�
		int index = v.indexOf("Degu");//"�뱸"�� �ִ� ���� index���� �����Ͷ�
		
		if(index != -1) {//data�� ����. "���� ������~"�̶�� �ǹ�. != -1 ��¥ ���� ���. �� ����ϱ�
			System.out.println("Success!! " + index);
		}else {
				System.out.println("Fail!! " + index);
		}
		
		//��������
		Collections.sort(v);
		
		for(String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//��������
		Collections.sort(v, Collections.reverseOrder());; //comparator ����ϱ�
		//reverseOrder() ������ �����ض�
		
		for(String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//Delete ����
		v.remove(7);//v.remove("Busan");//���� �̸� �� ���� ����
		
		for(String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//�뷮 ����
		for(int i = 1; i <= 20; i++) {
			v.add(Integer.toString(i));//����(����)
		}
		System.out.println();
		System.out.println("Vector�� �뷮: " + v.capacity());//10���� ����
		System.out.println("...Data�� ����: " + v.size());// 7 + 20 = 27
		
		//���� ����
		for(int i = 1; i <= 10; i ++) {
			v.remove(5);
		}
		for(String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("Vector�� �뷮: " + v.capacity());
		System.out.println("...Data�� ����: " + v.size());
		System.out.println();
		
		//������ ���� �ʴ� (�̻��)���� ����
		v.trimToSize();
		
		System.out.println("Vector�� �뷮: " + v.capacity());
		System.out.println("...Data�� ����: " + v.size());
		System.out.println();
		
		//��� data ����(�� ���� ��� ������ ����)
		v.clear();
		System.out.println("Vector�� �뷮: " + v.capacity());//�� ���� 17�� �״��
		System.out.println("...Data�� ����: " + v.size());
		
		v.trimToSize();//�� ������
		
		System.out.println("Vector�� �뷮: " + v.capacity());
		System.out.println("...Data�� ����: " + v.size());
		
	}

}
