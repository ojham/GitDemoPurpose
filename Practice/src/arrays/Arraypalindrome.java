package arrays;

public class Arraypalindrome {

	public static void main(String[] args) {
		
		int []arr={2, 21, 2};
		
		int i=0;
		int j=arr.length-1;
		boolean flag=false;
		
		while(i!=j){
			
			if(arr[i]==arr[j]){
				
				flag=true;
				i++;
				j--;
			} else{
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("Its palindrome");
		}
		else{
			System.out.println("Its not  palindrome");
		}
	}

}
