package interpgms;

public class ExtractNumbers {

	public static void main(String[] args) {
		
		String demo="1abnbs234tte";
		int sum=0;
		
		for(int i=0;i<=demo.length()-1;i++){
			
			if(Character.isDigit(demo.charAt(i))){
				sum+=Character.getNumericValue(demo.charAt(i));
			}
		}
		System.out.println(sum);
	}

}
