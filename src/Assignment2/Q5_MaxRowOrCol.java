package Assignment2;

public class Q5_MaxRowOrCol {

	 public static void findLargest(int input[][]){

	        /* Your class should be named Solution.
			* Don't write main() function.
		 	* Don't read input, it is passed as function argument.
		 	* Print output as specified in the question
			*/

	        String str="";
	        int n=input.length;
	        int m=input[0].length;
	        long max=Long.MIN_VALUE;
	        for(int i=0;i<n;i++){
	            long sum=0;
	            for(int j=0;j<m;j++){
	                sum+=input[i][j];
	            }

	            if(sum>max){
	                max=sum;
	                str="row"+" "+i+" "+max;
	            }

	        }

	        for(int i=0;i<m;i++){
	            long sum=0;
	            for(int j=0;j<n;j++){
	                sum+=input[j][i];
	            }

	            if(sum>max){
	                max=sum;
	                str="column"+" "+i+" "+max;
	            }

	        }

	        System.out.println(str);


	    }


	}
