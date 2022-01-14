package com.score4;
//�ſ� �߿�
//Value Object : Data�� ����. DB�� ������� ������ VO
//DTO : Data Transform Object. DB�� ��� �� �� DTO

public class ScoreVO {
	
	private String hak,name;
	private int kor, eng, mat, tot;

	public ScoreVO(){//�⺻ ������
		
	}
	
	//��Ŭ�� -> source -> Generate getters and setters..Ŭ��
	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public int getTot() {
		return kor + eng + mat;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	@Override
	public String toString() {//Object�� toString Override.Equals�� ���������� ����? ���ϱ� ������
		//toString�� ���� �����
		
		if(hak == null || name == null) {
			return null;
		}
		
		String str = String.format("%6s %6s %4d %4d %4d %4d %4d",
				hak,name,kor, eng, mat, getTot(), getTot()/3);
		
		return str;
	}
	
	//�����ڷ� ���� �ʱ�ȭ�ϴ� ��찡 ���� ���� ������ �Ʒ�ó�� ���� ��
	/*public void setData(String hak, String name, int kor, int eng, int mat) {
		
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}*/
	
	/*//Hak�� �ʱ�ȭ ��Ű�� ���� �� : method �����
	public void setHak(String hak) {
		
		this.hak = hak;
	}
	
	//private�� ���� hak�� ��ȸ ���� �����
	public String getHak() {
		
		return hak;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	//private�� ���� name�� ��ȸ ���� �����
	public String getName() {
			
		return name;
	}
		
	public void setKor(int kor) {
		
		this.kor = kor;
	}
	
	//private�� ���� kor�� ��ȸ ���� �����
	public int getKor() {
			
		return kor;
	}
		
	public void setEng(int eng) {
		
		this.eng = eng;
	}
	
	//private�� ���� eng�� ��ȸ ���� �����
		public int getEng() {
			
			return eng;
		}
	public void setMat(int mat) {
		
		this.mat = mat;
	}
	//private�� ���� mat�� ��ȸ ���� �����
		public int getMat() {
			
			return mat;
		}*/
	
	
	
}
