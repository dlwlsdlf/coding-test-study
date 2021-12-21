import java.util.Scanner;
/*
 정수  n 이 입력되면 00시 00분 00초 부터 N시 59분 59초 까지의 모든 시각 중에서 3이 하나라도 
 포함되는 모든 경우의 수를 구하는 프로그램을 작성하시오. 예를 들어 1을 입력했을때 다음은 3이 하나라도 
 포함되어 있으므로 세어야 하는 시각이다.
 - 00시 00분 03초
 - 00시 13분 30초
 반면에 다음은 3이 하나도 포함되어 있지 않으므로 세면 안 되는 시각이다.
 - 00시 02분 55초
 - 01시 27분 45초 
 */

//3이 나오는 모든 경우의 수 카운트 
//시간은 23시 59시 59 까지이므로 
// h % 10 이3 일때 m % 10,m / 10 이 3일때,s % 10,s / 10 이 3일때 카운트 하는 함수 만들기 
public class Time {
	
	//특정한 시각 안에 '3' 이 포함 되어 있는 지의 여부
	public static boolean check(int h,int m,int s) {
		if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 ||s % 10 == 3) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int h = in.nextInt();
		
		int cnt = 0;
		for (int i = 0; i <= h; i++) {
			for (int j = 0; j < 60; j++) {
				for (int j2 = 0; j2 < 60; j2++) {
					//매 시각 안에 3이 포함되어있다면 카운트 증가
					if (check(i, j, j2)) {
						cnt++;
						System.out.println(cnt);
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
