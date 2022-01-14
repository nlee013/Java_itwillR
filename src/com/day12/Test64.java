package com.day12;

//Interface�� ������ file�� ���� �� �ִ�
//������ override�� �ؾߵǱ� ������ public���� ����

interface Test{

	//2���� interface ����
	public int total();
	public void write();
	
}

class TestImpl implements Test{//��ü������ ����/method ������ ����
	
	private String hak, name;
	private int kor, eng;
	
	public TestImpl() {//�⺻������
		
	}
	
	public TestImpl(String hak, String name, int kor, int eng) {
		
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void set(String hak, String name, int kor, int eng) {
		
	}
	
	@Override
	public int total() {
		return kor + eng;
	}

	@Override
	public void write() {//���������� ���. ����
		
		System.out.println(hak + "," + name + ","  + total());
		
	}
	
	@Override//������ ���⼭ �ᵵ �ǰ� �ƴϿ��� ��.�ٵ� Method����
	public boolean equals(Object ob) {
		//ob1.equals(ob2).ob2�� �������� �Ӽ� = TestImpl//upcast
		//ob1�� ū Ŭ������ class TestImpl�� ob1�̰� �� �ȿ� equals�� ���� �ִ�
		
		boolean flag = false;
		
		if(ob instanceof TestImpl) {//ob�� ������ �ִ� �ڷ���(TestImpl)�� ����
	//instanceof ������ ��ü�� � class���� � class�� ��� �޾Ҵ��� Ȯ��. ���� ���
	//��ü + instanceof + class
			
			TestImpl t = (TestImpl)ob;//����ȯ downcast ���� �ڷ����� 
			
			if(this.hak.equals(t.hak) && name.equals(this.name)) {
			//this->ob1, equals->string�� equals
				flag = true;
			}
		}
		return flag;
	}
}


public class Test64 {

	public static void main(String[] args) {

		//TestImpl ob1 = new TestImpl("111", "�̳���", 89, 99);
		Test ob1 = new TestImpl("111", "�̳���", 89, 99);
		//TestImpl ob2 = new TestImpl("111", "�̳���", 100, 100);
		Test ob2 = new TestImpl("111", "�̳���", 100, 100);
		
		//�ּ��� ��
		if(ob1.equals(ob2)) {
			System.out.println("ob1�� ob2�� �����ι�!");
		}else {
			System.out.println("ob1�� ob2�� �����ι��� �ƴ�!");
		}
		ob1.write();
		ob2.write();
	}

}
