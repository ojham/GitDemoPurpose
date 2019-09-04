package problems;

import calculator.Calculator;

public class SumArray {

	public static void main(String[] args) {
		
		
	Calculator calci = new Calculator();
	
	int sum=calci.sum(3, 4);
	if(sum==7){
		System.out.println("It works");
	}
		
	int multi=calci.multiply(3, 3);
	
	if(multi==9){
		System.out.println(multi);
	}

		

	}

}
