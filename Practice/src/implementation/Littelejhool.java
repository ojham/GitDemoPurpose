package implementation;

public class Littelejhool {

	public static void main(String[] args) {
		
	
		String line="100000111110";
		int count=0;
		char c[]=line.toCharArray();
	    char temp=' ';
	    int i=0;
		
	       while(i<=c.length-1){
	    	   
	    	   temp=c[i];
	    	   
	    	 for (int j=0;j<=c.length-1;j++){
	    		   
	    	  if( c[j]==temp){
	    		   
	    		   i++;
	    		   count++;
	    	   }
	    	 }  
	    	   if (count==6){
	    		   
	    		   System.out.println("Sorry, sorry!");
	    		   break;
	    	   }
	    	   else{
	    		   count=0;
	    		   
	    	   }
	    	 
	       }
	        
	       if (count<6){
	    	   System.out.println( "Good luck!");
	       }
	}

}
