package com.naver;
//과제 : List Collection으로 회원가입 만들기
//메뉴: 회원가입, 회원 전체 출력, 아이디 검색
//조건: 회원 가입 시 아이디는 8~15자 이내, 영문자 숫자 혼용

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
			
			throw new Exception("아이디는 5~10자 이내만 입력 가능합니다.");
		}	
	}

	public void createPw(String pw1) throws Exception {
		
		if((pw1.length() < 8 || pw1.length() >12)) {
			
			throw new Exception("비밀번호는 영문자, 숫자 포함해 8~1자 이내 입력 가능합니다.");
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
			throw new Exception("영문자와 숫자 혼용만 가능합니다.");
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
				
				throw new Exception("비밀번호가 같지 않습니다.");
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
			else System.out.println("틀린 아이디 입니다!");
		}
		
		System.out.println("Type your Password: ");
		String pw = sc.next();
		
		while(it.hasNext()) {
			
			NaverVO vo = it.next();
			
			if(vo.getPw1().equals(pw)) {
				System.out.println("\n로그인 성공!");
				System.out.println(vo.toString());
				
			}else System.out.println("틀린 비밀번호 입니다!");
		}
//		System.out.println("Type your new Password: ");
//		String NewPw = sc.next();
	}
}
