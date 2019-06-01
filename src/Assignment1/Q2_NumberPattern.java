package Assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Q2_NumberPattern {

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
			p=i;
			for(int times=0;times<i;times++){
			    
			    	out.print(p++);
			      
				
			}
			out.println();
			i++;
			
			
		}
		out.flush();
		out.close();
		
	}

}
