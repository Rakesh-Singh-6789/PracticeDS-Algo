package Assignment2;

public class Q92_BreakWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int countPalindromeSubstrings(String s) {
		// Write your code here
        int length=s.length();
        int count=length;
        
        for(int i=0;i<length;i++){
            
            
            for(int j=i+2;j<=length;j++){
               
                StringBuilder sb=new StringBuilder(s.substring(i,j));
                 String tempStr=sb.reverse().toString();
                if(tempStr.equals(s.substring(i,j))){
                    count++;
                }
            }
        }
       return count;
	}

}
