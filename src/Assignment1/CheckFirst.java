package Assignment1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

import org.xml.sax.ext.LexicalHandler;

public class CheckFirst {



	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0){
		    
		    String str=br.readLine();
		    int length=str.length();
		    
		    long cnt0=1,cnt1=1;
		    
		    //int count0=1,count1=1;
		    long lengthNeed=2;
		    int countArray[]=new int[2];
		    
		    countArray=find1and0s(str);
		    int max0=countArray[0];
		    int max1=countArray[1];
		    
		    
		    int ans=0;
		    while(lengthNeed<=str.length()){
		        
		      for(long i=0;i<=length-lengthNeed;i++){
		    	  //System.out.println(i+": "+(i+lengthNeed));
		          countArray=find1and0s(str.substring((int)i,(int)(i+lengthNeed)));
		          if(countArray[0]==countArray[1]*countArray[1]){
		        	  //System.out.println(countArray[0]+": "+countArray[1]);
		        	  //System.out.println(str.substring((int)i,(int)(i+lengthNeed)));
		              ans++;
		          }
		          
		         
		      }
		      cnt1++;
	          cnt0=cnt1*cnt1;
	          lengthNeed=cnt1+cnt0;  
	          if(cnt1>max1 || cnt0 > max0){
	              break;
	          }
		        
		    }
		    
		    
		  System.out.println(ans);  
		}
		
	}
	
	public static int[] find1and0s(String str){
		//System.out.println(str);
	    int arr[]=new int[2];
	    int l=str.length();
	    for(int i=0;i<l;i++){
	        if(str.charAt(i)=='1'){
	            arr[1]++;
	        }else{
	            arr[0]++;
	        }
	    }
	    return arr;
	}
	
}
