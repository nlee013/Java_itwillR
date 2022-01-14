package com.score3;

public class ScoreMain {

	public static void main(String[] args) {

		Score ob = new ScoreImpl();//자주 사용
		ob.set();
		ob.input();
		ob.print();
	}

}
