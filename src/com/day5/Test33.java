package com.day5;

import com.day6.Rect;
//���� : �ϳ��� file���� �ϳ��� class �� ��
//���� �ϳ��� file�� �ΰ��� class�� �����.
public class Test33 {

	public static void main(String[] args) {

		Rect usa = new Rect();
		usa.input();
		
		int aa = usa.area();
		int ll = usa.length();
		
		usa.print(aa, ll);
		
		Rect usa2 = new Rect();
		usa2.input();
		
		int x = usa2.area();
		int y = usa2.length();
		usa2.print(x, y);
		
		//class�� �ʱⰪ�� null��
		//int�� �����Ⱚ�� ������ new�� �ʱⰪ�� ��
	}

}
