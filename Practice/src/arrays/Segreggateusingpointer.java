package arrays;

public class Segreggateusingpointer {

	public static void main(String[] args) {
		
		
		int[]A={12,34,45,9,8,90,3};
		
	   int 	i=0;
	   int  j=A.length-1;
	   
	   while(i<j)
	   {
		   
		   while((A[i]%2)==0){
			   i++;
		   }
		   while((A[j]%2)!=0){
			   j--;
		   }
		   if(i<j){
			   
			   int temp=A[i];
			   A[i]=A[j];
			   A[j]=temp;
		   }
	   }
		
	  for(int k:A){
		  
		  System.out.print(k);
		  System.out.print(" ,"); 
		  
		  
	  }
	   
		
		

	}

}
