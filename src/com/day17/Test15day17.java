package com.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

//��ü�� ����ȭ
//�޸𸮿� ������ class ��ü�� instance ������ ���� ���¸�
//�״�� file�� ���� �ϰų� network�� ���ؼ� ���� ������ ���
//���� byte�����θ� data�� �ۼ��� ����

//����)
//��ü�� ������ ����� ���Ŀ� ���� ���� �ʰ�
//��ü�� ���Ͽ� �����ϹǷν� ���Ӽ��� ������ �� �ְ�
//���Ӽ� -> �����͸� �Ź� �Է��ؼ� �޸� �� �ø��� �ʾƵ� �ȴٴ� �ǹ�
//��ü ��ü�� network�� ���� �ս��� ��ȯ �����ϰ� �ȴ�

//implements Serializable
//method�� ����
public class Test15day17 {

	public static void main(String[] args) throws Exception {

		//list �ᵵ ��
		Hashtable<String, String> h = new Hashtable<>();
		
		h.put("1", "��");
		h.put("2", "��");
		h.put("3", "�ĳ�");
		
		//���� try catch������ �ؾߵǴµ� ���⼭�� throws Exception�����
		//����ȭ data: �޸𸮻� �ִ� data
		FileOutputStream fos = new FileOutputStream("d:\\doc\\out6.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(h);
		oos.close();
		fos.close();
		
		System.out.println("����ȭ data ���� ����..!");
		
		

	}

}
