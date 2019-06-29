package Assignment4_recursion1n2;

public class Q6_MinCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(minCount(20));

	}
	public static int minCount(int num){
		/* Your class should be named Solution
	 	 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		*/
		  if(num<=3){
	    	  return num;
	      }
	       int smallAns=num;
	       
	       for(int i=1;i<num;i++){
	    	   
	    	   int temp=i*i;
	    	   if(temp>num)
	    		   break;
	    	   
	    	   smallAns=Math.min(num,1+minCount(num-temp));
	    	   
	       }
	       return smallAns;
	}
    
}
