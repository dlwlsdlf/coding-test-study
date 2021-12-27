
public class Insertion_sort {
	public static void main(String[] args) {
		
		int arr[] = {7,5,9,0,3,1,6,2,4,8};
		
		for (int i = 1; i < arr.length; i++) {
			//인덱스 i 부터 1까지 감소하며 반복하는 for
			for (int j = i; j > 0; j--) {
				if (arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				else break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
