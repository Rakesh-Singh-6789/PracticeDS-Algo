package Assignment2;

public class Q91_CountPallSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countPalindromeSubstrings("ababab"));

	}
	
	public static int countPalindromeSubstrings(String s) {
		// Write your code here
        int length=s.length();
        int count=length;
        System.out.println(count);
        for(int i=0;i<length;i++){
            
            
            for(int j=i+2;j<=length;j++){
                System.out.println(s.substring(i,j));
                StringBuilder sb=new StringBuilder(s.substring(i,j));
                
                if(sb.reverse().toString().equals(s.substring(i,j))){
                	System.out.println("true");
                    count++;
                }
            }
        }
       return count;
	}

}
