package Assignment2;

import java.io.*;
import java.util.StringTokenizer;
public class Q4_RowWiseSum {

	public static void main(String[] args) throws IOException{
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        
        st=new StringTokenizer(br.readLine());
        int length=m*n;
        
        for(int i=0;i<length;i+=m){
            int sum=0;
            for(int j=0;j<m;j++){
                int a=Integer.parseInt(st.nextToken());
                sum+=a;
            }            
            out.print(sum+" ");
        }
         
        out.flush();
        out.close();
	}
}