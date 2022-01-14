package com.score6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Data {

	private List<DataVO> lists = new ArrayList<DataVO>();
	
	Scanner sc = new Scanner(System.in);
	
	public int input(){
		
		int result = 0;
		
		DataVO vo = new DataVO();
		
		System.out.println("Type your name: ");
		vo.setName(sc.next());
		
		System.out.println("Typ your birthday[XXXX-XX-XX]: ");
		vo.setBirth(sc.next());
		
		System.out.println("Type your score: ");
		vo.setScore(sc.nextInt());
		
		lists.add(vo);
		
		return result;
	}
	
	public void print() throws Exception {
		
		String str = "d:\\doc\\data\\saveData.txt";
		
		DataVO ob = new DataVO();
		
		
		File f = new File(str);
		
		if(f.exists()) {
			
			FileInputStream fis = new FileInputStream("d:\\doc\\data\\saveData.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			try {
				while(true) {
					ob = (DataVO)ois.readObject();
					
					if(ob == null) {
							break;
				}
				System.out.println(ob.toString());
				}
				
			} catch (Exception e) {
				
			}
			ois.close();
			fis.close();
		}
		
		Iterator<DataVO> it = lists.iterator();
		
		while(it.hasNext()) {
			
			DataVO vo = it.next();
			System.out.println(vo.toString());
		}
		
	}
	
	public void saveData() throws Exception {
		
		DataVO vo = new DataVO();
		
		
		
		/*Iterator<DataVO> it = lists.iterator();
		
		while(it.hasNext()) {
			
			vo = it.next();
		
			System.out.println(vo.toString());
		}*/
	
		FileOutputStream fos = new FileOutputStream("d:\\doc\\data\\saveData.txt", true);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(lists);
		
		try {
			oos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
