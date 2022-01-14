package com.day9;

//call by value
//-> Stack ������ Heap�������� data�� �Ѿ(data�� �Ѿ�� ����ǰ� ó���Ǵ°�)
//call by reference(���÷� ����ֽ� ���� ��-> ���� �Ȱ��� ���������� ��� ���� ���ڳ��� ���� ����ȣ�� ���� ����)
//-> ���� �ѱ� �� ��ü�� ������ �ּҰ� �Ѿ

class Test{
	
	public int x = 10;
	
	//�⺻ �����ڰ� �����Ǿ�����
	
	public void sub(int a) {
		x += a;// x = x + a;
	}
	
}
public class Test44 {

	public static void main(String[] args) {
		
		Test ob = new Test();
		
		//Call by Value
		
		int a = 20;
		
		System.out.println("Sub()Method ���� �� x: "+ ob.x);//10
		
		ob.sub(a);
		System.out.println("Sub()Method ���� �� x: "+ ob.x);//30
		
		//Call by reference 
		Test ob1;//������ �¾ƾߵ� -> ob1 �տ� ���� �ڷ����� ���ߵ�.
				 //EX) Test��� class�� ob1�տ� �پ�ߵ�
		ob1 = ob;
		
		System.out.println(ob.x);//30
		System.out.println(ob1.x);//30
		
		ob1.x = 100;
		System.out.println(ob1.x);
		

	}

}
