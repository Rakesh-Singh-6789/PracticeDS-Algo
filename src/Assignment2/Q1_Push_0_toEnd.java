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
		
		int arr[]={1,2};
		int[] temp=new int[2];
		
		temp=arr.clone();
		
		String str="ajhgfsg";
		char ch[]=str.toCharArray();
		
		System.out.println(ch[0]+" "+ch[6]);
		
		for(int i:temp){
			System.out.println(i);
		}
		
	

	}

}
