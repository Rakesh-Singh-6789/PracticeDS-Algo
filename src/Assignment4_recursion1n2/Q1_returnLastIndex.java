package Assignment4_recursion1n2;

public class Q1_returnLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,5,6,5,9};
		
		System.out.println(firstIndex(arr,5));

	}
	
	 public static int firstIndex(int input[], int x) {
	        /* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
		 	 * Taking input and printing output is handled automatically.
			*/

	        return firstIndex(input,x,0);

	    }

	    public static int firstIndex(int input[], int x,int startIndex) {

	      if(startIndex>=input.length){
	          return -1;
	      } 
	        
	      

	        
	       int index=firstIndex(input,x,startIndex+1);
	        
	       if(index==-1 && input[startIndex]==x){
	          return startIndex;
	       }
	       
	       return index;
	        
	        
	      
	    }

	}