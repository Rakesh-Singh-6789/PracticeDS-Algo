package Assignment2;

import java.util.*;


public class Q1_Push_0_toEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(0);
		list.add(2);
		
		list.remove(1);
		
		System.out.println(list);
		
		int arr[]={1,2};
		int[] temp=new int[2];
		
		temp=arr.clone();
		
		for(int i:temp){
			System.out.println(i);
		}

	}

}
