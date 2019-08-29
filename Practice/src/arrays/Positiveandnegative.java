package arrays;

public class Positiveandnegative {

	public static void main(String[] args) {
		
		
		int a[]={-1,3,8,-4,5,-6,7,-20,30,40};
		int i=0;
		int j=a.length-1;
		while(i<j){
			
			while(a[i]<0){
				i++;
			}
			while(a[j]>0){
				j--;
			}
			
			if(i<j){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		
		for(int k:a){
			System.out.println(k);
		}
	}

}
