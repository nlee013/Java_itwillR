package com.score1;

public class ScoreMain {

	public static void main(String[] args) {

		Score ob = new Score();
		
		ob.set();
		//ob.inwon = 4;-> �̷��� ���� error��. ���߿� �ȶ߰� ��� ����.
		ob.input();
		//ob.ranking(); -> private �߱� ����
		ob.print();
	}
	
}
