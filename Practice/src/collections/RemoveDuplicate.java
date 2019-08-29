package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<Integer>	al=new ArrayList<Integer>(Arrays 
            .asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

	
	ArrayList<Integer> al2 = new ArrayList<Integer>();
	for(Integer s:al){
		
		if(!al2.contains(s)){
			al2.add(s);
		}
	}
	
	System.out.println(al2);
	
}
}
