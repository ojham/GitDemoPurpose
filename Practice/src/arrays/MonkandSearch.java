package arrays;

public class MonkandSearch {

	public static void main(String[] args) {
		
		int A[]={1,2,3,4};	
		int B[]={0,1,0};	
		int C[]={5,3,3};
		
		int count=0;
		
		for(int j=0;j<=B.length-1;j++){
			
		//	binarysearch();
			
			if(C[j]==1){
				
				
			}
		//	else if(){
				
			}
			//else if
		}
		
	//}
	
	public int binarysearch(int x[],int low,int high,int key){
		
		while(low<high){
			
			int mid=(low+high)/2;
			
			if(x[mid]>key){
				
				high=mid-1;
			}
			else if(x[mid]<key){
				low=mid+1;
			}
			else{
				return mid;
			}
		}
		
		return -1;
		
	}

}
