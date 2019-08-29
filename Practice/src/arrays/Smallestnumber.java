package arrays;

public class Smallestnumber {

	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,6};
		int smallestnumber=a[0];
		int largestnumber=a[0];
		int num=0;
		for (int i=0;i<=a.length-1;i++){
			
			if (smallestnumber>a[i]){
				smallestnumber=a[i];
			}
			else if (largestnumber<a[i]){
				largestnumber=a[i];
			}
		}
		
		System.out.println(smallestnumber);
		System.out.println(largestnumber);
		
		
        
	
	}

}
