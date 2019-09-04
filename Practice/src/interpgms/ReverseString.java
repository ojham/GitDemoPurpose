package interpgms;

public class ReverseString {

	public static void main(String[] args) {
		
		String input="Selenium Webdriver is Open source tool";
		String output="";
		
		String[] ip = input.split(" ");
		
		for(int i=ip.length-1;i>=0;i--){
			output=output+ip[i]+" ";
			
		}
		
		System.out.println(output);
	}

}
