package Assignment3_HashMap;

import java.util.*;

public class Q3_anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="aba";
		String s2="a";
        System.out.println(makeAnagram(s1, s2));
	}
	
	 public static int makeAnagram(String s1,String s2){
	        /* Your class should be named Solution
	         * Don't write main().
	         * Don't read input, it is passed as function argument.
	         * Return output and don't print it.
	         * Taking input and printing output is handled automatically.
	         */

	        int l1=s1.length();
	        int l2=s2.length();

	        HashMap<Character,Integer> map1=new HashMap<>();
	        HashMap<Character,Integer> map2=new HashMap<>();

	        for(int i=0;i<l1;i++){
	            int val=1;
	            char ch=s1.charAt(i);
	            if(map1.containsKey(ch)){
	                val=map1.get(ch);
	                val++;
	            }

	            map1.put(ch,val);
	        }

	        for(int i=0;i<l2;i++){
	            int val=1;
	            char ch=s2.charAt(i);
	            if(map2.containsKey(ch)){
	                val=map2.get(ch);
	                val++;
	            }

	            map2.put(ch,val);
	        }
	        
	        System.out.println(map1);
	        System.out.println(map2);
	        
	        int count=0;
	        
	        Set<Character> set1=map1.keySet();
	        Set<Character> set2=map2.keySet();
	        
	        for(char ch: set1){
	            
	            if(map2.containsKey(ch)){
	                
	                 count+=Math.abs(map1.get(ch)-map2.get(ch));
	            }else{
	               count+=map1.get(ch);
	            }         
	            
	        }
	         for(char ch: set2){
	            
	            if(map1.containsKey(ch)==false){
	                count+=map2.get(ch);                    
	            }       
	            
	        }


	   return count;

	    }

}
