package arrays;

public class Xor {

	public static void main(String[] args) {
		
	int A[]={1,3,1,4,3};
	int count=0;
	  for(int k=0;k<=A.length-1;k++){
		  
          for(int l=k+1;l<=A.length-1;l++){
          
          if((A[k]^A[l])==0){
              count++;
          }
      }
       
   }
    System.out.println(count);
  
}
}
