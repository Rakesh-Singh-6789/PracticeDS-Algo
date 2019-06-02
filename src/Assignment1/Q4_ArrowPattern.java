package Assignment1;

import java.io.*;

public class Q4_ArrowPattern {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);

		int n=Integer.parseInt(br.readLine());
		int space=0,i=1,mid=(n+1)/2,midP=mid;
		
		while(i<=n){
			
			
			if(i<=mid){
			for(int s=0;s<space;s++){
				out.print(" ");
			}
			space++;
			
			for(int l=1;l<=i;l++){
				out.print("* ");
			}		
			}else{
	
				for(int s=space-2;s>0;s--){
					out.print(" ");
				}
				space--;
				for(int l=midP-1;l>0;l--){
					out.print("* ");
				}
				midP--;			
			}
			
			i++;
			out.println();
		}
		out.flush();
		out.close();
		
	}

}