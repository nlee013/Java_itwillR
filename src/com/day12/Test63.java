package com.day12;

//Interface
//Abstract class�� �������� ���� �ϰ� ����(����)�� ����
//������ final variable(����)�� ���𰡴�.
//Interface�� �����ϱ�(class�� ����ϱ�)���ؼ��� implements ���
//Interface�� ����(���)��, interface�� ��� method�� ������ �ؾ���(����)
//-> �� �� ��, compile error
//interface �̸� �����, ȣ���� interface �̸� ��� �����ؾߵ�

//Interface�� �ٸ� interface�� ��� �ޱ� ����.
//-> �� ���: extends ���
//���� �� ���� : implements

//Class�� ���� ���. Interface�� ���߱���(������ ����) ����
//-> implements A, B { �̷������� ������ ���� ����

interface Fruit{

	String Won = "won";//�⺻ default : public static final ����
	//final�� �׻� �ʱ�ȭ
	//final�� ù����(Won)�� �빮�ڸ� ���� ����.
	
	int getPrice(); //�տ� public abstract ����
	
	public String getName();//abstract method
	
	//public void print()->�Ϲ� method ���� �� ����
	
}

//FruitImpl�� ��Ӱ��� class 1�� �϶� ���� �̷��� �̸� �����
class FruitImpl implements Fruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "Lemon";
	}
	
	public String getItems() {
		return "Fruits";
	}
	
}
public class Test63 {

	public static void main(String[] args) {

		FruitImpl ob1 = new FruitImpl();
		
		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.Won);
		
		Fruit ob2 = ob1;//upcast<-Fruit�� ���������� class�̹Ƿ� upcast ����
		System.out.println(ob2.getName());
		
		//System.out.println(ob2.getItems());
		//->�θ�� getItems�� ���� �ڽĲ��� ������.
		//���� ���� (���¸� �ִ�) getItems �� ���⿡ error��
	}

}
