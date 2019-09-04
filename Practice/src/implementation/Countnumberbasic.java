package implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class Countnumberbasic {

	public static void main(String[] args) {
		
		int T=0;
		String s="";
		int N=0;
		int sum=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		T=scan.nextInt();
		if (T>0 && T<100){
			
			N=scan.nextInt();
			
			if (N>0 && N<10000){
				
				for (int i=0;i<=N-1;i++){
					
					char c=scan.next().charAt(0);
					s=s+c;
				}
				
				System.out.println(s);
				for (int j=0;j<=s.length()-1;j++){
					while(Character.isDigit(s.charAt(j)))
					{
						
					int num=Character.getNumericValue(s.charAt(j));
					sum=sum*10+num;
					if (j<s.length()-1){
						j++;
					}
					else{
						break;
					}	
					}
					
					if (sum>0){
						al.add(sum);
					}
					sum=0;
					
				}
				
				System.out.println(al.size());
				
			}
			
		}
		

}
}
