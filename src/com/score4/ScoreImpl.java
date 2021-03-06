package com.score4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score4{

	private List<ScoreVO> lists = new ArrayList<>();
	//Interface앞에 쓰고 뒤에 Class 를 많이 씀(둘이 바꿔도 무관하지만 이렇게 쓰는  것이 더 좋음)
	Scanner sc = new Scanner(System.in);
	@Override
	public int input() {
		
		int result = 0;//없어도 되는데 DB 사용 안하고 없을 땐 int를 void로 씀.
		//DB사용할 때 int result = 0; 사용
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("Type your 학번? :");
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
		
		return result;// <-result: DB 할 때 쓸모있음
	}

	@Override
	public void print() {//비교 없이 순수하게 출력하는 코딩
		
		Iterator<ScoreVO> it = lists.iterator();
		
		while(it.hasNext()) {
			
			//하나하나 풀어써야됨. 안그러면 hash code가 나옴
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
		
		System.out.print("Type 학번 you want to search in here: ");
		
		String hak = sc.next();//사용자가 입력한 학번 string 변수에 넣는 것
		
		Iterator<ScoreVO> it = lists.iterator();
		
		while(it.hasNext()) {
			
			ScoreVO vo = it.next();
			
			if(vo.getHak().equals(hak)) {//(hak).equalsvo.getHak()로 해도 됨
				//hak을 가져올려면 앞에 getHak 써야됨
				
				System.out.println(vo.toString());//vo의 자체 출력기 toString
				break;//실행 중인 코드를 빠져나와라. return은 아예 종료. stop임
			}
		}
	}

	@Override
	public void searchName() {
		
		System.out.println("Type name you want to type in here: ");
		String name = sc.next();
		
		Iterator<ScoreVO> it = lists.iterator();
		
		while(it.hasNext()) {
			
			ScoreVO vo = it.next();//위에 vo, it 이름이 같아도 무관. method 안에서는 모름.
			
			if(vo.getName().equals(name))
				
				System.out.println(vo.toString());
				//break;
		}
		//System.out.println("");
	}

	@Override//총점은 크다 작다 비교 가능
	public void descSortTot() {//총점 내림차순
		
		//무명의 Anonymous class
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() < vo2.getTot()? 1:-1;//숫자 정렬방법
				//return vo1.getHak().compareTo(vo2.getHak());//문자 비교방법
				//< 는 큰 값을 왼쪽으로 보내겠다 (오름차순)
				
				//return vo1.getTot() < vo2.getTot()? 1:-1;에서 
				//Compare은 조건이 true 일 때 1이므로 실행 sort,
				//조건이 false 일 때 -1이므로 실행 X sort XS
				
			}
		};
		
		//정렬//정렬 방법을 쓰기위해 사용.
		
		Collections.sort(lists, comp);//(lists, 정렬방법)
		
		//method 안에 method 호출가능
		print();
	}

	@Override
	public void ascSortHak() {
		
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				//return vo1.getTot() < vo2.getTot()? 1:-1;//숫자 정렬방법
				return vo1.getHak().compareTo(vo2.getHak());//문자 비교방법
			}
		};
		
		Collections.sort(lists, comp);//(lists, 정렬방법)
		
		print();
	}

	@Override
	public void deleteHak() {
		
		System.out.println("Type 학번 you want to delete in here: ");
		String hak = sc.next();
		
		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {
		ScoreVO vo = it.next();
		
		if(vo.getHak().equals(hak))
			
			lists.remove(vo);//lists가 원본 data 이므로. 꺼낸 vo를 지우기.
			break;
		}
	}
}
