package arrays;

public class Countingdistinct {

	public static void main(String[] args) {
		
		int arr[]={4,2,4,5,2,3,1,4};
		
		int res=1;
		for (int i = 0; i < arr.length; i++)  
	    { 
	        int j = 0; 
	        for (j = 0; j < i; j++) {
	        	 if (arr[i] == arr[j]) 
		                break; 
	        }           
	        if (i == j) {
	            res++; 
		        System.out.println(arr[j]);
	        }
	        
	        
	        
	    } 
		
	//	System.out.println(res);
		
	
	}

	
	

}
