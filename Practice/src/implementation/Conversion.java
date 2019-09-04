package implementation;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		String k1=scan.next();
		
		String s="AMbuj verma";
		String s1="";
		s=s.toLowerCase();
		System.out.println(s);
		
		
		 for (int j=0;j<=s.length()-1;j++)
         {
             
			  if (s.charAt(j)==' '){         	 
	            	 s1+='$';
	             }
			 
			  else 
             {
                 
                 int k=(int)(s.charAt(j));
                 k=k-96;
                 s1+=k;
                 
             }
           
         }	
		 System.out.println(s1);
		 
		 
}
}
