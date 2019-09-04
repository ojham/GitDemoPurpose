package arrays;

public class Duplicatearray {

	public static void main(String[] args) {
		
		int arr[]={1,3,1,4,3,3,4,6,5,8,6};
		int count=0;		
		for(int i=0;i<=arr.length-1;i++)
		{
			
			for(int j=0;j<arr.length-1;j++){
				
				if((arr[j]>arr[j+1])){
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		     }		
	}
	
		for(int i=0;i<arr.length;i++)
		{		
			while( i<arr.length-1 && arr[i]==arr[i+1])
			{		
				count++;
				i++;
			}			
			if(count>=1){
				System.out.println(arr[i]);
			}
			count=0;
		}
		
		
}
}