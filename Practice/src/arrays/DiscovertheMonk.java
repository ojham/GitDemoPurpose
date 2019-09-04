package arrays;

import java.util.Arrays;

public class DiscovertheMonk {

	public static void main(String[] args) {
		
		int A[]={50,40,30,20,10};
		
		int B[]={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		Arrays.sort(A);
		
		for(int i=0;i<=B.length-1;i++){
			
			int ret=binarysearch(A,0,A.length-1,B[i]);
			
			if(ret==-1){
				System.out.println("NO");
			}
			else if(A[ret]==B[i]){
				System.out.println("YES");
			}
		}
			
		
	}

	
	public static int binarysearch(int a[],int low,int high,int key){
		
		
		while(low<=high){
			
			int mid=(low+high)/2;
			
			if(a[mid]>key){
				
				high=mid-1;
			}
			else if(a[mid]<key){
				low=mid+1;
			}
			else{
				return mid;
			}
		}
	
		
		
		
		
		return -1;
		
	}
}
