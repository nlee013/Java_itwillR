package com.day13;

import java.util.List;
import java.util.Vector;

//Collection Framework(�����)

//�迭�� ����
//1) �迭�� ũ�⸦ ���ϸ�, ���� �Ұ���. �� �ʱⰪ�� �־�ߵ�
//2) �̸� ũ�� ������ �޸� ���� �� �� ����
//3) �迭 ���̿� �迭�� ���� �Ұ���

//List, Vector, Set, Map, Hashtable, TreeSet, HashSet
//���� ��� : ArrayList, Vector

//List : Interface��.�� interface�� �����ϴ� ArrayList class, Vector class�� �ִ�
//class�� ������ implements�� �ؾߵǰ� lnterface�� �� �ʿ����
//Vector: ����ȭ ����, 
//ArrayList : ����ȭ X

//Map : Interface��. Map�� key ���� ������ �־ �� ������. Hashtable class, HashSet class�� �ִ�.

//Interface�� ����Ҵ�.
public class Test70 {

	private static final String[] city = {"Seoul, Busan, Degu, Inchon, Gwangju, Daejeon, Woolsan"};
	
	public static void main(String[] args) {

		//Vector<E>//�⺻ deafault �ڷ���: Object
		//Vector�θ� ����ϸ� Object�� ����ϴ� ��
		Vector v = new Vector<>();//<>�� �տ� ��� �����ص� ������ String���� <>�ȿ� ���� �� ��ߵ�
		
		//List l = new Vector<>();�̷��� ���߿� ��밡��.
		//List�� Interface, Vector�� Interface�� �����ϴ� class
		
		v.add("Seoul");//upCast
		v.add(30);//upCast
		v.add('c');//upCast
		
		//String s = v.get(0);//error -> ������ �� object���� �̹Ƿ� downCast�� �ؾߵ�
		String s = (String)v.get(0);//�迭ó�� �����. index [0]��°.String���� downCast
		System.out.println(s);
		
		Integer i = (Integer)v.get(1);//Integer���� downCast
		System.out.println(i);
		
		char c = (char)v.get(2);//Character�� downCast
		System.out.println(c);
	}

}
