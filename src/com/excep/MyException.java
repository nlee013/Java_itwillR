package com.excep;

//����ó�� ����
public class MyException extends Exception{//Exception(�θ�)�� ��ӹ޴� �ڽ� class

	//Exceptionó�� ū ���� ��� �޾��� �� ������ ������
	//������� �߸� ù��° ��(Add default serial version D) ������ ����� ��
	private static final long serialVersionUID = 1L;//��� ����
	
	//������ ���� Dependency Injection
	public MyException(String msg) {//������ overloading �� �� ()�ȿ� String msgó�� �� ����
		
		super(msg);//�θ� �����ڸ� ã�ư�
	}
}
