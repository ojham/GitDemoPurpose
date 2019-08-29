package stringsearch;

public class Name {

	public static void main(String[] args) {
		
		String s="$$$$$SUVOSUVOJIT$$$$$SUVO";
		int suvocount=0;
		int suvojitcount=0;
		
		
			
		
		for (int i=0;i<=s.length()-1;i++){
			
			if (s.contains("SUVO")){
				suvocount++;
				
			}
			 if (s.contains("SUVOJIT")){
				 suvojitcount++;
				
			}
			
		}
			
				System.out.println("SUVO"+ "="+suvocount);
				System.out.println("SUVOJIT"+ "="+suvojitcount);
			

	}

}
