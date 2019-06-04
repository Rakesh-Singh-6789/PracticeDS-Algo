package Assignment2;

public class Q2_CheckPall {

	public static boolean checkPalindrome(String str){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        StringBuilder sb=new StringBuilder(str);
        sb=sb.reverse();        
        return str.equals(sb.toString());

	}

}
