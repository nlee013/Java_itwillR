package com.naver;
//���� : List Collection���� ȸ������ �����
//�޴�: ȸ������, ȸ�� ��ü ���, ���̵� �˻�
//����: ȸ�� ���� �� ���̵�� 8~15�� �̳�, ������ ���� ȥ��

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NaverImpl implements Naver {

	private List<NaverVO> lists = new ArrayList<NaverVO>();
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public int input() {
		
		int result = 0;
		
		try {
			NaverVO vo = new NaverVO();
		
			System.out.print("Create an ID: ");
			
			String id = sc.next();
			createId(id);
			vo.setId(id);
			
			System.out.print("Type your name: ");
			vo.setName(sc.next());
		
			System.out.print("Create Password: ");
			
			String pw1 = sc.next();
			createPw(pw1);
			vo.setPw1(pw1);
			
	//		System.out.print("Check upper Password: ");
	//		vo.setPw2(sc.next());
			
			System.out.print("Press a number if your gender is 1) Female 2)Male: ");
			vo.setGender(sc.nextInt());
			
			System.out.print("Type your birthday [YYYY/MM/DD]: ");
			vo.setBirth(sc.next());
			
			System.out.println("Type your email [xxxx@xxx.xxx]: ");
			vo.setEmail(sc.next());
			
			System.out.println("Type your mobile number [010-XXXX-XXXX]: ");
			vo.setTel(sc.next());
			
			lists.add(vo);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}

	@Override
	public void searchId() {
		
		System.out.print("Type an ID to search: ");
		
		String id = sc.next();
		
		Iterator<NaverVO> it = lists.iterator();
		
		while(it.hasNext()) {
			
			NaverVO vo = it.next();
			
			if(vo.getId().equals(id)) {
				
				System.out.println(vo.toString());
				break;
			}
		}
	}

	public void createId(String id) throws Exception {
		
		if((id.length() < 5 || id.length() >10)) {
			
			throw new Exception("���̵�� 5~10�� �̳��� �Է� �����մϴ�.");
		}	
	}

	public void createPw(String pw1) throws Exception {
		
		if((pw1.length() < 8 || pw1.length() >12)) {
			
			throw new Exception("��й�ȣ�� ������, ���� ������ 8~1�� �̳� �Է� �����մϴ�.");
		}	
		
		boolean eng = false;
		boolean num = false;
		
		for(int i = 0; i < pw1.length(); i++) {
			
			char ch = pw1.charAt(i);
			
			if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				eng = true;
			}else if((ch >= '0' && ch <= '9')) {
				num = true;
			}
		}
		
		if(eng == false || num == false)	
			throw new Exception("�����ڿ� ���� ȥ�븸 �����մϴ�.");
	}

	@Override
	public void print() {
		
		Iterator<NaverVO> it = lists.iterator();
		
		//try {
			
		while(it.hasNext()) {
			
			NaverVO vo = it.next();	
			System.out.println(vo.toString());
		}
		/*}
		catch (Exception e) {
			System.out.println(e.toString());
		}*/
		
	}

	public void samePw() throws Exception {
		
		Iterator<NaverVO> it = lists.iterator();
		
		while(it.hasNext()) {
			
			NaverVO vo = it.next();
			
			if(vo.getPw1().equals(vo.getPw2())) {
				
				throw new Exception("��й�ȣ�� ���� �ʽ��ϴ�.");
			}
		}
	}

	@Override
	public void updatePw() {
		System.out.println("Type your ID: ");
		String id = sc.next();
		
		Iterator<NaverVO> it = lists.iterator();
		
		while(it.hasNext()) {
			
			NaverVO vo = it.next();
			
			if(vo.getId().equals(id))
				System.out.println(vo.toString());
			else System.out.println("Ʋ�� ���̵� �Դϴ�!");
		}
		
		System.out.println("Type your Password: ");
		String pw = sc.next();
		
		while(it.hasNext()) {
			
			NaverVO vo = it.next();
			
			if(vo.getPw1().equals(pw)) {
				System.out.println("\n�α��� ����!");
				System.out.println(vo.toString());
				
			}else System.out.println("Ʋ�� ��й�ȣ �Դϴ�!");
		}
//		System.out.println("Type your new Password: ");
//		String NewPw = sc.next();
	}
}
