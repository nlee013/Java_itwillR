package com.score4;

public interface Score4 {//약간의 강제성이 뜸//여기에 만들면 다른곳에 override 해줘야됨

	public int input();
	
	public void print();
	public void searchHak();//학번 검색
	public void searchName();
	
	//2021-01-07-금
	public void descSortTot();//총점 내림차순
	public void ascSortHak();//학번 오름차순
	public void deleteHak();//학번 삭제
	
}
