package com.day6;

//�迭�� �迭

public class Test31 {

	public static void main(String[] args) {

		int[][] arr = new int[6][6];//�� ��, ���� 0~5 �� 6���� ����
		//float[][] arr = new float[6][6]
		int i, j, n;
		
		n = 0;
		
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 5; j++) {
				//System.out.println(i + ":" + j); Ȯ�ο�
				n++;
				arr[i][j] = n;
				
				//���� ������ų �� +=
				arr[i][5] += n;
				arr[5][j] += n;
				arr[5][5] += n;	
			}
		}
		
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr.length; j++) {
				System.out.printf("%4d", arr[i][j]);
			  //System.out.printf("%4g", arr[i][j]); -> float��� �� ��

			}
			System.out.println();
		}
	}

}
