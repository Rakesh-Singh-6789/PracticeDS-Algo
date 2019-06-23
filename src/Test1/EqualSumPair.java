package Test1;
import java.util.*;
import java.io.*;

public class EqualSumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]={9 ,8, 7, 10, 20 ,30};
        System.out.println(findPairs(arr));
	}
	
	public static boolean findPairs(int[] arr){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return the desired output and don't print anything.
         * Taking input and printing output is handled automatically.
         */
        
        int length1=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        boolean bl=false;
        
        for(int i=0;i<length1;i++){
            
            int num=arr[i];
            int val=0;
            
            if(map.containsKey(num))
                val=map.get(num);
            
            
                val+=1;
            
            map.put(num,val);
            
        }
        
       
        
        ArrayList<Integer> list=new ArrayList<>(map.keySet());
        int length=list.size();
        list.sort(null);
        
        for(int i=0;i<length;i++){
            
            int num1=list.get(i);
            
            for(int j=i+1;j<length;j++){
                
                int num2=list.get(i);
                int sum=num1+num2;
                
                if(map.get(num1)>1 || map.get(num2)>1)
                {
                    bl=true;
                    break;
                    }
                
                
                for(int k=j+1;k<length;k++){
                       int check=arr[k];
                    if(sum-check>-1){
                        if(map.containsKey(sum-check)){
                            bl=true;
                            break;
                        }
                    }else{
                        break;
                    }
                }
                
                
            }
            
            if(bl)
                break;
            
        }
        
      return bl;  
	}

}
