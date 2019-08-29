package arrays;

public class Segreggate {

	public static void main(String[] args) {
		
		int[]a={0,1,0,1,0,0,1,1,1,0};
		int count=0;
		
		for(int i=0;i<=a.length-1;i++){
			if(a[i]==0){
				
				count++;
			}
		}	
		for(int j=0;j<=a.length-1;j++){
			
			while(j<=count){
				a[j]=0;
				j++;
			}
			a[j]=1;
		}
			
		
		for(int k:a){
			
			System.out.println(k);
		}
		
		
		
}
}
