package Assignment1;

public class CheckFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];
		arr = new int[6];
		int size=arr.length;

		String str="aba";
		/*System.out.println(str.substring(3, 8));

		String myStr[]=str.split("");

		System.out.println(myStr.length);*/
	
		StringBuilder sb=new StringBuilder(str);
        sb=sb.reverse();
        
        System.out.println(str.equals(sb.toString()));



	}

}