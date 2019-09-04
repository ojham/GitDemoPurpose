package basicinputoutput;

import java.util.Scanner;

public class Duration {

	public static void main(String[] args) {
		
		int N=0;
		int SH=0;
		int SM=0;
		int EH=0;
		int EM=0;
		int HH=0;
		int MM=0;
		int i=1;
		Scanner scan = new Scanner(System.in);
		
		N=scan.nextInt();
		
		while(i<=N){
			
			SH=scan.nextInt();
			System.out.print(" ");
			
			SM=scan.nextInt();
			System.out.print(" ");
			
			
			EH=scan.nextInt();
			System.out.print(" ");
			
			EM=scan.nextInt();
			System.out.print(" ");

		 
		
		  HH=(Math.abs(((SH*60)+ SM)-((EH*60)+EM)))/60;
		  MM= (Math.abs(((SH*60)+ SM)-((EH*60)+EM)))%60;
			
		  System.out.print(HH+" "+MM);
			
			
			i++;
		}
		
	}

}
