import java.util.Scanner;


public class LRUD_Practice {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		//N입력
		int N = in.nextInt();
		in.nextLine();//버퍼 비워두기
		
		//LRUD 입력받아서 문자열에 저장
		String plans[] = new String[N];
		plans = in.nextLine().split("");
		
		int x=1, y=1; //초기 좌표
		
		int dx[] = {0,0,-1,1};//LRUD 방향 벡터
		int dy[] = {-1,1,0,0};

		char MoveType[] = {'L','R','U','D'};
		
		for (int i = 0; i < plans.length; i++) {
			int nx = -1, ny = -1;//이동후 좌표
			char plan = plans[i].charAt(0);
			for (int j = 0; j < MoveType.length; j++) {
				if (plan == MoveType[j]) {
					nx = x + dx[j];
					ny = y + dy[j];
				}
			}
			
			//공간을 벗어나는 경우
			if (nx < 1|| ny <1 || nx > N || ny > N) {
				continue;
			}
			
			x = nx;
			y = ny;
			
		}
		
		System.out.println(x+" "+y);
	}
}
