import java.util.Scanner;

/*
어떠한 수 N 이 1이 될 때까지 다음의 두 과정중 하나를 반복적으로 선택하여 수행하려고 한다. 단,
두 번째 연산은 N이 K로 나누어 떨어질 때만 선택할 수 있다.

1.N에서 1을 뺀다
2.N을 K로 나눈다.

N과 K가 주어질때 N이 1이 될때까지 1번 혹은 2번의 과정을 수행해야 하는 최소 횟수를 구하는 
프로그램을 작성하시오
 */

/*
 내가 생각한 풀이:
 최소 횟수니까 2번째 조건을 먼저 수행하도록 if 문으로 조건을검
 (먼저 나누어 떨어지는지 확인하고 나누어 떨어진다면 N에 N/K의 값으로 바꾸어주고, 카운트 하나증가)
2번째 조건이 아니라면 1번 과정을 수행하고 카운트 하나 증가
1이될때 까지 수행하여야 하므로 N이 1이되면 종료하는 while문으로 만듬 
 */
public class Util_It_Become1 {
	public static void main(String[] args) {

		Scanner in  = new Scanner(System.in);
		
		int N = in.nextInt();
		int K = in.nextInt();
		int cnt = 0;
		
		while (N!=1) {
			if (N%K == 0) {
				N /= K;
				cnt++;
			}
			else {
				N -= 1;
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
