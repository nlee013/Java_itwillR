package com.excep;

public class OperationAuthenticator {

	public void inputFormat(String str) throws MyException {
		
		String temp[] = str.split(",");//입력값을 ,(콤마)로 구분해서 받기
		
		if(temp.length !=2) {//temp의 배열의 개수가 2개가 아니면 안되기에 
			
			//강제 에러 발생시키기
			throw new MyException("숫자 입력 오류!" + str);//생성자 overloading함
	//여기서 에러가 발생되면 MyException으로 보내기 위해서 따로 MyException class를 만든 것.
		}
	}
	//Add @suppressWarnings 'unsued'to 'num'은 한개만 number()은 method로 받아서
	//안에 들어간 num의 노란 줄 다 없애줌
	@SuppressWarnings("unused")
	
	//정수이냐 실수이냐 판단하는 method
	public void number(String str) throws MyException {
		//넘어오는 숫자에 정수인지, 소수점이 있는지(실수) 확인할 수 있는 코드 작성
		try {
			
			if(str.indexOf(".") != -1) {
				
				double num = Double.parseDouble(str);//반환하지 않고 확인만
			}else {
				int num = Integer.parseInt(str);//반환하지 않고 확인만
			}
			
		} catch (NumberFormatException e) {
			
			throw new MyException("숫자 변환 불가: " + str);
		}
		
	}
	
	public void operator(char ch) throws MyException {
		
		switch(ch) {
		
		case '+':
		case '-':
		case '*': 
		case '/':
			return;
			
		default:
				throw new MyException("연산자 오류!!: " + ch);
		}
	}
}
