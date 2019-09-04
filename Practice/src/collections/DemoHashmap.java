package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoHashmap {

	public static void main(String[] args) {

		HashMap<String, Integer> hs = new HashMap<String, Integer>();

		HashMap<String, Integer> hs1 = new HashMap<String, Integer>();

		hs.put("acd", 100);
		hs.put("mch", 209);
		hs.put("dam", 400);
		hs.put(null, 501);
		hs.put("beta", 601);

		int value = hs.get(null);
		System.out.println(value);

		System.out.println("************************");

		hs1.put("cosec", 400);
		hs1.put("sec", 301);
		hs1.put("cos", 201);
		hs1.put("sin", 509);
		hs1.put("tan", 1001);

		hs.putAll(hs1);

		System.out.println(hs);

		System.out.println("*********************");

		Set<String> keys = hs.keySet();
		for (String key : keys) {
			System.out.print(key + " ");
		}

		System.out.println("*************************");

		Set entryset = hs.entrySet();
		Iterator itr = entryset.iterator();

		System.out.println(entryset);

		System.out.println("**************************");

		while (itr.hasNext()) {

			System.out.println(itr.next());

		}

		System.out.println("**************************");

		Set<Map.Entry<String, Integer>> set2 = hs.entrySet();

		Iterator<Entry<String, Integer>> itr2 = set2.iterator();

		while (itr2.hasNext()) {
			
			System.out.println(itr2.next().getKey()+" "+itr2.next().getValue());
		}
		
		System.out.println("**************************");
		
		
		Set<Map.Entry<String, Integer>> set3 = hs.entrySet();
		for(Entry<String, Integer> s3:set3){
			System.out.println(s3.getKey()+"  "+s3.getValue());
		}
		
		
		System.out.println("*****************************");
		
		
		int removed=hs.remove("dam");
		System.out.println(removed);
		
		System.out.println("*****************************");
		
		System.out.println(hs);
		
		
		
		
		
	}

}
