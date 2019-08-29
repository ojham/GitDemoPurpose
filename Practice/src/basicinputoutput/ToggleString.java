package basicinputoutput;

import java.util.Scanner;

public class ToggleString {

	public static void main(String[] args) {
		
	Scanner	scan=new Scanner(System.in);
	
	String S=scan.nextLine();
	
	String S1= "";
	if (S.length()>=1 && S.length()<=100){
		
	char[] s1 = S.toCharArray();
	
	for (int i=0;i<=s1.length-1;i++){
		
		if (Character.isUpperCase(s1[i])){
		S1+=Character.toLowerCase(s1[i]);
		}
		else{
			S1+=Character.toUpperCase(s1[i]);
		}
	}
	}

	System.out.println(S1);
	}

}
