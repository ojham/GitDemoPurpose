package implementation;

public class CityTravel {

	public static void main(String[] args) {
		 int S=21;
	     int X=5;
	     int N=2;
	     int days=1;
	     int T[]={2,4};
	     int Y[]={4,8};
	     boolean flag=false;
	     
	     while(S>0)
         {
             
             for(int j=0;j<=N-1;j++){
                 
                 if (T[j]>=1 && T[j]<=(Math.pow(10,9))){
                     
                     if (Y[j]>=1 && Y[j]<=(Math.pow(10,9))){
                         
                         if (days==T[j]){
                             S=S-Y[j];
                             flag=true;
             
                             break;
                         }
                     }
                 }
             }
             
             if (flag==true && S>0 ){
            	flag=false;
            	days++;
            	
             }else if (flag==false && S>0){
            	 S=S-X;
                 days++;
             }
            
         }
         
         System.out.print(days);
 
}   
}
