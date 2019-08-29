package problems;

import java.util.Scanner;

public class Pronic {

	public static void main(String[] args) {
		
		//enter the number
		int n=1;
		Scanner scan=new Scanner(System.in);
		int number = scan.nextInt();
		boolean itspronic=false;
		
		while(n<=number){
			if(number%n==0){
				if(n*(n+1)==number){
					itspronic=true;
					break;
				}
			}
			n++;
		}
		
		if(itspronic){
			System.out.println("Its pronic number");
		}else{
			System.out.println("Its not  pronic number");
		}
		
		scan.close();
	}

}
