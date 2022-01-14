package com.score4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score4{

	private List<ScoreVO> lists = new ArrayList<>();
	//Interface�տ� ���� �ڿ� Class �� ���� ��(���� �ٲ㵵 ���������� �̷��� ����  ���� �� ����)
	Scanner sc = new Scanner(System.in);
	@Override
	public int input() {
		
		int result = 0;//��� �Ǵµ� DB ��� ���ϰ� ���� �� int�� void�� ��.
		//DB����� �� int result = 0; ���
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("Type your �й�? :");
		vo.setHak(sc.next());
		
		System.out.print("Type your name: ");
		vo.setName(sc.next());
		
		System.out.println("Type your Korean score: ");
		vo.setKor(sc.nextInt());
		
		System.out.println("Type your English score: ");
		vo.setEng(sc.nextInt());
		
		System.out.println("Type your Mathematics score: ");
		vo.setMat(sc.nextInt());
		
		lists.add(vo);
		
		return result;// <-result: DB �� �� ��������
	}

	@Override
	public void print() {//�� ���� �����ϰ� ����ϴ� �ڵ�
		
		Iterator<ScoreVO> it = lists.iterator();
		
		while(it.hasNext()) {
			
			//�ϳ��ϳ� Ǯ���ߵ�. �ȱ׷��� hash code�� ����
			ScoreVO vo = it.next();
			System.out.println(vo.toString());
			/*System.out.printf("%6s %6s %4d %4d %4d %4d %4d\n"
								, vo.getHak(), vo.getName()
								, vo.getKor(), vo.getEng(), vo.getMat()
								, (vo.getKor() + vo.getEng() + vo.getMat())
								, (vo.getKor() + vo.getEng()+ vo.getMat())/3);*/
		}
	}

	@Override
	public void searchHak() {
		
		System.out.print("Type �й� you want to search in here: ");
		
		String hak = sc.next();//����ڰ� �Է��� �й� string ������ �ִ� ��
		
		Iterator<ScoreVO> it = lists.iterator();
		
		while(it.hasNext()) {
			
			ScoreVO vo = it.next();
			
			if(vo.getHak().equals(hak)) {//(hak).equalsvo.getHak()�� �ص� ��
				//hak�� �����÷��� �տ� getHak ��ߵ�
				
				System.out.println(vo.toString());//vo�� ��ü ��±� toString
				break;//���� ���� �ڵ带 �������Ͷ�. return�� �ƿ� ����. stop��
			}
		}
	}

	@Override
	public void searchName() {
		
		System.out.println("Type name you want to type in here: ");
		String name = sc.next();
		
		Iterator<ScoreVO> it = lists.iterator();
		
		while(it.hasNext()) {
			
			ScoreVO vo = it.next();//���� vo, it �̸��� ���Ƶ� ����. method �ȿ����� ��.
			
			if(vo.getName().equals(name))
				
				System.out.println(vo.toString());
				//break;
		}
		//System.out.println("");
	}

	@Override//������ ũ�� �۴� �� ����
	public void descSortTot() {//���� ��������
		
		//������ Anonymous class
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() < vo2.getTot()? 1:-1;//���� ���Ĺ��
				//return vo1.getHak().compareTo(vo2.getHak());//���� �񱳹��
				//< �� ū ���� �������� �����ڴ� (��������)
				
				//return vo1.getTot() < vo2.getTot()? 1:-1;���� 
				//Compare�� ������ true �� �� 1�̹Ƿ� ���� sort,
				//������ false �� �� -1�̹Ƿ� ���� X sort XS
				
			}
		};
		
		//����//���� ����� �������� ���.
		
		Collections.sort(lists, comp);//(lists, ���Ĺ��)
		
		//method �ȿ� method ȣ�Ⱑ��
		print();
	}

	@Override
	public void ascSortHak() {
		
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				//return vo1.getTot() < vo2.getTot()? 1:-1;//���� ���Ĺ��
				return vo1.getHak().compareTo(vo2.getHak());//���� �񱳹��
			}
		};
		
		Collections.sort(lists, comp);//(lists, ���Ĺ��)
		
		print();
	}

	@Override
	public void deleteHak() {
		
		System.out.println("Type �й� you want to delete in here: ");
		String hak = sc.next();
		
		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {
		ScoreVO vo = it.next();
		
		if(vo.getHak().equals(hak))
			
			lists.remove(vo);//lists�� ���� data �̹Ƿ�. ���� vo�� �����.
			break;
		}
	}
}
