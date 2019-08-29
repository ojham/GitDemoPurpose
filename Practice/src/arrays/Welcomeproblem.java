package arrays;

import java.util.Scanner;

public class Welcomeproblem {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
	       int N=scan.nextInt();
	       if (N>=1 && N<=100000){
	           
	           int A[]=new int[N];
	           int B[]=new int[N];
	           int C[]=new int[N];
	           
	           for (int i=0;i<=N-1;N++){
	               
	               A[i]=scan.nextInt();
	               B[i]=scan.nextInt();
	               
	           }
	           
	           for (int j=0;j<=N-1;N++){
	               
	               if (A[j]>=1 && A[j]<=100000){
	                   
	                   if (B[j]>=1 && B[j]<=100000){
	                       
	                       C[j]=A[j]+B[j];
	                   }
	               }
	           }
	           
	           for (int k:C){
	               System.out.print(k);
	           }
	       }

	}

}
