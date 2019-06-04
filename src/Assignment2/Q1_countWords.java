package Assignment2;

public class Q1_countWords {

	
		
		public static int countWords(String str){
			
			/* Your class should be named Solution
		 	* Don't write main().
		 	* Don't read input, it is passed as function argument.
		 	* Return output and don't print it.
		 	* Taking input and printing output is handled automatically.
	        
			*/
	        
	        String myStr[]=str.split(" ");
	        
	        return myStr.length;

		}

	

}
