package Assignment2;

import java.util.*;


public class Q1_Push_0_toEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(0);
		list.add(2);
		
		//list.remove(1);
		System.out.println(list.contains(0));
		
		System.out.println(list);
		
		String Mystr="abcd";
		
		StringBuilder sb=new StringBuilder(Mystr);
		
		String str=sb.reverse().toString();
		
		System.out.println(str+" "+sb+" "+Mystr);
		
		String str1[]=new String[5];
		
		int i=1;
		int b=-i;
		
		System.out.println(i+" "+b);
		
	

	}

}
