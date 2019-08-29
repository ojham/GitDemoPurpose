package problems;

import java.util.ArrayList;

public class BonAppetite {

	public static void main(String[] args) {
		
		
		int temp=0;
		int sum=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(3);
		al.add(10);
		al.add(2);
		al.add(9);
		
		temp=al.get(1);
		
		   for(int i=0;i<=al.size()-1;i++){
	            if(al.get(i)!=temp){
	                sum=sum+al.get(i);
	            }
	        }

	        if((sum/2)==12){
	            System.out.println("Bon Appetit");
	        }
	    
		
		
	}

}
