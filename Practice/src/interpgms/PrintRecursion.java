package interpgms;

public class PrintRecursion {

	static void  print(int n){
		
		if (n != -1) {
			
			print(n - 1);
			System.out.print(n);
			
		}
		
		

	}
	
	public static void main(String[] args) {
		
		
		print(8);
		
		
	}

}
