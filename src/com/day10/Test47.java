package com.day10;

class Test{
	
	private String title;
	protected double area;
	
	public Test() {} //기본 생성자
	
	public Test(String title) {//overloading 생성자
		this.title = title;
	}
	
	public void write() {//일반 method
		System.out.println(title + ":" + area);
	}
}

class Circle extends Test{
	
	private int r;
	protected static final double PI = 3.14;
	//static 메모리에 알아서 올라감.
	//final 상수. 정해진 값 절대 안바뀜
	
	public Circle(int r) {//overloading 생성자 사용.
	//super 기본 생성자가 생략되어있어서 위에 기본생성자가 있기 때문에 error 없음
		
		super("원");//overloading 생성자 사용.선두에 1번만 호출
					//자식 보다 부모가 먼저 생성되어야 하므로 선두 호출
		this.r = r;
	}
	
	public void circleArea() {
		area = (double)r*r*PI;
	//앞에 double 쓴 이유는 확실하게 하기 위해 쓰는 경우 많음
	}
}

class Rect extends Test{ //기본 생성자 사용
	
	private int w, h;
	
	public void rectArea(int w, int h) {
		
		this.w = w;
		this.h = h;
		
		area = w*h; //초기화 //area는 부모꺼로 위로 가서 확인
	}
	
	//Override/overriding 오버라이드.
	//오버로딩보다 오버라이드를 많이 사용하는 이유: 자바는 상속받아 많이 사용함
	
	//부모의 class를 재정의(다형성)해서 사용
	//조건: 1) 반드시 상속 관계에서 같은 역할을 하는 method의 이름을 통일시키는 작업
	//		2) method의 이름이 부모의 method와 정확히 같아야 된다
	
	//아래 write()와 위의 write()처럼 method 이름이 같고 서로 같은 역할을 한다.
	
//-------------------------------------------------------------------------------------------
	
	/*public void write() {//부모의 write()출력 형식과 맞지않아 새로 출력 생성.
						//새로 만든 print()-> 부모 출력 이름과 같은 write()로 바꿔도 됨
		
		System.out.println("Width: " + w + "\nHeight: " + h);
		System.out.println("Area: " + area);
		
		//super.write():
		//-> 부모와 자식 관계 (상속관계) 안에서만 사용가능
	}*/
	
//-------------------------------------------------------------------------------------------
	
	/*@Override
	 //-> Annotation.@override는 감시자.
	//이 것이 있을 때 method의 이름이 부모랑 다르면 error 뜸
	public void write() {
	//빈공간에 우클릭 source-> override.implement는 interface에 나중에 사용예정
		
		//super.write();
		
		System.out.println("Width: " + w + "\nHeight: " + h);
		System.out.println("Area: " + area);
	}*/
	
//-------------------------------------------------------------------------------------------
	@Override //빈공간에 w 작성 후 ctrl + space 누르면 override가 맨 처음에 뜸
		public void write() {
			//super.write();
		
			System.out.println("Width: " + w + "\nHeight: " + h);
			System.out.println("Area: " + area);
		}
	
}

public class Test47 {

	public static void main(String[] args) {
		
		Circle ob1 = new Circle(10);//overloading 생성자 사용
		ob1.circleArea();//method 호출
		ob1.write();//부모의 method 사용
		
		Rect ob2 = new Rect();//overloading을 꺼내놓지 않았으므로 기본생성자를 사용한다
		ob2.rectArea(10, 20);//method 호출
		ob2.write();//내꺼인 새로 출력 형식의 method 사용//Rect의 void 사용
		
	}
}
