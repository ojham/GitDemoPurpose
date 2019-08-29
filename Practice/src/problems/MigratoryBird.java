package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MigratoryBird {

	public static void main(String[] args) {
		
		int max_value=0;
		HashMap<Integer, Integer> hs = new HashMap<Integer,Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
	
		int arr[]={1,2 ,3 ,4, 5 ,4, 3,2 ,1, 3 ,4};
		
		for(int i=0;i<=arr.length-1;i++){
			
			if(hs.containsKey(arr[i])){
				
				hs.put(arr[i], hs.get(arr[i])+1);
				
			}else{
				hs.put(arr[i], 1);
			}
			
		}
		
		
		for(int j=0;j<=arr.length-1;j++){
			
			if(hs.get(arr[j])>max_value){
				max_value=hs.get(arr[j]);
			}
		}
		
		Set<Map.Entry<Integer, Integer>> entr = hs.entrySet();
		
		for(Entry<Integer, Integer> bird:entr){
		
			if(max_value==bird.getValue()){
				al.add(bird.getKey());
				
			}		
		}
		
		
		Collections.sort(al);		
		System.out.println(al.get(0));

}
}