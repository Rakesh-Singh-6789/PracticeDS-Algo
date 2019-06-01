package Assignment1;

import java.io.*;
import java.util.*;

public class Q2_NumberPattern2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);

		int n=Integer.parseInt(br.readLine());
		int space=2*n-2,i=1;
		while(i<=n){
			for(int l=1;l<=i;l++){
				out.print(l);
			}
			
			for(int s=0;s<space;s++){
				out.print(" ");
			}
			space-=2;
			
			for(int l=i;l>0;l--){
				out.print(l);
			}
			
			i++;
			out.println();
		}
		out.flush();
		out.close();
		
	}

}