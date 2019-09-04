package arrays;

import java.util.HashMap;
import java.util.Set;

public class GenerateSamesum {

	public static void main(String[] args) {
		
		int arr[]={1, 8, 3, 11, 4, 9, 2, 7};
		HashMap<Integer, Integer>hs1=new HashMap<Integer ,Integer>();
		int max=0;
		
		for(int i=0;i<=arr.length-1;i++){
			
			for(int j=i+1;j<=arr.length-1;j++){
				
				int sum=arr[i]+arr[j];			
				if(hs1.containsKey(sum)){
					
					hs1.put(sum, hs1.get(sum)+1);
				}
				else{
						hs1.put(sum, 1);
				}
			}
		}
				Set<Integer> set = hs1.keySet();
				for(Integer k:set){
					
					if(hs1.get(k)>max){
						max=hs1.get(k);
					}
					
				}
				System.out.println(max);
		

}
}
