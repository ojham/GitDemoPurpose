package basicinputoutput;

import java.util.Scanner;

public class AmanAndMrSharma {

	public static void main(String[] args) {
		
		int d=0;
		double perimeter=0;
		
		int toffee=0;
		Scanner	scan=new Scanner(System.in);
		d=scan.nextInt();
		
		if (d>=1 && d<Math.pow(10,5))
		{
			double[] r=new double[(int)d];
			double[] x=new double[(int)d];
			
			for (int i=0;i<=d-1;i++)
			{

				r[i]=scan.nextDouble();
				System.out.print(' ');
				x[i]=scan.nextDouble();
			}
			
			for (int j=0;j<=r.length-1;j++){
				
				if(r[j]>=1 && r[j]<Math.pow(10, 6)){
					
				if (x[j]>=1 && x[j]<Math.pow(10, 4)){
						
						
				perimeter=(2*22*r[j])/7;
						
				if (perimeter<=100*x[j]){
							
					toffee++;
					
						}
					}
				}
			}
			System.out.println(toffee);
			
		}
		
		
			
	

}
}
