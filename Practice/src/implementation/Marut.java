package implementation;

import java.util.Scanner;

public class Marut {

	public static void main(String[] args) {
		
		 String S="abcdeF";
	        int T=0;
	        int count=0;
	        int uppercount=0;
	        int lowercount=0;
	        Scanner scan =new Scanner(System.in);
	        T=scan.nextInt();
	        int k=0;
	        if (T>=1 && T<=100)
	        {
	            while(k<T)
	            {
	            S=scan.next();
	            if (S.length()>=1 && S.length()<=100)
	            {
	                char c[]=S.toCharArray();
	                for (int i=0;i<=c.length-1;i++)
	                {
	                    if (!Character.isLetter(c[i])){
	                        count++;
	                    }
	                }
	                
	                if(count==c.length)
	                {
	                        System.out.println("Invalid Input");
	                 }
	                else
	                {
	                    for (int j=0;j<=c.length-1;j++)
	                    {
	                        if(Character.isUpperCase(c[j]))
	                        {
	                            uppercount++;
	                        }
	                        else if(Character.isLowerCase(c[j]))
	                        {
	                            lowercount++;
	                         }
	                    }  
	                        if(uppercount<lowercount)
	                        {
	                            System.out.println(uppercount);
	                        }
	                        else if(uppercount>lowercount)
	                        {
	                            System.out.println(lowercount);
	                        }
	                        else
	                        {
	                             System.out.println(lowercount);
	                        }
	                 }
	                
	            }
	            else
	            {
	                System.out.println("Invalid Input");
	            }
	        count=0;
	        lowercount=0;
	        uppercount=0;
	        k++;    
	          } 
	      }
	    else
	      {
	            
	        System.out.print("Invalid Test");
	      }

	}

}
