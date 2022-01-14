package com.day11;

// Wrapper class : �⺻ �ڷ����� ��ü class�� ��밡���ϰ� ��
// �Ϲ������� �ڷ���: boolean, byte, char, short(����), int, long, float, double
// �� �ڷ��� 8���� �Ȱ��� wrapper class�� �����������
// Wrapper Class -> Boolean, Byte, Character, Short, Integer, Long, Float, Double

// ��� �����ϱ�
// Auto-Boxing: �ڷ����� wrapper class�� ��ȯ�Ǵ� ��
// ->stack ������ data�� heap�������� �� �Ѿ ó����

// Auto-unBoxing: (�ݴ���) wrapper class�� �ڷ������� ��ȯ�Ǵ� ��
// -> heap������ data�� stack �������� �� �Ѿ ó����

public class Test54 {
	
	public static void main(String[] args) {

		int n1 = 10;
		int n2; //�ʱⰪ x
		
		Integer num1; //���� �ϱ� <- null�� ������
		Integer num2 = new Integer(20);//��ü ����
		
		num1 = n1;//Auto-Boxing
		n2 = num2;//Auto-unBoxing
		
		System.out.println(n1 + ":" + n2);
		System.out.println(n2 + ":" + num2);
		
		int a = 24;//�ڷ���
		System.out.println(a);//24-> ����
		
		//24�� �ٸ� ��ɾ ���� �ٲٰ� �ʹ� -> class ���� �ޱ�
		
		System.out.println(Integer.toString(a)+10);//�Ȱ��� 24�� ��µ����� ���� String 24�� ���
		//������ �ȵ� -> 2410ó�� �ٿ�������
		
		System.out.println(Integer.toString(a, 2));//11000 -> 24�� 2����
		System.out.println(Integer.toString(a, 16));//18 -> 16����
		
		//Integer, Double, Float�� ���� ���� �����
	}
}

/*����
 * 
 *<�ڷ����� ����>
 *
 * int i = 10;
 * float f; 
 * 
 * f = i; //O ->�Ͻ��� �� ��ȯ //10.0
 * i = f; //X
 * i = (int)f; //O ->����� �� ��ȯ //10
 * 
 * -----------------------------------------
 * �θ�(f)�� �ڽ�(i) ������ ��ӿ��� �� ��ȯ
 * 
 * �θ�(f) = �ڽ�(i);		  O -> UpCast �ڽ��� �ø���
 * //UpCast ->���߿� java�� ��� ���� ������
 * 
 * �ڽ�(i) = �θ�(f); 		  X
 * �ڽ�(i) = (�ڽ� i)�θ�(f); O �ڽ����� ����ȯ�ؼ� �� -> DownCast
 * 
 * UpCast, DownCast -> ���߿� Object�� ������ ������ ��� ����.
 */
