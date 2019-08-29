package interpgms;

public class CharStringconcat {

	public static void main(String[] args) {
		
		
	
		String a="abdeXerhtrdtfytfrkyutkyutk";
		String b="abcd";	
		String s3="";
	
	int minvalue=Math.min(a.length(), b.length());
	int maxvalue=Math.max(a.length(), b.length());
	
	for(int j=0;j<=minvalue-1;j++){
		
		s3+=a.charAt(j)+""+b.charAt(j);
	}
	
	for(int k=minvalue;k<=maxvalue-1;k++)
	{	
		if(a.length()>b.length())
		{
			s3+=a.charAt(k);
		}else{
			s3+=b.charAt(k);
		}
		
	}

	System.out.println(s3);
	}

}
