package arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		
		int A[]={1,2,3,4,5,6,7};
		
		for(int i=0;i<=(A.length-1)/2;i++){
			
			int temp=A[i];
			A[i]=A[A.length-1-i];
			A[A.length-1-i]=temp;
			
		}
		
		for(int k:A){
			
			System.out.println(k);
		}
	}

}
