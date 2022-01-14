package com.day17;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

//OutputStreamWriter (data�� ������ �� ���)

public class Test4day17 {

	public static void main(String[] args) throws IOException{

		int data;
		System.out.print("Type characters: ");
		
		Reader rd = new InputStreamReader(System.in);
		//������� Stream: Writer.
		//�������̰� ������ �ִ� �޸� ũ�Ⱑ ���������� ����
		Writer wr = new OutputStreamWriter(System.out);
		
		while((data = rd.read()) != -1) {
		//�����͸� �ܺη� ������ �� �⺻���� ����� �ִ�.
		//�� ����� �� ������ �Ǹ� �������� �ʴ´�(����� �ȵ�)
			
			wr.write(data);
			
			//flush()�� ��ҿ� �Ƚᵵ ���������� writer����� ���� �ݵ�� ��ߵ�
			//�Ⱦ��� ������ data�� ����� �ȵ�
			wr.flush();//������ ���.
		}
		
	}

}
