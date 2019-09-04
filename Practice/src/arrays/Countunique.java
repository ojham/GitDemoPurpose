package arrays;

public class Countunique {

	public static void main(String[] args) {
		
		int arr[]={4,2,4,5,2,3,1};
		int []count=new int[10];
		int distinct=0;
		
		
		for(int i=0;i<=arr.length-1;i++){
			
			if (count[arr[i]]==0){
				count[arr[i]]=1;
				
			}
		}	
			for (int j=0;j<=arr.length-1;j++){
				if(count[j]!=0){
					distinct++;
				}
			}
			
			
			System.out.println(distinct);
		

}
}
