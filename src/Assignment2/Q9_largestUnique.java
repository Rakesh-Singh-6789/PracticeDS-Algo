package Assignment2;

import java.util.HashMap;

public class Q9_largestUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findLargestUniqueSubstring("abcdabceb"));

	}
	public static String findLargestUniqueSubstring(String str){
		/* Don't write main().
	     * Don't read input, it is passed as function argument.
	     * Return the answer.
	     * Taking input and printing output is handled automatically.
	     */
        int length=str.length();
        int minIndex=0,maxIndex=1;
        String str1="";
        for(int i=0;i<length;i++){
            
            HashMap<Character,Boolean> map=new HashMap<>();
            for(int j=i+2;j<=length;j++){
                str1=str.substring(i,j);
                int tempL=str1.length();
                
                for(int k=0;k<tempL;k++){
                    map.put(str1.charAt(k),true);
                }  
                
                if(map.size()==tempL && (maxIndex-minIndex)<tempL){
                    minIndex=i;
                    maxIndex=j;
                }
                
            }
        }
        
         return str.substring(minIndex,maxIndex);
        
	}

}
