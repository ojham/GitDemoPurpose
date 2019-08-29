package implementation;

public class Substringsort {

	public static void main(String[] args) {
		
		String s="ooneefspd";
		char[] a=s.toCharArray();
		
		for (int i=0;i<=8;i++){
			
			for (int j=i+1;j<=8;j++){
				
				if (a[i]<a[j]){
				char temp=a[j];
				a[j]=a[i];
				a[i]=temp;
					
				}
			}
			
			
		}
		
		String str1=new String(a);
		System.out.println(str1);
		
		

	}

}
