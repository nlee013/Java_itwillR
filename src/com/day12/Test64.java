package com.day12;

//Interface도 별도의 file로 만들 수 있다
//무조건 override를 해야되기 때문에 public으로 설정

interface Test{

	//2개의 interface 만듦
	public int total();
	public void write();
	
}

class TestImpl implements Test{//자체적으로 변수/method 가질수 있음
	
	private String hak, name;
	private int kor, eng;
	
	public TestImpl() {//기본생성자
		
	}
	
	public TestImpl(String hak, String name, int kor, int eng) {
		
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void set(String hak, String name, int kor, int eng) {
		
	}
	
	@Override
	public int total() {
		return kor + eng;
	}

	@Override
	public void write() {//내부적으로 상속. 구현
		
		System.out.println(hak + "," + name + ","  + total());
		
	}
	
	@Override//지금은 여기서 써도 되고 아니여도 됨.근데 Method여서
	public boolean equals(Object ob) {
		//ob1.equals(ob2).ob2의 오리지널 속성 = TestImpl//upcast
		//ob1은 큰 클래스인 class TestImpl의 ob1이고 그 안에 equals가 여기 있다
		
		boolean flag = false;
		
		if(ob instanceof TestImpl) {//ob가 가지고 있는 자료형(TestImpl)을 구분
	//instanceof 연산자 객체가 어떤 class인지 어떤 class를 상속 받았는지 확인. 종종 사용
	//객체 + instanceof + class
			
			TestImpl t = (TestImpl)ob;//형변환 downcast 원래 자료형에 
			
			if(this.hak.equals(t.hak) && name.equals(this.name)) {
			//this->ob1, equals->string의 equals
				flag = true;
			}
		}
		return flag;
	}
}


public class Test64 {

	public static void main(String[] args) {

		//TestImpl ob1 = new TestImpl("111", "이나영", 89, 99);
		Test ob1 = new TestImpl("111", "이나영", 89, 99);
		//TestImpl ob2 = new TestImpl("111", "이나영", 100, 100);
		Test ob2 = new TestImpl("111", "이나영", 100, 100);
		
		//주소지 비교
		if(ob1.equals(ob2)) {
			System.out.println("ob1과 ob2는 동인인물!");
		}else {
			System.out.println("ob1과 ob2는 동인인물이 아님!");
		}
		ob1.write();
		ob2.write();
	}

}
