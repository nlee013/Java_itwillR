package com.score5;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreImpl implements Score {

	private Map<String, ScoreVO> hMap = new TreeMap<>();
	
	Scanner sc = new Scanner(System.in);
	
	String hak;//����ڰ� �Է��ϴ� �й� ��
	
	@Override
	public void input() {
		
		System.out.print("Type your �й�: ");
		hak = sc.next();
		
		if(searchHak(hak)) {
			
			System.out.println("�߰��� �����߽��ϴ�. �̹� �����ϴ� �й� �Դϴ�.");
			return;//�� �� �ڵ��� �������� ����.
		}
		
		ScoreVO vo = new ScoreVO();
		
		System.out.println("Type your name: ");//suzi
		vo.setName(sc.next());
		
		System.out.println("Type your Korean score: ");//50
		vo.setKor(sc.nextInt());
		
		System.out.println("Type your English score: ");//70
		vo.setEng(sc.nextInt());
		
		System.out.println("Type your Mathematics score: ");//30
		vo.setMat(sc.nextInt());
		
		hMap.put(hak, vo);
		
		System.out.println("�߰��� �����߽��ϴ�!");
	}

	@Override//�й� �˻�
	public boolean searchHak(String hak) {
		
		if(hMap.containsKey(hak)) {
			return true;//�й��� �̹� �����Ѵٴ� ��
		}
		return false;
	}

	@Override
	public void print() {
		
		Iterator<String> it = hMap.keySet().iterator();
		
		while(it.hasNext()) {
			
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			
			System.out.println(hak + " " + vo.toString());
		}
	}

	@Override
	public void delete() {//searchHak ��
		
		System.out.println("Type �й� you want to delete in here: ");
		String hak = sc.next();
		
		Iterator<String> it = hMap.keySet().iterator();
		
		while(it.hasNext()) {
			
			ScoreVO vo = hMap.get(hak);
		
			if(hMap.containsKey(hak)) {
			
				hMap.remove(hak);
				System.out.println("���� ����!!!");
				//break;
			}else{
				System.out.println("���� ����!!!");
			}
		}
		
	}

	@Override
	public void update() {//searchHak ��//�й� ���� ���� ���� ����
		
		System.out.println("First, type your �й� : ");
		
		String hak = sc.next();
		
		if(!searchHak(hak)){
			System.out.println("������ ���� �߽��ϴ�!!");
			return;			
		}
		
		Iterator<String> it = hMap.keySet().iterator();
		
			ScoreVO vo = hMap.get(hak);
			
			//if(hMap.containsKey(hak)) {
			
				System.out.println("Type your Korean score: ");//50
				vo.setKor(sc.nextInt());
				
				System.out.println("Type your English score: ");//70
				vo.setEng(sc.nextInt());
				
				System.out.println("Type your Mathematics score: ");//30
				vo.setMat(sc.nextInt());
				
				hMap.put(hak, vo);
				
				System.out.println("������ �����߽��ϴ�!");
			}
	//}

	@Override
	public void findHak() {//searchHak ��
		
		System.out.println("Type your �й� want to find in here: ");
		String hak = sc.next();
		
		Iterator<String> it = hMap.keySet().iterator();
		
			/*ScoreVO vo = hMap.get(hak);
		
			if(hMap.containsKey(hak)) {
			
				System.out.println(vo.toString());
			}*/
		
		if(!searchHak(hak)){
			System.out.println("�й��� �������� �ʽ��ϴ�.�˻� ����!!!");
			return;
		}

		ScoreVO vo = hMap.get(hak);
		System.out.println(hak + vo.toString());
		
	}

	@Override
	public void findName() {
		
		System.out.println();
		System.out.println("Type you Name want to find in here: ");
		
		String name = sc.next();
		
		Iterator<String> it = hMap.keySet().iterator();
		
		//�̸� �˻��� ������ �� boolean ����
		boolean flag = false;
		
		while(it.hasNext()) {
			
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			
			if(vo.getName().equals(name)) {
				
				System.out.println(hak + " " + vo.toString());
				flag = true;
			}
			
		}
		if(!flag) {
			System.out.println("�˻��� �����߽��ϴ�. ���� �Է��Ͻ� �̸��� �������� �ʽ��ϴ�.");
		}else {
			System.out.println("�˻��� �����Ͽ����ϴ�!");
		}
	}

}
