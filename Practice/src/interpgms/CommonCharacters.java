package interpgms;

public class CommonCharacters {

	public static void main(String[] args) {
		
		String s1="geeksforgeeks";
		String s2="platformforgeeks";
		
		int count=1;
		int pair=0;

		for(int i=0;i<=s1.length()-1;i++){
			
			for(int j=0;j<=s2.length()-1;j++){
				
				if(s1.charAt(i)==s2.charAt(j)){
					count++;
					s2=s2.replace(s2.charAt(j), '$');
				}
			}
			
			if(count>1){
				pair++;
			}
			count=1;
		}
		System.out.println(pair);
		
}
}
