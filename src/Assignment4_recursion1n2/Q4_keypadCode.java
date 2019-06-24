package Assignment4_recursion1n2;

public class Q4_keypadCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ans[]=keypad(234);
		
		for(String i:ans){
			System.out.println(i);
		}

	}
	
	  public static String[] keypad(int num){
	        // Write your code here

	        if(num==0){
	            String ans[]={""};
	            return ans;
	        }

	        
	        int key=num%10;
	        num=num/10;
	        
	        char ch[]=helper(key);
	        String smallAns[]=keypad(num);
	        String ans[]=new String[smallAns.length*ch.length];
	        
	        int k=0; 
	       
	        	for(int i=0;i<smallAns.length;i++){
	        		 for(int j=0;j<ch.length;j++){
	        			 
	        			 ans[k]=smallAns[i]+ch[j];
	        			 k++;
	        			 
	        		 }
	        		 }
	        		
		        	
		        	        	
	        
	        
	        return ans;
	        
	        
	  }

	    public static char[] helper(int n){

	        char ch[][]={
	            {'a','b','c'},
	            {'d','e','f'},
	            {'g','h','i'},
	            {'j','k','l'},
	            {'m','n','o'},
	            {'p','q','r','s'},
	            {'t','u','v'},
	            {'w','x','y','z'}
	        };

	        return ch[n-2];
	        

	    }

	}



