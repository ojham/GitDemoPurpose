package basicinputoutput;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int fact=1;
		int N=scan.nextInt();
		if (N>=1 && N<=10){
			
			while(N!=1){
				
				fact=fact*N;
				N--;
			}
			
			System.out.println(fact);
		}
		
		
	}

}
