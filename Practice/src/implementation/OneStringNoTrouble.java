package implementation;

public class OneStringNoTrouble {

	public static void main(String[] args) {
		
		String S="abcabcdaabaaccba";
		String S1="";
		int count=0;
		String temp="";
		for (int i=0;i<=S.length()-1;i++)
		{
			
			for (int j=0;j<=S.length()-1;j++)
			{
				
				if (S.charAt(j)!=S.charAt(j+1)){
					count++;
				}else{
					break;
				}
			}
				for (int k=count-1;k>=i;k--)
				{
				 temp= temp+S.charAt(k);
					
				}
				if (temp.length()>S1.length()){
					S1=temp;
				}
				i=count+2;
			
		}
		
		System.out.println(temp);

	}

}
