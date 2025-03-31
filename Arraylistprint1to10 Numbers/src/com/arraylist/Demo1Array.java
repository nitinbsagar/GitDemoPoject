package com.arraylist;
//using Arraylist print 1 to 10 number in 1.8 java
import java.util.ArrayList;
import java.util.List;

public class Demo1Array {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.stream().forEach((i)->
		{
			for(int j=1;j<=i;j++) {
				System.out.println(j);
				
			}
		});
		
		
		
	}
}
