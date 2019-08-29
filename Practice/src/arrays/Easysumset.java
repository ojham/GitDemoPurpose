package arrays;

public class Easysumset {

	public static void main(String[] args) {
		
		int A[]={1,2};
		int C[]={3,4,5};
		
		int diff=0;
		
        for (int k=0;k<=C.length-1;k++){
            
            if (C[k]<=100)
            {
                
             diff=C[k]-A[0];
             
            for (int l=1;l<=A.length-1;l++){
                
                if(A[l]<=100){
                    int sum= diff+A[l];
                
                for (int m=0;m<=C.length-1;m++){
                    
                    if(sum==C[m]){
                        
                        System.out.print(diff+" ");
                        break;
                    }
                }
            }
                }
               
          
            }
        }
		
}
}
