package basicinputoutput;

import java.util.Scanner;

public class PrimeMinisterNumber {
	
	public static boolean primenumber(){
		boolean flag=false;
		
		return flag;
	}

	public static void main(String[] args) {
		int a=0;
		int b=0;
		int num=0;
		boolean flag1=false;
		boolean flag2=false;
	
	Scanner	scan=new Scanner(System.in);
	a=scan.nextInt();
	System.out.print(' ');
	b=scan.nextInt();
	
	if ((a>=1 && a<=1000000) && (b>=1 && b<=1000000))
	{
		while(a<=b)
		{
			for (int i=2;i<=a/2;i++){
				if (a%i==0){
					flag1=true;
					break;
				}
			}
			if (flag1==false)
			{
				num=(a/10)+(a%10);
				for(int j=2;j<=num/2;j++)
				{
					if (num%j==0){
						flag2=true;
						break;
					}
				}
					if (flag2==false){
						System.out.print(a);
					}
			}
			a++;
			flag1=false;
			flag2=false;
				}
			}
			

}
	
	
	
}
