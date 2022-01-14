package com.excep;

public class OperationAuthenticator {

	public void inputFormat(String str) throws MyException {
		
		String temp[] = str.split(",");//�Է°��� ,(�޸�)�� �����ؼ� �ޱ�
		
		if(temp.length !=2) {//temp�� �迭�� ������ 2���� �ƴϸ� �ȵǱ⿡ 
			
			//���� ���� �߻���Ű��
			throw new MyException("���� �Է� ����!" + str);//������ overloading��
	//���⼭ ������ �߻��Ǹ� MyException���� ������ ���ؼ� ���� MyException class�� ���� ��.
		}
	}
	//Add @suppressWarnings 'unsued'to 'num'�� �Ѱ��� number()�� method�� �޾Ƽ�
	//�ȿ� �� num�� ��� �� �� ������
	@SuppressWarnings("unused")
	
	//�����̳� �Ǽ��̳� �Ǵ��ϴ� method
	public void number(String str) throws MyException {
		//�Ѿ���� ���ڿ� ��������, �Ҽ����� �ִ���(�Ǽ�) Ȯ���� �� �ִ� �ڵ� �ۼ�
		try {
			
			if(str.indexOf(".") != -1) {
				
				double num = Double.parseDouble(str);//��ȯ���� �ʰ� Ȯ�θ�
			}else {
				int num = Integer.parseInt(str);//��ȯ���� �ʰ� Ȯ�θ�
			}
			
		} catch (NumberFormatException e) {
			
			throw new MyException("���� ��ȯ �Ұ�: " + str);
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
				throw new MyException("������ ����!!: " + ch);
		}
	}
}
