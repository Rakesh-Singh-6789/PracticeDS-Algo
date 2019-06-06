package Assignment2;

public class Q8_CountLeaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={ 3 ,12 ,34 ,2 ,0, -1};
		leaders(arr);

	}
	public static void leaders(int[] input) {
        /* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */

        int length=input.length;
        int max;
        boolean bl=true;
        for(int i=0;i<length-1;i++)
        {    
             bl=true;
            max=input[i];
            for(int j=i+1;j<length;j++){

                if(max<input[j]){
                    bl=false;
                    break;   
                }             
            }
            if(bl){
               System.out.print(max+" "); 
            }
        }
          System.out.print(input[length-1]);


    }

}
