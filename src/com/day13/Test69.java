package com.day13;

import java.util.Calendar;

//4.���� Ŭ���� Inner class(�͸���, ������ , Annoymous class)
//���� Ŭ������ ����ϴ� ����: ������ ������ ����//���߿� ���� ���� ����

//���� Ŭ���� Inner class:
//class �ȿ� class �����
//class �ȿ� method�� �����
//class�� static���� �����
//������(�̸�����)Anonymous class

public class Test69 {
	
	public Object getTitle() {//method.return ���� Object�� �޴� ���� upCast. �޾� ����Ϸ��� downCast
		
		return new Object() {//���� ���� interface�� ��
			
			@Override
			public String toString() {//�� Object() class�� �̸��� �������� �ʾƼ� toString�� �ڵ����� ����
				return "Annoymous class...";
			}
		};
	}

	public static void main(String[] args) {

		Test69 ob = new Test69();
		
		//ob.getTitle(); -> ȣ���ϸ� ��ȯ���� ���.
		//String str = ob.getTitle(); ->ob.getTitle();�� error
		Object str = ob.getTitle();//downCast
		
		System.out.println(str);
		
		
		//Calendar cal = new Calendar; �̷��� ����
		/*Calendar cal = new Calendar() {//�Ʒ� ������ ���� Ŭ������
			
			@Override
			public void roll(int field, boolean up) {
			}
			
			@Override
			public int getMinimum(int field) {
				return 0;
			}
			
			@Override
			public int getMaximum(int field) {
				return 0;
			}
			
			@Override
			public int getLeastMaximum(int field) {
				return 0;
			}
			
			@Override
			public int getGreatestMinimum(int field) {
				return 0;
			}
			
			@Override
			protected void computeTime() {
			}
			
			@Override
			protected void computeFields() {
			}
			
			@Override
			public void add(int field, int amount) {
			}
		};*/
	}

}
