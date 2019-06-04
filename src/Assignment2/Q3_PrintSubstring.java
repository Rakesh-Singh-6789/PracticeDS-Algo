package Assignment2;

public class Q3_PrintSubstring {

	public static void printSubstrings(String str){

        /* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Print output as specified in the question.
		*/
        PrintWriter out=new PrintWriter(System.out);
        int length=str.length();

        for(int i=0;i<length;i++){
            for(int j=i+1;j<=length;j++){
                out.println(str.substring(i,j));
            }
        }

        out.flush();
        out.close();
    }
}
