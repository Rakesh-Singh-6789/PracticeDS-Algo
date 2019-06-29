package Assignment4_recursion1n2;

public class Q7_InterLeavingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void interleavings(String first, String second){

		// Write your code here
        if(first.length()==0 || second.length()==0 ){
            return;
        }
        
        String str="";
        interleaves(first,second,str);
        
    }
    public static void interleaves(String first,String second,String str){
        
        
        if(first.length()==0 && second.length()==0){
            System.out.println(str);
            return;
        }
        
        if(first.length()!=0){
            interleaves(first.substring(1),second,str+first.charAt(0));
        }
        
        
        if(second.length()!=0){
            interleaves(first,second.substring(1),str+second.charAt(0));
        }
        
        
    }
	
}
