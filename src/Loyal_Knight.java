import java.util.Scanner;
/*
 문제 
 체스판과 같이 8x8 좌표평면이 있다.
 나이트는 이동할때 l자 형태로만 이동할 수 있으며 좌표평면 밖으로는 나갈수 없다.
 나이트는 특정한 위치에서 다음과 같은 2가지 경우로 이동할수 있다.
 
  1. 수평으로 두 칸 이동한 뒤에 수직으로 한 칸 이동하기
  2. 수직으로 두 칸 이동한 뒤에 수평으로 한 칸 이동하기 

  8x8 좌표 평면상에서 나이트의 위치가 주어졌을 때 나이트가 이동할 수 있는 경우의
  수를 출력하는 프로그램을 작성하시오. 
  이때 체스판에서 행 위치를 표현 할때는 1부터 8로 표현 하며, 열 위치를 표현 할 때는
  a-h 로 표현한다
   
  
  */

public class Loyal_Knight {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String inputData = in.nextLine();
		
		int row = inputData.charAt(1)-'0';
		//1번째 문자 를 정수형으로 하기위해 -'0' 0 =아스키코드48
		int column = inputData.charAt(0)-'a'+1;
		//1,1에서 시작하므로 정수형으로 바꾸면서(-'a') 하고 +1
		//System.out.println(row + " "+ column);
		//나이트가 이동할수 있는 8가지 경우 정의 
		int[] dx= {-2,1,-1,2,2,1,-1,-2};
		int[] dy= {-1,-2,-2,-1,1,2,2,1};
		
		//8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
		int result = 0;
		for (int i = 0; i <8; i++) {
			int nextRow = row + dx[i];
			int nextColumn = column + dy[i];
			
			if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8 ) {
				result++;
			}
		}
		
		System.out.println(result);
	}
	
}


























