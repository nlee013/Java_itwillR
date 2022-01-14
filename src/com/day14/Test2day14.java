package com.day14;

import java.util.Hashtable;
import java.util.Iterator;

//Map�̶�� Interface : Hashtable class, HashMap class
//Hashtable : Vector�� ����
//HashMap : ArrayList�� ����. ����ȭX -> �� ����

//Map<key, value>
//Key: �ߺ����� ���� �� ����.�»��� �ߺ��� ���� X.
//Key�� �ش�Ǵ� �ִ� interface�� �ش�ǰ� �� �ڷ����� set��
//set�� �ߺ����� ��� X �׷��Ƿ� key�� �ߺ��� ��� X
//(�̸��� ���ٴ� ��� ó��) ���࿡ Key�� �ߺ��Ǹ� ������ ���� �����

//Map�� Interator�� ����(�ֱ� ��. Map�� ģô set�� ����)
//Map�� ���Ǵ� key ���� set�̰� set�� iterator�� �־ �װ� ������ ��
//�׷��Ƿ� Map�� set�� ��������(��ȸ����) iterator�� ����� �� ����
//put(key, ��) : �߰�
//it.next(); -> key�� ����. �� key�� ������ get���� �о�� ��.
//get(key) :  data�� �б�. key�� ���� �а� ���� ����

//Value: 
public class Test2day14 {
//���⼭ tel�� key�̴�
	public static final String[] tel = {"111-111", "222-222", "333-333", "444-444", "555-555"};
	
	//value
	public static final String[] name = {"Suzi", "Inna", "Inseon", "Angellina", "Inah"};
	
	public static void main(String[] args) {

		//Hashtable<K, V> -> Key�� �ڷ��� String, Value�� �ڷ��� String�� ���� ���ָ� ��
		Hashtable<String, String> h = new Hashtable<>();
		
		for(int i = 0; i < name.length; i++) {
			h.put(tel[i], name[i]); //data�� ����ֱ�.
			//Key�� Value�� �����ϴ� ������ ���� �����Ƿ� �� ������ ���� �ٸ�.
		}
		System.out.println(h);
		
		String str;
		
		str = h.get("111-111");//key���� �ָ� value�� get���� ��������
		
		//if(str == null || str.equals(""))�� ���߿� �񱳸�����
		if(str == null || str.equals("")){
		//str�� string�̰� �񱳴� equals�� ���������,null�� ���� ==�� ��밡��.
			System.out.println("No data!!");
		}else{
			System.out.println(str);
		}
		
		//key���� �����ϴ��� �˻�
		if(h.contains("222-222")) {
			System.out.println("222-222�� DATA Ȯ�� �Ϸ�");	
		}
		
		//Value���� �����ϴ��� �˻�
		if(h.contains("Inna")) {
			System.out.println("Inna�� ���� �����ϴ� �ι��Դϴ�.");	
		}
		
		//����
		h.remove("222-222");
		if(h.contains("222-222")) {
			System.out.println("222-222�� DATA Ȯ�� �Ϸ�");	
		}else {
			System.out.println("222-222�� DATA Ȯ�� �Ұ�!!");
		}
		//�� �ڷ����� String.
		Iterator<String> it = h.keySet().iterator();
		
		while(it.hasNext()) {
			
			String key = it.next();//������ highlight bar �� �о������, it.next();�� key�� �о��.
			String value = h.get(key);//value ���� �����´�.(value���� �о��)
			
			System.out.println(key + ":" + value);
			
		}
	}
}
