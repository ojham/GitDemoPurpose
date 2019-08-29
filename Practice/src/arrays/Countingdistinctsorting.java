package arrays;

import java.util.Arrays;

public class Countingdistinctsorting {

	public static void main(String[] args) {
		
		int arr[]={1,3,1,4,3,3,4,6,5,8,6};
		
		int count=0;
		Arrays.sort(arr);
		
		int i=0;
		int j=1;
		while(i<=arr.length-1 && j<=arr.length-1 ){
			
			if(arr[i]!=arr[j]){
				count++;
			}
			i=j;
			j++;
		}
		System.out.println(count);
		}


	}


