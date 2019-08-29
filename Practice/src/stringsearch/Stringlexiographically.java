package stringsearch;

public class Stringlexiographically {

	public static void main(String[] args) {
	
		
		String A="11111";
		String B="00010";
		
		int A1[]={1,2,3,4,5};
		
		String temp="";

		  temp=B;
          StringBuilder  sb=new StringBuilder(B);
          
          for (int j=0; j<=A1.length-1; j++)
          {    
              
           sb.setCharAt(j, '1');
		 
		      String temp1=sb.toString();
		      int k=temp1.compareTo(A);
	      	  if(k==0)
	      	  {
			
		      System.out.println("YES");
	         }
	         else if (k<0)
	         {
		     System.out.println("NO");
	         }
	 }
	
			

		
		
		
		
}
}
