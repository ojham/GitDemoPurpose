package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class CommonelementList {

	public static void main(String[] args) {
		
	ArrayList<String>al = new ArrayList<String>();
	ArrayList<String>al1= new ArrayList<String>();
	
	HashSet<String> hs = new HashSet<String>();
	
	al.add("hii");
	al.add("Geeks");
	al.add("for");
	al.add("Geeks");
	
	
	al1.add("Hii");
	al1.add("Geeks");
	al1.add("Gaurav");
	
		
		for(int k=0;k<=al1.size()-1;k++){
			
			if(al1.contains(al.get(k))){
				
				hs.add(al1.get(k));
		}
	}
		System.out.println(hs);
	
	}

}
