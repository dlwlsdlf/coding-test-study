import java.util.*;

public class Sort_3 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); //베열 원소수
		int k = in.nextInt(); // 바꾸는 횟수
		
//		int A[] = new int[n];
//		int B[] = new int[n];
		
		Integer A[] = new Integer[n];
		for (int i = 0; i < n; i++) {
			A[i] = in.nextInt();
		}
		Integer B[] = new Integer[n];
		for (int i = 0; i < n; i++) {
			B[i] = in.nextInt();
		}
		
		Arrays.sort(A);
		Arrays.sort(B,Collections.reverseOrder());
		for (int i = 0; i < k; i++) {
			if (A[i]<B[i]) {
				int temp =A[i];
				A[i] = B[i];
				B[i] = temp;
			}
			//A의 원소가 B의 원소보다 크거나 같을때 반복문 탈출
			else break;
		}
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			result += A[i];
		}
		
		System.out.println(result);
		
	}
}
//Integer 자료형 알아보기 
//자바 배열 내림차순 Arrays.sort(배열,Collections.reverseOrder())
// integer 자료형만됨.. 
