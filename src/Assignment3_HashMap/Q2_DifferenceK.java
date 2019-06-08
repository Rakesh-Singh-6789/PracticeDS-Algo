package Assignment3_HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Q2_DifferenceK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* int arr[]={119 ,341, 365, 406, 159, -98, -46, 166 ,-146, 141 ,-263, 260, -368, -350, -85, -42, -83, -266, 286, -24};
        int k=183;*/
		int arr[]={4,4,4,4};
        int k=0;
        findPairsDifferenceK(arr, k);
	}
	
public static void findPairsDifferenceK(int[] arr, int k){
		
        int length=arr.length;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<length;i++){
            int val=1;
            int num=arr[i];
            
            if(map.containsKey(num)){
                val=map.get(num);
                val++;
            }
            
            map.put(num,val);
        }
        
        Set<Integer> set=new HashSet<>();
        set=map.keySet();
        
        
        for(int i: set){
            int a=i;
            int aVal=map.get(i);
            int b=a-k;            
            int b1=a+k;       
           
            
            if(map.containsKey(b) && map.get(a)>0 ){
                if(map.get(b)==0){
                	continue;
                }
                 if(a==b){
                int numFreq=map.get(a);
                 int loop=(numFreq*(numFreq-1))/2;
                
                for(int m=0;m<loop;m++){
                    System.out.println(a+" "+b);
                    
                }
               map.put(a,0); 
            }else{
                int loop=aVal*map.get(b);
                 int min=Math.min(a,b);
                 int max=Math.max(a,b);
                for(int m=0;m<loop;m++){
                    System.out.println(min+" "+max);
                    
                }
                map.put(a,0);
                map.put(b,0);
            }  
                
            }
        
        
                   
            
        }
        
        
	}

}
