package com.day10;

//���� �⺻���� method �����ϱ�

public class Test52 {

	public static void main(String[] args) {

		String s1 = "Seoul, Busan, Degu";
		String[] ss = s1.split(",");//��ǥ�� ������
		//�迭 : new �ϰų� {,,,};����� �־���
		
		for(String s : ss) 
			//System.err.print(s + " ");//-> ������ �۾��� ���.�Ƹ��� error ���� ����ε�
			System.out.print(s + " ");//�� ĭ�� �� ��µ�
			
			String s2 = "seoul";
			String s3 = "Seoul";
			System.out.println(s2.equals(s3));//false->��ҹ��� �񱳽� �ٸ��Ƿ� false
			System.out.println(s2.equalsIgnoreCase(s3));//true
			//IgnoreCase>��ҹ��ڸ� ���������� ���ض�
			
			String s4 = "abc.def.hij";//index��ȣ�� �Է°��� �־���
			//			 01234567890
			System.out.println(s4.indexOf("."));//3 -> ���� �� index ���� ã�ƿͶ�
			System.out.println(s4.lastIndexOf("."));//7 -> �ڿ������� ���� �� index ���� ã�ƿͶ�
			System.out.println(s4.indexOf("def"));// 4
			System.out.println(s4.indexOf("x"));//-1 ->���� ���� index ���� ã�ƿ�
			
			String s5 = "�츮���� ���ѹα� �������� ���ѹα�";
			String s6 = s5.replaceAll("����", "����");//ġȯ
			//-> ���� ���ڸ� ������ ���ڷ� �ٲ��ִ� replaceAll. ���߿� ���� ����
			System.out.println(s6);
			
			String s7 = "  a b c  ";//�� �� ������ ���� 2ĭ�� ����//���鵵 string
			System.out.println(s7);
			System.out.println(s7.trim());//trim�� ���� ������ ������
			System.out.println(s7.replaceAll(" ", ""));//-> ������ null������ ��������
			System.out.println(s7.replaceAll("\\s", ""));// \\s -> ���� �̶�� ��.����ȭ ǥ����
			// \\s -> \n�� ����
	
			char ch = "abcdefg".charAt(2); 
			System.out.println(ch);//c ->index��ȣ 2��°
			
			System.out.println("abcdefg".length());//7 -> ������ ���� �� 7��
			
			String s8 = "abcdefg";
			String s9 = "abceefg";
			
			//������ ����//�� �� ���� ���̰�
			System.out.println(s8.compareTo(s9));//-1
			System.out.println(s9.compareTo(s8));//1
	}

}
