import java.util.Scanner;
import java.util.*;
/*
 하나의 수열에는 다양한 수가 존재 한다. 이러한 수는 크기에 상관 없이 나열되어 있다.
 이 수 를 큰수 부터 작은 수의 순서대로 정렬 해야 한다. 수열을 내림 차순으로 정렬하는 프로그램 을 만드시오
 */
public class Sort_1 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		Arrays.sort(arr);
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
