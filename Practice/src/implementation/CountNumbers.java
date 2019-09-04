package implementation;

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		
		String N="sadw96aeafae4awdw2wd100awd";
		boolean flag=false;
//		int sum=0;
		int count=0;
		for (int i=0;i<=N.length()-1;i++)
		{
			
			while(Character.isDigit(N.charAt(i)))
			{
//			int num=N.charAt(i);
//				sum=sum*10 + num;
				flag=true;
				i++;
			}
			
			if (flag==true){
				count++;
			}
			flag=false;
		}

		
		System.out.println(count);
		
}
}
