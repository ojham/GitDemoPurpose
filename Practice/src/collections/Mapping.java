package collections;

import java.util.HashMap;
import java.util.Iterator;import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapping {

	public static void main(String[] args) {
		
		String  a1="abcaccac";
		
		HashMap<Character,Integer> Hp = new HashMap<Character,Integer>();
		
		char[]a2 = a1.toCharArray();
		
		for(int i=0;i<=a2.length-1;i++){
			
			if(Hp.containsKey(a2[i])){
				
				Hp.put(a2[i], (Hp.get(a2[i]))+1);
			}
			else{
				Hp.put(a2[i], 1);
			}
			
		}		
		Set<Character> chars = Hp.keySet();
		
		for( Character c:chars){
			
			if(Hp.get(c)>1){
				
				System.out.println(c+"="+Hp.get(c));
			}
		}
		
		Set<Entry<Character, Integer>> entr = Hp.entrySet();
		Iterator<Entry<Character, Integer>> itr = entr.iterator();
		while(itr.hasNext()){
//		Entry x = (Map.Entry)itr.next();
//		int k=x.getValue();
			
		}
		}
		
		

	}


