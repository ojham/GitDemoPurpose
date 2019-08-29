package problems;

public class Shortestpath {

	public static void main(String[] args) {
		
		
		int c[]={0, 0, 0, 1 ,0, 0};
		
		int c1[]=new int [c.length];
		
		
		int i=0;
		int count =0;
		int shortcut=0;
		
		while(i<c.length-2){
			
			if(c[i]==0 && c[i+2]==0 && i<c.length-2)
	         {
	             int j=i+1;
	             while(j<=i+2){
	                 if(c[j]==0){
	                     shortcut++;
	                     j++;
	                 }
	                 else{
	                     break;
	                 }
	             }

	         }
			i=i+2;
	    }
		
		
		for(int k=0;k<=c.length-1;k++){
			if(c[k]==0){
				count++;
			}
		}
		
		count=count-(shortcut/2)-1;
		System.out.println(count);
	}

}
