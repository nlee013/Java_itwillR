package com.day6;

//Bubble sort��� �͵� ����.
//���� ��� ������ ����

public class Test29 {

	public static void main(String[] args) {

		int[] num = { 37, 26, 19, 12, 7};
		
		int i, j, temp;
		
		System.out.print("Source Data: ");
		
		for(i = 0; i < num.length; i++) {
			System.out.printf("%4d", num[i]);
		}
		System.out.println();
		
		//Bubble sort
		
		for(i = 1; i < num.length; i++) {
			for(j = 0; j < num.length - i; j++) {
				
				if(num[i] > num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
				//System.out.println(i + ":" + j);//Ȯ�ο�
			}
		}
		
		System.out.print("Source Data: ");
		
		//for(int k = 0; k < num.length; k++) {
		for(int k : num) {
		//System.out.printf("%4d", num[k]);
			System.out.printf("%4d", k);
		}
		System.out.println();
	}

}
