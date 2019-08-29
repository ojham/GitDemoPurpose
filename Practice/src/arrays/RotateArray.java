package arrays;

public class RotateArray {

	public static void main(String[] args) {
		
		
		int A[]={1,2,3,4,5,6,7};
		
		 int d=2;
		 reverseArray(A, 0,d-1);
		 reverseArray(A,d,A.length-1);
		 reverseArray(A, 0, A.length-1);
		 
		for(int k:A){
			
			System.out.print(k+" ");
		}
		
	}

///using reverse Array
   static int[] reverseArray(int Arr[],int x,int y){
		
    while(x<y){
    	
    	int temp= Arr[x];
    	Arr[x]=Arr[y];
    	Arr[y]=temp;
    	x++;
    	y--;
    	
	
    }
		return Arr;
		
	}

   
   
}
