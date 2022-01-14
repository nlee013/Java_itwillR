package com.day8;
//static
//1.new�� ������� �ʾƵ� �˾Ƽ� �޸𸮷� �ö󰣴�.
//2.��ü�� 100�� ���� �Ǿ �޸� ������ 1���� ������

public class Test38 {//�� class �����ĸ� class �̸� Test38.a�� �ҷ����� ����
	
	public static int a = 10;//-> class���� or class method�� class�� loading(����)�Ǵ� ����
							//�޸� �Ҵ��� �̷������ [class �̸�, ��ü]�� ���� ���ٰ���
							//->new�� ���� �޸� �Ҵ� ���� �ʾƵ� ��밡��.
	
	//��ü ������ ���α׷� �ȿ� ���Ե�
	
	//instance var or instance method�� new�� ���� �޸� �Ҵ��� �޾ƾ� ��밡��.
	//�ٸ� method ������ ���� ����(ȣ���ؼ� ��밡��)
	//class method������ ���� �Ұ���(ȣ�� X)
	
	private int b = 20;//->instance ����
	
	public void write() {//instance method
		
		System.out.println("class variable a: " + a);
		System.out.println("instance variable b: "+ b);
	}
	
	public static void print() {//class method
		
		System.out.println("class variable a: " + a);
		//System.out.println("instance variable b: "+ b);//compile error -> class method������ ���� �Ұ���
		
	}
	
	public static void main(String[] args) {//���⿡ ��������� ��������
		
		System.out.println("class variable a: " + a); //�巯���� ������ static ����� ����
		System.out.println("class variable a: " + Test38.a);//10	
		
		//write();
		print();//10
		Test38.print();//10
		
		Test38 ob1 = new Test38();
		
		System.out.println("class variable a: " + ob1.a);
		System.out.println("instance variable b: " + ob1.b); //20
		System.out.println("--------------------");
		
		ob1.print();//����� ���� ������ �ǹ�.
		ob1.write();
		System.out.println("--------------------");
		
		Test38 ob2 = new Test38();
		ob2.a = 100;
		ob2.b = 200;
		ob2.write();
		System.out.println("--------------------");
		
		Test38 ob3 = new Test38();
		ob3.a = 1000;
		ob3.b = 2000;
		ob3.write();
		System.out.println("--------------------");
		
		ob1.write();
		ob2.write();
		ob3.write();
		//�� �ڵ忡�� ��°��� ���� class ������ �޸� ������ 1�� ���
		//(�� ������ ���� ��� �־����Ƿ� ������ ���� ��µ�) ��ü�� �� ���� 1���� ����ǰ� �����.
		//instance ������ �޸𸮸� �� �ٸ��� ���Ƿ� ���� �� �ٸ��� ��µ�
	}

}
