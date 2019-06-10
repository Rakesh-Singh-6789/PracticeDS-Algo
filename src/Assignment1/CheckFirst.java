package Assignment1;

import java.math.BigInteger;
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
		
		/*HashMap<Integer,Integer> map=new HashMap<>();
		
		int d=Math.abs(5-6);
		
		System.out.println(d);
		System.out.println()
		;
		
		int c=(int) Math.log10(6);
		
		if(map.containsKey(1) || d==0){
			System.out.println("sdkjfh");
		}
		int m=map.getOrDefault(5, 10);
		System.out.println(m);
		System.out.println((int)Math.ceil(0.75*9));*/
		
		
		/*int n=1000000000;
		int array[]=new int[n];*/
		
		double val;
		int modulus=1000000007;
		
		/*for(int i=1;i<=50;i++){
			double pow=1.0*i*1000;
			val=(Math.pow(2.0,pow)%modulus);
			System.out.println(i+" "+val+"  "+pow);
		}*/
		
		/*System.out.println((long)(Math.pow(2, 1000)%modulus));
		long ans=1;
		for(int i=1;i<=2000;i++){
			ans=(ans*2)%modulus;
		}
		System.out.println(ans);
		
		BigInteger mod=new BigInteger("1000000007");
	    BigInteger bi=new BigInteger("688423210");
		System.out.println(new BigInteger("688423210").multiply(bi).mod(mod));*/
		
		System.out.println((int)(Math.pow(2, 100)%modulus));
		
		/*int count=0;
		for(int i=0;i<1000;i++){
			HashMap<Integer,Integer> map=new HashMap<>();
			int num=i;
			int ud=num%10;
			map.put(ud, 1);
			int td=(num%100)/10;
			map.put(td, 1);
			int hd=(num/100);
			map.put(hd, 1);
			
			num=999-i;
			ud=num%10;
			map.put(ud, 1);
			td=(num%100)/10;
			map.put(td, 1);
			hd=(num/100);
			map.put(hd, 1);
			
			if(map.size()==2){
				count++;
			}
		}
		
		System.out.println(count);*/
		
		
		
		
		
		/*if(map.containsKey(1)){
			map.put(1,map.get(1));
		}
		System.out.println(map);
		Collection<Integer> set=map.values();
		
		System.out.println(set);*/
		
	
	}

}