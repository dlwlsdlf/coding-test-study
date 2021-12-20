import java.util.Arrays;
import java.util.Scanner;

/*
 숫자 카드 게임은 여러개의 숫자 카드중에서 가장 높은 숫자가 쓰인 카드 한 장을 뽑는 게임이다.
 단, 게임의 룰을 지키며 카드를 뽑아야 하고 룰은 다음과 같다.
 1. 숫자가 쓰인 카드들이 N x M 형태로 놓여 있다. 이때 N은 행의 개수를 의미하며, M은 열의 개수를 의미
 
 2. 먼저 뽑고자 하는 카드가 포함되어 있는 행을 선택한다.
 
 3. 그 다음 선택된 행에 포함된 카드들 중 가장 숫자가 낮은 카드를 뽑아야한다.
 
 4. 따라서 처음에 카드를 골라낼 행을 선택할 때, 이후에 해당 행에서 가장 숫자가 낮은 카드를 뽑을 것을 고려하여 
 	최종적으로 가장 높은 숫자의 카드를 뽑을 수 있도록 전략을 세워야 한다.
 */

/*
내가 생각한 풀이 :
 입력대로 2차원 배열 만든다 
 그리고 행별로 가장 작은수 추출 arrays.sort 이용 
 추출한수 비교후 가장큰수 추출
  */



public class Number_Card_Game {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		int arr[][] = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		/*
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		*/
		int result[] = new int[N];
		for (int i = 0; i < N; i++) {
			Arrays.sort(arr[i]);
			result[i] =arr[i][0]; 
		}
		Arrays.sort(result);
		
		System.out.println(result[N-1]);
		
	}
}
