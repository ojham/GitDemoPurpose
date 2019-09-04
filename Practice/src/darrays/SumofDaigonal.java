package darrays;

public class SumofDaigonal {

	public static void main(String[] args) {
		
		int [][] arr= new int [3][3];
		int sum=1;
		int sumdaigonal=0;
		int seconddaigonal=0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				arr[i][j]=sum;
				sum++;
				System.out.print(arr[i][j]);
				System.out.print(' ');
			}
			System.out.println();
			
		}
		
	/////First Daigonal	
		for(int k=0;k<=arr.length-1;k++)
		{
			for(int l=0;l<=arr.length-1;l++)
			{
				if(k==l){
					
					sumdaigonal+=arr[k][l];
				}
					
				
			}
		}
		
		System.out.println(sumdaigonal);
		System.out.println(seconddaigonal);
		
	

	}

}
