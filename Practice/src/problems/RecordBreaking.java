package problems;

public class RecordBreaking {

	public static void main(String[] args) {
		
int []a={3, 4 ,21,36 ,10 ,28 ,35 ,5, 24, 42};
		
		// int[] result=new int[2];
	     int bestcount=0;
	     int worstcount=0;
	     int maxscore=0;
	     int worstscore=0;
	    
	     maxscore=a[0];
	     worstscore=a[0];
	    
	     
	     for(int j=1;j<=a.length-1;j++){
	    	 
	    	 if(maxscore<a[j]){
	                maxscore=a[j];
	                bestcount++;
	            }
	            else if(worstscore>a[j]){
	            	worstscore=j;
	                worstcount++;
	            }
	    }
	     
	    System.out.println(bestcount);
	    System.out.println(worstcount);
		

	}

}
