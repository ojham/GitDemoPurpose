package basicpgming;

public class Samllestdigit {

	public static void main(String[] args) {
		
		int num=412136;
		int smallestdigit=num%10;
		
		while(num!=0){
			int r=num%10;
			if (r<smallestdigit){
				smallestdigit=r;
				
			}
			num=num/10;
		}
		System.out.println(smallestdigit);
	}

}
