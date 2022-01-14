package com.day12;

class SuperTest{//�θ�
	
	public int a = 10, b = 20;
	
	public void write() {
		System.out.println("Super class write() method...");
	}
	
	public int hap() {
		return a + b; //30
	}
}

class SubTest extends SuperTest{//�ڽ�
	
	public int b =100, c = 200;
	
	public void print() {
		System.out.println("Sub class print() method...");
	}
	
	@Override
	public int hap() {
		return a + b + c;//10 + 100 + 200 = 310
	}

}

public class Test62 {

	public static void main(String[] args) {

		SubTest ob1 = new SubTest();
		System.out.println(ob1.b);//100
		
		SuperTest ob2 = ob1; //�Ͻ��� ����ȯ.ob1�� ob2�� ����-> �θ�ȭ��->upCast
		System.out.println(ob2.b);//20
		
		System.out.println(ob2.hap());//310 ->hap() method�� �ڽĲ�
		
		ob2.write();
		
		((SubTest)ob2).print();// �θ� �ڽ�����..? downCast
	}

}
