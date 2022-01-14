package com.day17;

import java.io.IOException;
import java.io.OutputStream;

//�������� Stream�� 1byte�� �����͸� ������
//���� �⺻���� Stream: In(1byte) data �ޱ�, Out(1byte) data ��������
public class Test2day17 {

	public static void main(String[] args) throws IOException {

		OutputStream os = System.out;
		
		byte[] b = new byte[3];//1byte�� ������� 3�� ���� -> Buffer
		
		//�ƽ�Ű��
		b[0] = 65;
		b[1] = 97;
		b[2] = 122;
		
		//input output�� error�� ��κ� IOException ó���ϸ� ��
		os.write(b);//�ѹ��� (���� ���� �迭������ ��ü��)�������� ��
		
		System.out.println("Heyyy![1]");
		
		os.close();//data�� ���� �� �ݾ���(output Stream�� ����)
		
		System.out.println("Heyyy![2]");//close()������ ��¾ȵ�
	}

}
