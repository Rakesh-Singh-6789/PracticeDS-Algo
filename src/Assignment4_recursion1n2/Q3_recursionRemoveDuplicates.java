package Assignment4_recursion1n2;

public class Q3_recursionRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(removeConsecutiveDuplicates("aabcabbc"));

	}
	 public static String removeConsecutiveDuplicates(String s) {
	        // Write your code here


	        String ans="";

	        return removeD(s,ans);

	    }

	    public static String removeD(String str,String ans){

	        if(str.length()==0){
	            return ans;
	        }
	        
	        if(str.length()==1){
	        	ans+=str.charAt(0);
	        	return ans;
	        }

	        if(str.charAt(0)!=str.charAt(1)){
	            ans+=str.charAt(0);
	        }


	        return removeD(str.substring(1),ans);

	    }

	}