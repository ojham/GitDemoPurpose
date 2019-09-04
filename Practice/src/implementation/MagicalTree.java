package implementation;

import java.util.Scanner;

public class MagicalTree {

	public static void main(String[] args) {

		
		 
        int L=0;
        int value=0;
        Scanner scan=new Scanner(System.in);
        L=scan.nextInt();
        
        for (int j=0;j<=L-1;j++)
        {
            int sum=0;
            int diff=0;
            String s1=scan.next();
           char[]a1=s1.toCharArray();
            sum=Integer.parseInt(String.valueOf(a1[0]));
            
           for (int i=1;i<=a1.length-1;i++)
           {
			
			if(a1[i]=='+')
			{	
				sum= sum+Integer.parseInt(String.valueOf(a1[i+1]));
			
			}
			else if (a1[i]=='-')
			{
				diff= diff+Integer.parseInt(String.valueOf(a1[i+1]));
			}
           }	
			int temp=sum-diff;
			if (temp>value){
			    value=temp;	
			}
			
        }
           System.out.print(value);
           
        
		
	}

}
