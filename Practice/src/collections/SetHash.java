package collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetHash {

	public static void main(String[] args) {
		
			
			int []a={5,3,2,4,45,4,4,5,2,32,1,2,3};
			
			HashSet<String>hs=new HashSet<String>();
		    HashSet<Integer>Hs1=new HashSet<Integer>();
			
			hs.add("x");
			hs.add("Y");
			hs.add("z");
			hs.add("x");
			hs.add("k");
			hs.add("1");
			
			Iterator<String> itr = hs.iterator();
			
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
			System.out.println("**********");
			System.out.println(hs);
			
			for(int i=0;i<=a.length-1;i++){
				
				if(!Hs1.add(a[i])){
					Hs1.add(a[i]);
				}
			}
			
			System.out.println(Hs1);
	}

}
