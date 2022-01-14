package com.day11;

abstract class SortInt{
	
	private int[] value;//�迭 ���� �ϱ�
	
	protected abstract void sorting();//abstract method
	
	public void sort(int[]value) {
		
		//���⼭ value�� �迭
		//�ּҸ� ���� �����ϴ� �� call by reference
		this.value = value;
		
		//���¸�(�ڽİ� ���� �̸�) ����.
		//�ڽ� method�� ����� ���� �ƴ�
		sorting();
		
	}
	
	public int length() {//���� ����� method
		
		if(value == null) {//data�� ����
			return 0;
		}
		return value.length;//�迭�� length���� 0�� ����?
	}
	
	protected final int compare(int i, int j) {

		if(value[i] == value[j])//����� ���� ���� ���� ���
			return 0;
		else if(value[i] > value[j])//�̰͸� �ص� ����
			return 1;
		else
			return -1;
	}
	
	protected final void swap(int i, int j) {
		
		int temp;
		temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
	
	public void print() {//��� method
		if(value == null)
			return; //�����
		
		for(int su : value) {
			System.out.printf("%4d", su);
		}
	}
}

class SortTest extends SortInt{

	@Override
	protected void sorting() {//�θ� ������ �̸��� sorting()�� ��
		
		//Selection Sort
		for(int i = 0; i < length() - 1; i++) {
			for(int j = i + 1; j < length(); j++) {
				
				if(compare(i, j) > 0) {
					swap(i, j);
				}
			}
		}
	}
}


public class Test60 {

	public static void main(String[] args) {

		int[] value = {40, 56, 30, 12, 6};
		
		SortTest ob = new SortTest();
		ob.sort(value);
		ob.print();
	}

}
