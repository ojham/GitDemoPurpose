package stringsearch;

public class WetClothes {

	public static void main(String[] args) {
		
		
		int g=2;
		int t[]={3,5,8};
		int a[]={2,1,3,9,1};
		
		int chance=0;
		int count=0;
		
		for(int i=1;i<=t.length;i++){
			
			if(chance<g)
			{
				
				int diff=t[i]-t[i-1];
				
				for(int k=0;k<=a.length-1;k++)
				{
					
					if (a[k]!=0 && a[k]<=diff)
					{
						count++;
						a[k]=0;
					}
			   }
				chance++;
			}
			else{
				break;
				}	
				
			}
		
		System.out.println(count);
}
}
