package Assignment2;

public class Q7_CountPlatforms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 int length=arrival.length;
	        int count=0;
	        int maxPlatform=1;

	        Arrays.sort(arrival);
	        Arrays.sort(departure);
	        
	        int a=0,d=0;
	        
	        while(a<length && d<length){
	            
	            if(arrival[a]<departure[d]){
	                count++;
	                a++;
	            }else{
	                count--;
	                d++;
	            }
	            
	            if(count>maxPlatform){
	                maxPlatform=count;
	            }           
	            
	        }

	}

}
