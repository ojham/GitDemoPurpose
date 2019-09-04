package arrayrearrangments;

public class Rearrangeequalposition {

	public static void main(String[] args) {

		int arr[] = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
	              11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
		
		boolean flag = false;

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr.length - 1; j++) {

				if (i == arr[j]) {
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}

			}

		
		}

		for (int k : arr) {
			System.out.print(k + " ");
		}

	}
}
