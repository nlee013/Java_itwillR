package com.day13;

import java.util.Iterator;
import java.util.Vector;

public class Test71 {

	private static final String[] city = {"Seoul", "Busan", "Degu", "Inchon", "Gwangju", "Daejeon", "Woolsan"};

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();//Vector�� String�� ��´�
		//�տ� ������, new Vector<String>();�� <String>�� String �Ƚᵵ ��
		
		for(String s : city) {
			
			v.add(s);//add �߰�
			
		}
		//v.add(10);//error -> String���� �����߱⿡ Integer �� �Ұ���
		String str;
		
		str = v.firstElement();
		System.out.println(str);
		
		str = v.get(0);
		System.out.println(str);
		
		str = v.get(1);
		System.out.println(str);
		
		str = v.lastElement();
		System.out.println(str);
		
		//for
		for(int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		
		//Ȯ�� for��(�迭 ������)�� �� ���� ��� ����
		for(String s : v) {//:�� ������
			System.out.print(s + " ");
		}
		System.out.println();
		
		//���� ��±� -> Iterator(�ݺ���)//java�� interface�� ����ҷ� ���� �����
		Iterator<String> it = v.iterator();//data�� ���� ���� �� ���� ��µ�
		//���� �ִ� it = v.iterator();�� �� �� �������� ��.
		
		while(it.hasNext()) {//it��data ���� ������ ������. ����� �� �� while��
			
			str = it.next();//read-> data �����Ͷ�.
			//next�� highlight bar�� �� ��(BOF)�� ���� next������ �ϳ��� ������ data �о�� 
			
			System.out.print(str + " ");
		}
		System.out.println("------------");
		while(it.hasNext()) {
			str = it.next();
			System.out.print(str + " ");
		}
	}
}
