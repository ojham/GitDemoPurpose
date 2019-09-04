package implementation;

import java.util.HashMap;
import java.util.Scanner;

public class Printhackerearth {

	public static void main(String[] args) {
		String s="";
		int N=0;
		int Hcount=0;
		int Acount=0;
		int Ccount=0;
		int Kcount=0;
		int Ecount=0;
		int Rcount=0;
		int Tcount=0;
		
		Scanner scan=new Scanner(System.in);
		HashMap<Character, Integer> Hs = new HashMap<Character, Integer>();
		Hs.put('h', 2);
		Hs.put('a', 2);
		Hs.put('c', 1);
		Hs.put('k', 1);
		Hs.put('e', 2);
		Hs.put('r', 2);
		Hs.put('t', 1);
		
		 N=scan.nextInt();
		 
		 if (N>=1 && N<=Math.pow(10, 6)){
		
			for(int i=0;i<=N-1;i++){
				
				char c=scan.next().charAt(0);
				s=s+c;
				
			}
			
			if (s.length()>=11){
				
				char[]a=s.toCharArray();
				
				for (int j=0;j<=a.length-1;j++){
					
					if (a[j]=='h')
					{
						Hcount++;
					}
					else if (a[j]=='a'){
						Acount++;
					}
					else if (a[j]=='c'){
						Ccount++;
					}
					else if (a[j]=='k'){
						Kcount++;
					}
					else if (a[j]=='e'){
						Ecount++;
					}
					else if (a[j]=='r'){
						Rcount++;
					}
					else if (a[j]=='t'){
						Tcount++;
					}
			}
			
				
		 }
	}
			
			
} 
}
