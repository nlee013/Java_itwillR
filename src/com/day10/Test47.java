package com.day10;

class Test{
	
	private String title;
	protected double area;
	
	public Test() {} //�⺻ ������
	
	public Test(String title) {//overloading ������
		this.title = title;
	}
	
	public void write() {//�Ϲ� method
		System.out.println(title + ":" + area);
	}
}

class Circle extends Test{
	
	private int r;
	protected static final double PI = 3.14;
	//static �޸𸮿� �˾Ƽ� �ö�.
	//final ���. ������ �� ���� �ȹٲ�
	
	public Circle(int r) {//overloading ������ ���.
	//super �⺻ �����ڰ� �����Ǿ��־ ���� �⺻�����ڰ� �ֱ� ������ error ����
		
		super("��");//overloading ������ ���.���ο� 1���� ȣ��
					//�ڽ� ���� �θ� ���� �����Ǿ�� �ϹǷ� ���� ȣ��
		this.r = r;
	}
	
	public void circleArea() {
		area = (double)r*r*PI;
	//�տ� double �� ������ Ȯ���ϰ� �ϱ� ���� ���� ��� ����
	}
}

class Rect extends Test{ //�⺻ ������ ���
	
	private int w, h;
	
	public void rectArea(int w, int h) {
		
		this.w = w;
		this.h = h;
		
		area = w*h; //�ʱ�ȭ //area�� �θ𲨷� ���� ���� Ȯ��
	}
	
	//Override/overriding �������̵�.
	//�����ε����� �������̵带 ���� ����ϴ� ����: �ڹٴ� ��ӹ޾� ���� �����
	
	//�θ��� class�� ������(������)�ؼ� ���
	//����: 1) �ݵ�� ��� ���迡�� ���� ������ �ϴ� method�� �̸��� ���Ͻ�Ű�� �۾�
	//		2) method�� �̸��� �θ��� method�� ��Ȯ�� ���ƾ� �ȴ�
	
	//�Ʒ� write()�� ���� write()ó�� method �̸��� ���� ���� ���� ������ �Ѵ�.
	
//-------------------------------------------------------------------------------------------
	
	/*public void write() {//�θ��� write()��� ���İ� �����ʾ� ���� ��� ����.
						//���� ���� print()-> �θ� ��� �̸��� ���� write()�� �ٲ㵵 ��
		
		System.out.println("Width: " + w + "\nHeight: " + h);
		System.out.println("Area: " + area);
		
		//super.write():
		//-> �θ�� �ڽ� ���� (��Ӱ���) �ȿ����� ��밡��
	}*/
	
//-------------------------------------------------------------------------------------------
	
	/*@Override
	 //-> Annotation.@override�� ������.
	//�� ���� ���� �� method�� �̸��� �θ�� �ٸ��� error ��
	public void write() {
	//������� ��Ŭ�� source-> override.implement�� interface�� ���߿� ��뿹��
		
		//super.write();
		
		System.out.println("Width: " + w + "\nHeight: " + h);
		System.out.println("Area: " + area);
	}*/
	
//-------------------------------------------------------------------------------------------
	@Override //������� w �ۼ� �� ctrl + space ������ override�� �� ó���� ��
		public void write() {
			//super.write();
		
			System.out.println("Width: " + w + "\nHeight: " + h);
			System.out.println("Area: " + area);
		}
	
}

public class Test47 {

	public static void main(String[] args) {
		
		Circle ob1 = new Circle(10);//overloading ������ ���
		ob1.circleArea();//method ȣ��
		ob1.write();//�θ��� method ���
		
		Rect ob2 = new Rect();//overloading�� �������� �ʾ����Ƿ� �⺻�����ڸ� ����Ѵ�
		ob2.rectArea(10, 20);//method ȣ��
		ob2.write();//������ ���� ��� ������ method ���//Rect�� void ���
		
	}
}
