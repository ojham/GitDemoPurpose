package arrays;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class SelectionSort {

	public static void main(String[] args) {
		
		int A[]={7,4,3,2,1,15};
		
		int bigindex=0;
		
		for(int i=0;i<=A.length-1;i++){
			
			
			bigindex=i;
			
			for(int j=i+1;j<=A.length-1;j++){
				
				if(A[bigindex]<A[j]){
					
					bigindex=j;
					
				}
				
				int temp=A[j];
				A[j]=A[bigindex];
				A[bigindex]=temp;
				
			}
		}
		
		
		for(int a:A){
			System.out.println(a);
		}
		
}
}
