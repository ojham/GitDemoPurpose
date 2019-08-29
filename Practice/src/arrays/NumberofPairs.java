package arrays;

import java.util.Arrays;

public class NumberofPairs {

	public static void main(String[] args) {
		
		int countnopairs=0;
		int count=1;
		int arr[]={1,2,1,2,1,3,2};
		int[] temp= new int [arr.length-1];
//		Arrays.sort(arr);
//		
//		for(int i=0;i<arr.length-1;i++){
//
//            while(arr[i]==arr[i+1] && i<arr.length){
//                count++;
//                i++;
//            }
//            countnopairs+=count/2;
//            count=1;
//        }
//		
//		
//		System.out.println(countnopairs);
		
		
		for(int i=0;i<=arr.length-1;i++){
			
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j] && temp[i]!=j){
					count++;
					temp[i]=arr[j];
				}
			}
			countnopairs+=count/2;
			count=1;
		}
		System.out.println(countnopairs);
	}

}
