package arrays;

import java.util.Arrays;

public class BishuandSoldiers {

	public static void main(String[] args) {
		
		
		int n=7;
		int A[]={2,3,1,4,7,6,5};
		
		int q=3;
		int p[]={3,10,2};
		int sum=0;
		int count=0;
		
		

		for(int i=0;i<=p.length-1;i++){
			
			for(int j=0;j<=A.length-1;j++){
				
				if(A[j]<=p[i]){
					
					sum=sum+A[j];
					count++;
				}

			}
			System.out.print(count+" "+sum);
			System.out.println();
			sum=0;
			count=0;
			
		}
		
		
		
		
		
//		for(int i=0;i<=p.length-1;i++){
//			
//			int rank=binarysearch(A, 0, A.length-1, p[i]);		
//			if(rank==-1){
//				
//				for(int j=0;j<=A.length-1;j++){
//					sum=sum+A[j];			
//				}
//				rank=A.length;
//			}
//			else
//			{
//				for(int j=0;j<=rank;j++){
//					sum=sum+A[j];		
//				}	
//			}
//		     	System.out.print(rank+" "+sum);
//		     	System.out.println();
//		     	
//				sum=0;
//			
//	}

		
	}

	public static int binarysearch(int arr[], int low, int high,int key){
		
		
		Arrays.sort(arr);
		while(low<=high){
			
			int mid=(low+high)/2;
			
			if(arr[mid]<key){
				
				low=mid+1;			
				
			}
			else if (arr[mid]>key){
				high=mid-1;
				
			}
			else{
				return mid;
			}			
		}
		
		return -1;
	}

}
	

