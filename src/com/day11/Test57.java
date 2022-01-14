package com.day11;

//Singleton �� ����صα�: static?

class Sing{
	
	private static Sing ob;//static �� ������ class ����
	
	public static Sing getInstance() {
		
		if(ob == null)
			ob = new Sing();
		return ob;
	}
	
	
}

public class Test57 {

	public static void main(String[] args) {

		Sing ob1 = Sing.getInstance();//ob1�� �ּ���
		Sing ob2 = Sing.getInstance();
		
		if(ob1 == ob2)//�ּ� ��
			System.out.println("������ ��ü...");
		
		//�� ������ ��ü�ΰ�?
		
	}

}
