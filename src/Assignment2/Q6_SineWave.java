package Assignment2;

public class Q6_SineWave {

public static void wavePrint(int input[][]){
		
		// Write your code here
        int n=input.length;
        int m=input[0].length;
        
        for(int i=0;i<m;i++){
            if(i%2==0){
                
                for(int j=0;j<n;j++){
                    System.out.print(input[j][i]+" ");
                }             
                
                
            }else{
                  
                for(int j=n-1;j>-1;j--){
                    System.out.print(input[j][i]+" ");
                } 
            }
        }

	}

	
}