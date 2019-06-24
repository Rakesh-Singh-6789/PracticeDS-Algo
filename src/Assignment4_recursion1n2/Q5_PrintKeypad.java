package Assignment4_recursion1n2;

public class Q5_PrintKeypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         printKeypad(234);
	}

	public static void printKeypad(int input){
		// Write your code here
		String ans="";
        printKeypad(input,ans);
        
	}
    
    public static void printKeypad(int num,String outputSoFar){
        
        if(num==0 ){
            System.out.println(outputSoFar);
            return;
        }
        
        int key=num%10;
        num/=10;
        
        char ch[]=helper(key);
        
        for(int i=0;i<ch.length;i++){
        	 //System.out.println(ch[i]+outputSoFar);
        	 printKeypad(num,ch[i]+outputSoFar);
        }
       
        
      
        
        
        
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
