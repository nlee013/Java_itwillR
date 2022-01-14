package com.day12;

import java.util.Scanner;

interface FruitA{
	
	String Won = "��";
	
	public int getPrice();
	public String getName();

}

interface ItemFruit extends FruitA{
	
	public String getItems();
	
}

//class�� �����ų ���� implements
class Orange implements ItemFruit/*, FruitA*/{//������ ��Ӱ���

	@Override
	public int getPrice() {
		return 1500;
	}

	@Override
	public String getName() {
		return "Orange";
	}

	@Override
	public String getItems() {
		return "Fruits";
	}
	
}

class Apple implements ItemFruit{

	@Override
	public int getPrice() {
		return 2000;
	}

	@Override
	public String getName() {
		return "Apple";
	}

	@Override
	public String getItems() {
		return "Fruits";
	}
	
}


public class Test65 {//���� ���� �߿���

	//�Ȱ��� �ڵ��� ���� �� method�� ����Ѵ�!!!
	public void packing(ItemFruit ob/* = new Orange()//= new Apple()*/) {
		
		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Test65 t = new Test65();
		System.out.print("Choose one of 1) Orange 2) Apple :");
		
		int n = sc.nextInt();
		
		if(n == 1)
			t.packing(new Orange());//���߿� new Orange();�� ���°�쵵 ����
		else if(n == 2)
			t.packing(new Apple());
		
		/*
		//Orange ob1 = new Orange();//��ü ����
		//ItemFruit ob1 = new Orange();//�ڽ��� ��ü�� �������� �θ� ����->upCast
		ItemFruit ob;
		
		ob = new Orange();//�޸� �Ҵ�
		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);
		
		//Apple ob2 = new Apple();
		//ItemFruit ob2 = new Apple();//upCast
		//ItemFruit ob;
		
		ob = new Apple();
		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);
		*/
	
		/*
		int a = 10; 
		System.out.println(a);//10

		int b = 20;
		System.out.println(b);//20
		
		//���� ����
		 * 
		int a;
		a = 10;
		System.out.println(a);//10
		
		int b;
		a = 20;
		System.out.println(b); //20
		*/		
		
	}

}
