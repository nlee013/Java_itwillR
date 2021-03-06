package com.day10;

//String: string은 class이다(자료형이 아니다)
//저장할 data는 방대하고 사용 빈도는 높기 때문에
//class를 자료형 처럼 사용함

//String data는 무조건 equals로 비교해야 됨
//String은 불변의 법칙을 가짐: 한 번 메모리 상에 저장되면 수정, 삭제, 초기화 불가능

//-> String은 class이므로 값을 비교할 때 무조건 equals

public class Test49 {

	public static void main(String[] args) {

	String ob1 = "Seoul";
	String ob2 = "Seoul";
	String ob3 = new String("Seoul");//class니까 왼쪽처럼 생성 가능
	//new가 들어가는 순간 공간을 무조건 만든다
	
	//String은 call by reference :data가 똑같으면서 주소를 나눠가져기 위해서(공유함)
	//주소를 서로 나눠가짐
	//여기 코드에서 ==는 주소지를 비교하는 것이며,
	//String data는 무조건 equals로 비교해야 됨
	
	 System.out.println("ob1 == ob2: " + (ob1 == ob2));//true
	 System.out.println("ob1 == ob3: " + (ob1 == ob3));//false
	 //->주소 비교
	 System.out.println("ob1.equals(ob3): " + ob1.equals(ob3));//true
	 //-> 주소에 저장되어있는 값 비교.
	 //String의 equals는 overriding되었고 값을 비교함
	 
	 //equals & to String 둘다 override된 method이다.
	 
	 ob2 = "Korea";
	 System.out.println("ob1 == ob2: " + (ob1 == ob2));
	 //비교하는 data가 서로 다르면 무조건 공간(새 주소) 생성
	 
	 ob2 = "UK";
	 System.out.println("ob1 == ob2: " + (ob1 == ob2));
	
	 //주소번지가 가리킨 곳이 없을 때(서로 access하지 않을 때)
	 //garbage collector이다(쓰레기 값)
	 
	 //쓰레기 값을 지우려면 method로 따로 호출해서 명령을 내려야됨
	 
	 ob2 = "Seoul";
	 System.out.println("ob1 == ob2: " + (ob1 == ob2));

	 System.out.println(ob2);//hash code X(안나오고)
	 System.out.println(ob2.toString());//주소번지에 저장되어 있는 자료형의 data를 보여줌   
	}
}
