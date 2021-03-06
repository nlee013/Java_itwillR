package com.day17;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

//OutputStreamWriter (data를 내보낼 때 사용)

public class Test4day17 {

	public static void main(String[] args) throws IOException{

		int data;
		System.out.print("Type characters: ");
		
		Reader rd = new InputStreamReader(System.in);
		//출력전용 Stream: Writer.
		//독자적이게 가지고 있는 메모리 크기가 내부적으로 있음
		Writer wr = new OutputStreamWriter(System.out);
		
		while((data = rd.read()) != -1) {
		//데이터를 외부로 내보낼 때 기본적인 사이즈가 있다.
		//이 사이즈가 꽉 안차게 되면 내보내지 않는다(출력이 안됨)
			
			wr.write(data);
			
			//flush()는 평소에 안써도 무관하지만 writer사용할 때는 반드시 써야됨
			//안쓰면 마지막 data가 출력이 안됨
			wr.flush();//강제로 출력.
		}
		
	}

}
