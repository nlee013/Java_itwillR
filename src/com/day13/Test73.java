package com.day13;

import java.util.Vector;

class Test{
	String name;
	int age;
}

public class Test73 {

	public static void main(String[] args) {

		//�迭�ȿ� class �� �� ����.
		Vector<Test> v = new Vector<>();
		
		//Test ob = new Test();
		Test ob;//Test�� class�ϱ� �ʱⰪ null
		ob = new Test();
		ob.name = "suzi";
		ob.age = 27;
		v.add(ob);//ob�� v(vector)�� ����
		
		//Test ob1 = new Test();
		ob = new Test();
		ob.name = "Inna";
		ob.age = 41;
		v.add(ob);
	
		for(Test t : v)
			System.out.println(t.name + ":" + t.age);
	}
}
