package stringsearch;

public class StringSearch {

	public static void main(String[] args) {
		
		String s="sda";
		String s1="sadasda";
		
		int count=0;
		boolean flag=true;
		
		for (int i=0;i<=s1.length()-1;i++)
		{
			flag=true;
			
			for (int j=i;j<=i+s.length()-1;j++)
			{
				
				if (s.charAt(j-i)!=s1.charAt(j))
				{
					flag=false;
				}
			
			}
			if(flag==true){
				count=count+1;
			}
		}
		
		System.out.println(count);
	}

}
