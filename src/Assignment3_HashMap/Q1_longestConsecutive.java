package Assignment3_HashMap;

import java.util.*;

public class Q1_longestConsecutive {

	public static void main(String args[]){


		int arr[]={2 ,12, 9, 16, 10, 5, 3 ,20, 25, 11 ,1, 8 ,6 };

		System.out.println(longestSubsequence(arr));
	}
	public static ArrayList<Integer> longestSubsequence(int[] arr){
		// Write your code here

		ArrayList<Integer> list=new ArrayList<>();
		int length=arr.length;
		HashMap<Integer,Integer> map=new HashMap<>();

		for(int i=0;i<length;i++){

			map.put(arr[i],0);

		}

		//System.out.println(map);
		int maxLength=0;
		int minVal=0,maxVal=0;

		for(int i=0;i<length;i++){

			int num=arr[i];

			if(map.get(num)>0)
				continue;

			int   curMinVal=num;
			int   curMaxVals=1;

			map.put(num,1);



			int j=num+1;

			while(true){
				 //System.out.println(maxVal+" "+minVal);
				if(map.containsKey(j)){
					int val=map.get(j);
                   
					if(val>1){
						//System.out.println("if part");
						curMaxVals+=val;
						map.put(num,curMaxVals);
						int temp=num+curMaxVals;
						if((temp-num)>(maxVal-minVal)){
							maxVal=temp;
							minVal=num;
						}
						break;
					}else{
						//System.out.println("else part");

						map.put(j,1);
						j++;
						curMaxVals++;
					}

				}else{
					map.put(num,curMaxVals);
					int temp=num+curMaxVals;
					if((temp-num)>(maxVal-minVal)){
						maxVal=temp;
						minVal=num;
					}
					break;

				}

			}

		}

      //System.out.println(map);

		for(int k=minVal;k<maxVal;k++){
			list.add(k);
		}  

		//System.out.println("min "+minVal+ " max: "+maxVal+" size:"+list.size());
		return list;
	}

}
