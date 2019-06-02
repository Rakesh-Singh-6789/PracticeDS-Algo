package Assignment1;

public class CheckFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
   int odd,even,n;
        for(int i=1;i<=n;i++){
            
            if(odd<=n){
                int l=n*odd;                
                for(int j=l-n;j<l;j++){
                    out.print(j+" ");
                }
                odd+=2;
            }else{
                 int l=n*odd;                
                for(int j=l-n;j<l;j++){
                    out.print(j+" ");
                }
                odd+=2;
            }
            
        }    
	}
}