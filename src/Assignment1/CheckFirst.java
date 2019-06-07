package Assignment1;

import java.util.*;

public class CheckFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];
		arr = new int[6];
		int size=arr.length;

		String str="aba";
		/*System.out.println(str.substring(3, 8));

		String myStr[]=str.split("");

		System.out.println(myStr.length);*/
	
		/*StringBuilder sb=new StringBuilder(str);
        sb=sb.reverse();
        
        System.out.println(str.equals(sb.toString()));*/

      /* int arr3d[][][][]=new int[3][][][];
       System.out.println(arr3d);*/
		
		//long max=Long.MIN_VALUE;
		//System.out.println(max);
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		map.put(1,2);
		map.put(2,4);
		
		HashSet<Integer> set=new HashSet<>(map.keySet());
		
		for(int i: set){
			System.out.println(i+" "+map.get(i));
			set.add(3);
			map.put(2, 6);
		}
		
		
		
		/*if(map.containsKey(1)){
			map.put(1,map.get(1));
		}
		System.out.println(map);
		Collection<Integer> set=map.values();
		
		System.out.println(set);*/
		
	
	}

}