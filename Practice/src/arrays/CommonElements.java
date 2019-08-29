package arrays;

public class CommonElements {

	public static void main(String[] args) {
		
		String a[]={"hii","geeks","for","geeks"};
		String b[]={"hii","geeks","gaurav"};
		int count=0;
		
		for(int i=0;i<=a.length-1;i++){
			for(int j=0;j<=b.length-1;j++){
				
				if(a[i]==b[j]){
					count++;
				}
			}
			if(count>0){
				System.out.println(a[i]);
			}
			count=0;
		}
		

	}

}
