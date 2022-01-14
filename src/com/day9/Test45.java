package com.day9;
//����: ������ private�� ������.method�� void�� �ִ� ��.
//class������ static���� ������ ����.

//���:�θ� �ڽ����� �ִ� ��
//<��� ����>
//1) �θ𲨴� ������
//2) �θ� private�� ������ ���� ��� �Ұ��� ex) ���÷� �θ�� ���� ���� ���� ��� �Ұ���
//3) protected�� ������ ���� ��� ����.
//4) ������ ������. �θ� ���� ��� �Ұ���
//5) �θ�� �ڽ��� ���� ��ü�� ������ ���� ��, ������ ���� ���

//��� ������ ��� private�� �����ϰ� �ʿ��� ������ protected�� �ٲ㼭 ����ؾߵȴ�.

//<����� ���� 2����>
//1) ���߻��
//2) ���ϻ��

class TestB{
	private String title;
	//private int area;
	protected int area; //protected�� ������ �θ� ������༭ ��Ӱ���.
						//-> �ڽĵ� ��밡��
	
	public void set(String title) {
		
		this.title = title; //�ʱ�ȭ
		//this.area = area; //�θ� area��  protected�� �޾Ƽ� ��Ӱ����ؼ� 
						    //set()�Ȱ� ���ڵ�, �ǾƷ�  rectArea()�ȿ�
							//set("Square", area)�� area�� �� ���� ��������
	}
	
	public void print() {//void�� �ִ� ���� method
		System.out.println(title + ":" + area);
		
	}
}

class RectB extends TestB{//�θ�� �ڽ��� ���� ����.
						  //extends�� ����� Rect�� �ڽ�, TestA�� �θ�.
						  //extends�ڿ��� 1���� ����
	private int w, h;
	
	public RectB(int w, int h) {
		//�����ڷε� �ʱ�ȭ ����
		//�� class�� �� �������� �� int w, int h�� ��ü �����ϸ鼭
		//new Rect ������ �� �����ڷ�RectB(int w, int h) �����
		
		this.w = w;
		this.h = h;
	}
	
	public void rectArea() {
		//int a = w*h;
		area =w*h; //�θ� private�� ������ ���� ��� �Ұ���
		set("Square");//�θ𲨴� �����̹Ƿ� set(title, area)�� ����� �� ����
	}
	
}

public class Test45 {

	public static void main(String[] args) {
		
		RectB ob = new RectB(10, 20);//�ʱ�ȭ?
		ob.rectArea();
		ob.print();//Rect�� �θ�TestB �� ob
		
	}

}
