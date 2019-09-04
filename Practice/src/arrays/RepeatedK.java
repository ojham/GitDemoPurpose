package arrays;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedK {

	public static void main(String[] args) {
		
		int a[]={2, 2, 1, 3,1};
		int k=2;
		int smallestnumber=a[0];
		
		 HashMap<Integer, Integer> Hs=new HashMap<Integer, Integer>();
		 
		 for (int i=0;i<=a.length-1;i++){
			 
			 if (Hs.containsKey(a[i])){
				 Hs.put(a[i], Hs.get(a[i])+1);
				 
			 }else{
				 Hs.put(a[i], 1);
			 }
			 
		 }
		 
		// Set<Entry<Integer, Integer>> entry = Hs.entrySet();
		for (Entry<Integer, Integer> entry:Hs.entrySet()) {
			
			if (k==entry.getValue()){
				
				int num=entry.getKey();			
				if(num<smallestnumber){
					smallestnumber=num;
				}		
				
			}
			
		}
		
		System.out.println(smallestnumber);
		
}
}
