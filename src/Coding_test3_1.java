import java.util.Arrays;
import java.util.Scanner;

public class Coding_test3_1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int N = in.nextInt(); //N 배열의 크기
		int M = in.nextInt(); //M 더하는 횟수
		int K = in.nextInt(); //K 같은 인덱스가 K번초과해선 안됨
		
		//N 크기만큼 배열생성
		int arr[] = new int[N];
		
		//N 개수만큼 입력받아서 배열에 넣기
		for (int i = 0; i < N; i++) {
		 arr[i]=in.nextInt();	
		}
		
		Arrays.sort(arr);// Array.sort(배열이름) > 배열 오름 차순으로
		
		int first = arr[N-1]; //배열에서 가장큰수
		int second = arr[N-2]; // 배열에서 두번째로 큰수
		int result = 0;
		
		int count = 0;
		
		
		while (true) {
			for (int i = 0; i < K; i++) {
				
				
				if (M==count) {
					break;
				}
				result += first;
				count +=1;
			}
			if (M==count) {
				break;
			}
			result+=second;
			count+=1;
		}
		
		System.out.println(result);
		
	}
}
