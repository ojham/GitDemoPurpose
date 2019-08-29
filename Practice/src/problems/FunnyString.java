package problems;

public class FunnyString {

	public static void main(String[] args) {
			
		String s="bcxz";
		int []arr=new int [s.length()-1];
		int x=0;
		int y=arr.length-1;
		
		boolean flag=false;
		
		for(int i=0;i<s.length()-1;i++){
			
			int diff=Math.abs(s.charAt(i+1)-s.charAt(i));
			arr[i]=diff;
			
			System.out.println(diff);
		}
		
		while(x!=y){
			
			if(arr[x]==arr[y]){
				
				flag=true;
				x++;
				y--;
			} else{
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("Funny");
		}
		else{
			System.out.println("Not Funny");
		}
	}

}
