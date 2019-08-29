package collections;

import java.util.ArrayList;

public class ListArray {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<Object>();
		ArrayList<Object>al1 = new ArrayList<Object>();
		
		
		al.add(1);
		al.add('r');
		al.add("jkje");
		al.add(1);
		al.add(true);
		al.add(null);
		al.add("jkje");
		
		for(int i=0;i<=al.size()-1;i++){
			
			System.out.println(al.get(i));
		}
		
		System.out.println("*********");
		System.out.println(al);
		
		System.out.println("**********");
		al.remove(5);
		
		System.out.println(al);
		
		System.out.println("**********");
		al.add("null");
		System.out.println(al);
		
		System.out.println("**********");
		al.add(3, "manish");
		System.out.println(al);
		
		
		al1.add("kumar");
		al1.add("ojha");
		al1.add("set");
		al1.add(false);
		al1.add(14.5);
		
		al.addAll(al.size()-2, al1);
		
		System.out.println(al1);
		System.out.println(al);
		
		
		int position=al.indexOf("manish");
		System.out.println(position);
		
		
		Object fetch = al.get(5);
		System.out.println(fetch);
		
	}

}
