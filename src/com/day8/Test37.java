package com.day8;

class Circle{
	
	private int r; //정보의 은닉화..? (캡슐화) 
					//private에 접근하게 할 방법 : 우회 방법
					//-> public method를 만들어 접근
	
	public void setData(int r) {//반환값이 없어 void//받아내는 매개변수 생성 
								//값을 넣는 method로 set을 많이사용
		
		this.r = r; // 우회 방법에서만 this를 사용함. this.r = Circle.r이지만
					//class 이름과 같게 하지 않게 하기 위해 this를 사용. this -> class의 이름.
		
		//this.r -> private int r이고 = r -> public void setData()안에 있는 int 이다.
	}
	
	public double area() {
		
		return r*r*3.14;
	}
	
	public void write(double a) {
		
		System.out.println("Radius: " + r); // "Radius" + this.r
		System.out.println("Area: " + a);
	}
}

public class Test37 {

	public static void main(String[] args) {
		
		Circle ob = new Circle(); //객체 생성
		
		ob.setData(10); //ob.steData(10, ob)
		double result = ob.area(); //ob.area(ob)
		ob.write(result); //result(a,ob)
		
		ob.setData(100); 
		result = ob.area();
		ob.write(result);
		
	}

}
