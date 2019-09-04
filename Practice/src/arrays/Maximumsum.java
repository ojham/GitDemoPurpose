package arrays;

import java.util.Arrays;

public class Maximumsum {

	public static void main(String[] args) {
		
		
		int A[]={1,2,-4,-2,3};
		int count=0;
		int sum=0;
		
		for (int i=0;i<=A.length-1;i++){
			
			if(A[i]>0){
				
				sum=sum+A[i];
				count++;
			}
						
		}
    if (count==0){
            
            Arrays.sort(A);
            System.out.print(A[0]+" "+count);
        }
        else if (count>0){
            System.out.print(sum+" "+count);
        }
		
}
}
