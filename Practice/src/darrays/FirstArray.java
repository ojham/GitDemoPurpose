package darrays;

public class FirstArray {

	public static void main(String[] args) {
		int arr [][]= new int [3][3];
		
		int sum=1;
		for (int i=0;i<=arr.length-1;i++){
			
			for(int j=0;j<=arr.length-1;j++){
				
				arr[i][j]=sum;
				sum++;
			}
			System.out.println();
		}
		
		for(int k=0;k<=arr.length-1;k++){
			
			for(int l=0;l<=arr.length-1;l++){
				System.out.print(arr[k][l]);
				System.out.print(' ');
			}
			System.out.println();
		}
		
		

	}

}
