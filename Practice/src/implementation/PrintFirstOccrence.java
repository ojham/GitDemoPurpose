package implementation;

public class PrintFirstOccrence {

	public static void main(String[] args) {
		
		
		String s="aasdvasvavda";
		String s1="";
		
		for (int i=0;i<=s.length()-1;i++){
			
		
			if(s1.indexOf(s.charAt(i))==-1)
			{
				s1+=s.charAt(i);
				
				
			}
		}
		
		System.out.println(s1);
	}

}
