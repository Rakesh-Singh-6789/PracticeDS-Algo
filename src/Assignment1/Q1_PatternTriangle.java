package Assignment1;


import java.io.*;
import java.util.*;

public class Q1_PatternTriangle {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
		int n=Integer.parseInt(br.readLine());
		int space=n-1,p=1,i=1;
		while(i<=n){
			
			for(int j=0;j<space;j++){
				out.print(" ");
			}
			space--;
			int length=2*i-1;
			p=i;
			for(int times=0;times<length;times++){
			    if(times<i-1){
			    	out.print(p++);
			    }else{
			    	if(times==i){
			    		p=p--;
			    	}
			    	out.print(p--);
			    }
				
			}
			out.println();
			i++;
			
			
		}
		out.flush();
		out.close();
		
	}

}
