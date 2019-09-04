package implementation;

import java.util.Scanner;

public class GreatKian {

	public static void main(String[] args) {
		
		//int []a={1, 2, 3, 4, 5};
		int sum=0;
		int n=0;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		int []a1=new int[n];
		
		for (int j=0;j<=n-1;j++){
			a1[j]=scan.nextInt();
		}
		
		for (int i=0;i<3;i++){
			sum=a1[i];
			for (int j=i+3;j<=a1.length-1;j=j+3){
				
				sum=sum+a1[j];
			}
			
			System.out.println(sum);
			sum=0;
		}
		
	}

}
