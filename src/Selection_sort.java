
public class Selection_sort {
	public static void main(String[] args) {
		
		int arr[] = {7,5,9,0,3,1,6,2,4,8};
		
		
		for (int i = 0; i < arr.length; i++) {
			int min_index = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[min_index]>arr[j]) {
					min_index = j; // for문을 돌면서 가장장은 원소가 있는 배열의 인덱스찾기
				}
			}
			//가장 작은 원소를 가진 인덱스값을 첫번째로 옮기기
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
