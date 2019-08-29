package arrays;

import java.util.HashMap;

public class Clockwiserotation {

	public static void main(String[] args) {
		
	
		int A[]={1,2,3,4,5};
		
		int temp=A[A.length-1];
		
		for(int i=A.length-1;i>0;i--){
			
			A[i]=A[i-1];
			
		}
		A[0]=temp;
		
		for(int k:A){
			System.out.print(k+" ");
		}
	}

}
