package arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class BestPlayer {

	public static void main(String[] args) {
	
	
	HashMap<String,Integer>	Hs=new HashMap<String, Integer>();
	
	Hs.put("surbhi", 3);
	Hs.put("surpanakha", 3);
	Hs.put("shreya", 5);
	
	int A[]=new int[Hs.size()];
	
	int count=0;
	Set<Entry<String, Integer>> en = Hs.entrySet();
	
	//System.out.println(en);
	Iterator<Entry<String, Integer>> itr = en.iterator();
		
	for(int i=0;i<=A.length-1;i++){
		
		A[i]=itr.next().getValue();
		
	}
	
	for(int i=0;i<=A.length-1;i++ )
	{		
		for(int j=0;j<A.length-1;j++)
		{		
			if(A[j]<A[j+1])
			{	
				int temp=A[j];
				A[j]=A[j+1];			
				A[j+1]=temp;
			}			
		}			
	}


	    
	    
          
    
    
    
	
	
	
}
}
