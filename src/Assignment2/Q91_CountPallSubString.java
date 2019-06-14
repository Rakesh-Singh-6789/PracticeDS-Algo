package Assignment2;

public class Q91_CountPallSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countPalindromeSubstrings("aaaa"));

	}
	
	 public static int countPalindromeSubstrings(String s) {
	        // Write your code here

	        int length=s.length();
	        int count=length;

	        //for odd substrings
	        int mid=1;        

	        while(mid<length){
	            int left=mid-1;
	            int right=mid+1;
	            while(left>-1 && right<length){
	                if(s.charAt(left)==(s.charAt(right))){
	                    count++;
	                    left--;
	                    right++;
	                }else{
	                    break;
	                }       

	            }
	            mid++;
	        }

//System.out.println("odd:"+count);
	        //for even 
	        int midL=0;
	        int midR=1;	       

	            while(midR<length){
	            	
	            	 if(s.charAt(midL)==s.charAt(midR)){
		    	        
		    	            count++;
		    	            
		    	            int leftO=midL-1;
			                int rightO=midR+1;
			               

			                while(leftO>-1 && rightO<length){       
			                	
			                    if(s.charAt(leftO)==s.charAt(rightO)){
			                        count++;
			                        leftO--;
			                        rightO++;
			                    }else{
			                        break;
			                    }        

			                }
		    	            
		                }
	            	
	                midL++;
	                midR++;
	            }
	        






	        return count;
	    }
}
