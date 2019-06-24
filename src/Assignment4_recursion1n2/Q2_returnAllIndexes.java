package Assignment4_recursion1n2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Q2_returnAllIndexes {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,5,6,5,9};
		
		allIndexes(arr,5);

	}

	public static void allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
       
         
        ArrayList<Integer> list=new ArrayList<>();        
		ArrayList<Integer> ans= allIndexes(input,x,list,0);
		
		System.out.println(ans);
	}
    public static ArrayList<Integer> allIndexes(int input[], int x,ArrayList<Integer> output,int startIndex) {
		
        
        if(startIndex>=input.length){
            return output;
        }
        
        if(input[startIndex]==x){
          output.add(startIndex);
        }
        
        return allIndexes(input,x,output,startIndex+1);
        
        
	}
    
	
}