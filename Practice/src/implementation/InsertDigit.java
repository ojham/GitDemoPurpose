package implementation;

public class InsertDigit {

	public static void main(String[] args) {
		
		int X=4483;
		int k=2;
		int count=0;
		 String P=Integer.toString(X);
         char[]a=P.toCharArray();
         
         for (int i=0;i<=a.length-1;i++)
         {
             
             if(a[i]<'9')
             {
                 if (count<k)
                 {
                     a[i]='9';
                     count++;
                 }
             }
         }
         P=String.valueOf(a);
       //  int result=Integer.parseInt(P);
         System.out.print(P);

	}

}
