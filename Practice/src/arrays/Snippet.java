package arrays;

import java.util.ArrayList;

public class Snippet {
	public static void main(String[] args) {
		int num=4215;
		int sum=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		while(num!=0){
			int r=num%10;
			sum=sum*10+r;
			num=num/10;
			al.add(r);
		}
				
		System.out.println(sum);
		System.out.println(al);
		
	}

	






}

