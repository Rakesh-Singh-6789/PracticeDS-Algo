package Assignment1;
import java.util.*;
public class FreqCount {
        static class myCount{
        	int key;
        	int freq;
        	
        	public myCount(int key,int freq) {
				// TODO Auto-generated constructor stub
        		this.key=key;
        		this.freq=freq;        		
			}
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> map=new HashMap<>();
		map.put(2, 4);
		map.put(3, 5);
		map.put(4, 2);
		map.put(8, 3);
		
		
		
		myCount[] myArr=new myCount[map.size()];
		
		Set<Integer> set=map.keySet();
		int k=0;
		for(int ele: set){
			myArr[k++]=new myCount(ele,map.get(ele));
		}
		
		for(int i=0;i<map.size();i++){
			for(int j=0;j<map.size()-1;j++){
				
				if(myArr[j].freq < myArr[j+1].freq){
					
					
					myCount temp=new myCount(myArr[j].key, myArr[j].freq); 
					myArr[j]=myArr[j+1];
					myArr[j+1]=temp;
				}
				
			}
		}
		
		for(int i=0;i<map.size();i++){
			
			System.out.println(myArr[i].key+" : "+myArr[i].freq);
		}

	}

}
