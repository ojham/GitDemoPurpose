package problems;

public class MaxProfit {

	public static void main(String[] args) {
		
		int a[]={12,10,6,15,19,4,2, 22};
		int bday=0;
		int sday=0;
		int maxprofit=0;
		int diff=0;
		
		for(int i=0;i<=a.length-1;i++){
			for(int j=i+1;j<=a.length-1;j++){
				
				 diff=a[j]-a[i];			
				if(diff>maxprofit){
					maxprofit=diff;
					bday=a[i];
					sday=a[j];	
					
				}
			}
		}
		System.out.println(maxprofit);
		System.out.println(bday);
		System.out.println(sday);
		

	}

}
