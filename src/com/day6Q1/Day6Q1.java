package com.day6Q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import com.day2.Test4;

public class Day6Q1 {

	public static void main(String[] args) throws IOException {

			Circle na = new Circle();
			na.input();
			
			double aa = na.circleArea();
			double ll = na.circleLength();
			
			na.print(aa, ll);
			
			
	}
	
	
}
