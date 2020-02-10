package Assignment1;


import java.util.*;



public class CheckFirst {


	public static void main (String[] args)
	{
		//code
		Scanner scan=new Scanner(System.in);
		String in=scan.nextLine();
		String out=scan.nextLine();
		String strInArr[]=in.split(" ");
		String strOutArr[]=out.split(" ");

		String inTimeHrMinSec[]=strInArr[0].split(":");
		String outTimeHrMinSec[]=strOutArr[0].split(":");
		
		if(strInArr[1].charAt(0)=='p'){
			int change=Integer.parseInt(inTimeHrMinSec[0])+12;
			inTimeHrMinSec[0]=change+"";
		}
		if(strOutArr[1].charAt(0)=='p'){
			int change=Integer.parseInt(outTimeHrMinSec[0])+12;
			outTimeHrMinSec[0]=change+"";
		}
       
		int inSeconds=Integer.parseInt(inTimeHrMinSec[0])*3600;
		inSeconds+=Integer.parseInt(inTimeHrMinSec[1])*60;
		inSeconds+=Integer.parseInt(inTimeHrMinSec[2]);
		
		int outSeconds=Integer.parseInt(outTimeHrMinSec[0])*3600;
		outSeconds+=Integer.parseInt(outTimeHrMinSec[1])*60;
		outSeconds+=Integer.parseInt(outTimeHrMinSec[2]);

        int totalDiffrence=outSeconds-inSeconds;
        
        
        int hours=totalDiffrence/3600;
        int min=(totalDiffrence%3600)/60;
        int sec=((totalDiffrence%3600)%60);
        
        System.out.println(hours+" : "+min+ " : " +sec);
	}
}