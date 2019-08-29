package collections;

import java.util.LinkedList;

public class Listlinked {

	public static void main(String[] args) {
		
	LinkedList<String>	list=new LinkedList<String>();
	
		
		list.add("smt");
		list.add("manish");
		list.add(1, "ojha");
		list.add("A");
		list.add("7");
		list.add("true");		
		list.add(6, "demotest");
		
		System.out.println(list);
		System.out.println("***********");
		
		for(String a:list){
			System.out.print(a+' ');
		}
		
		System.out.println("*********");
		
		String fetch=list.get(3);
		System.out.println(fetch);
		
		int position=list.indexOf("true");
		System.out.println(position);
		
		System.out.println("***************");
		
		
		list.remove(list.get(4));		
		System.out.println(list);
		
		System.out.println("****************");
		
		String head = list.element();
		System.out.println(head);
		
		
		

	}

}
