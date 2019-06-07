package Assignment2;

import java.util.*;
import java.io.*;

public class Q93_PairTo0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={2, 1 ,-2, 2, 3 ,2};
		
		PairSum(arr, 6);

	}
	
public static void PairSum(int[] input, int size) {
		
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print the desired output and don't return anything.
	 	 * Taking input is handled automatically.
		 */
        
        HashMap<Integer,Integer> map=new HashMap<>();
        PrintWriter out=new PrintWriter(System.out);
        for(int i=0;i<size;i++){
            int num=input[i];
            int val=1;
            if(map.containsKey(num)){
                val=map.get(num);
                val++;
            }
            map.put(input[i],val);
        }
       
        
        Set<Integer> set=map.keySet();
        out.println(set);
        for(int i: set){
            if(map.containsKey(-i)){
                int maxPairValue=Math.max(map.get(i),map.get(-i));
                int min=Math.min(i,-i);
                for(int j=0;j<maxPairValue;j++){
                    out.println(min+ " "+ -min);
                }
                
                map.remove(i);
                map.remove(-i);
            }
        }
       
        out.flush();
        out.close();
	}


}
