package basicinputoutput;

import java.util.Scanner;

public class Goki {

	public static void main(String[] args) {
		
		int N,X=0;
		
		Scanner scan = new Scanner(System.in);
		N=scan.nextInt();
		
		
		if (N>=1 && N<=1000000)
		{
			int []Y=new int[N];
			X=scan.nextInt();
			
			if(X>=1 && X<=1000000){
				
				for (int i=0;i<=N-1;i++){
					
					Y[i]=scan.nextInt();
				}	
				for (int i=0;i<=Y.length-1;i++){
					
				if (Y[i]>=1 && Y[i]<=1000000){
					
					if (Y[i]>=X){
						System.out.println("YES");
					}else{
						System.out.println("NO");
					}
				}
			
					
				}
			}
			
		}
		
		
	}

}
