package arrays;

public class Bubblesort {

	public static void main(String[] args) {
		
		int A[]={7,4,3,15,1,2};
		int Max=0;
		int Min=0;
		
		for(int i=0;i<=A.length-1;i++){
			
			for(int j=0;j<A.length-1;j++){
				
				if(A[j]>A[j+1]){
					
					int temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
				
			}
		}
		
		  for(int m=0;m<=3;m++){
              Min =Min+A[m];
          }
          for(int n=A.length-1;n>1;n--){
              Max=Max+A[n];
          }
          
          System.out.println(Max-Min);
		
          for(int k:A){
  			System.out.println(k);
  		}
	}

}
