package com.day8;

class Circle{
	
	private int r; //������ ����ȭ..? (ĸ��ȭ) 
					//private�� �����ϰ� �� ��� : ��ȸ ���
					//-> public method�� ����� ����
	
	public void setData(int r) {//��ȯ���� ���� void//�޾Ƴ��� �Ű����� ���� 
								//���� �ִ� method�� set�� ���̻��
		
		this.r = r; // ��ȸ ��������� this�� �����. this.r = Circle.r������
					//class �̸��� ���� ���� �ʰ� �ϱ� ���� this�� ���. this -> class�� �̸�.
		
		//this.r -> private int r�̰� = r -> public void setData()�ȿ� �ִ� int �̴�.
	}
	
	public double area() {
		
		return r*r*3.14;
	}
	
	public void write(double a) {
		
		System.out.println("Radius: " + r); // "Radius" + this.r
		System.out.println("Area: " + a);
	}
}

public class Test37 {

	public static void main(String[] args) {
		
		Circle ob = new Circle(); //��ü ����
		
		ob.setData(10); //ob.steData(10, ob)
		double result = ob.area(); //ob.area(ob)
		ob.write(result); //result(a,ob)
		
		ob.setData(100); 
		result = ob.area();
		ob.write(result);
		
	}

}
