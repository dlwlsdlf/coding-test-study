import java.util.Arrays;
import java.util.Scanner;

public class Coding_test3_1_1 {
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
		
	int n = in.nextInt();	
	int m = in.nextInt();	
	int k = in.nextInt();	
		
	int arr[] = new int[n];
	
	for (int i = 0; i < n; i++) {
		arr[i] = in.nextInt();
	}
	
	Arrays.sort(arr);
	
//	for (int i = 0; i < arr.length; i++) {
//		System.out.println(arr[i]); //테스트
//	}
	
	int first = arr[n-1]; //가장큰수
	int second = arr[n-2]; //두번째로 큰수
	
	/*사용하고자 하는 방법
	 (가장큰수가 등장하는 횟수 * 가장큰수) + (가장작은수가 등장하는 횟수 * 가장작은수)
	m=8, k=3일때
	최대합 
	6+6+6+5 + 6+6+6+5 이니까 
	한묶음(반복되는 수열의길이) = k+1
	 이러한 수열이 반복되는 횟수 는 (m / k+1)
	 여기에 k를 곱하면 가장큰수가 등장하는 횟수
	*/
	/*
	 내가 짠거
	int countF = (((m/(k+1))*k)+(m%(k+1)))*first;
	int countS = m/(k+1)*second;
	*/
	//책에내용
	
	int cnt = (m/(k+1))*k; //가장 큰 수 더해지는 횟수
	cnt += m%(k+1);
	
	int result = 0;
	result += cnt * first;
	result += (m- cnt) *second;
	
	
	System.out.println(result);
	
	
	//M의 수가 커지면커질수록  for문 때문에 시간복잡도가 높아져
	//간단한 수학적 아이디어로 효율적으로 해결
	}
}
