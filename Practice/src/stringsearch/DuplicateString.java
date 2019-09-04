package stringsearch;

public class DuplicateString {

	 static public  void main(String[] args) {
	
		String  a1="abcaccac";
		
		String k="";
		int count=0;
		
		for(int i=0;i<=a1.length()-1;i++){
			
			for(int j=i+1;j<=a1.length()-1;j++)
			{
				if(a1.charAt(i)==a1.charAt(j))
				{
					count++;
				}		
				
			}
			if(count>1){
				
				if(k.indexOf(a1.charAt(i))==-1){
					k+=a1.charAt(i);
				}
			}
			count=0;
		}
		
		System.out.println(k);

	}

}
