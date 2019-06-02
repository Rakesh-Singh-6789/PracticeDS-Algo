package Assignment1;

import java.io.*;

public class Q5_NumberPattern {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);

		int n=Integer.parseInt(br.readLine());
		int space=2*n-3,i=1,fv;
		while(i<=n){
			fv=n;
			for(int l=1;l<=i;l++){
				out.print(fv--);
			}
			
			for(int s=0;s<space;s++){
				out.print(fv+1);
			}
			space-=2;
			
			
			for(int l=fv+1;l<=n;l++){
				
				if(i==n && l==1)
					continue;
				out.print(l);
			}
			
			i++;
			out.println();
		}
		i=2;
		space=1;
		while(i<=n){
			fv=n;
			int times=n-i+1;
			for(int l=1;l<=times;l++){
				out.print(fv--);
			}
			
			for(int s=0;s<space;s++){
				out.print(fv+1);
			}
			space+=2;
			
			
			for(int l=fv+1;l<=n;l++){
				out.print(l);
			}
			
			i++;
			out.println();
		}
		out.flush();
		out.close();
		
	}

}