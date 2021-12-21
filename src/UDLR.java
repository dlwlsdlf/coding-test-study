import java.util.Arrays;
import java.util.Scanner;

public class UDLR {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// N 입력받기
		
		int n = in.nextInt(); //LRUD 입력받음
		in.nextLine(); //버퍼 비워두기
		String[] plans = in.nextLine().split(" "); 
		//문자열에 저장하는 방식 
		
		int x=1, y=1; //초기 좌표 1 1 
		// L R U D 에 따른 이동 방향
		int[] dx = {0,0,-1,1};//방향벡터
		int[] dy = {-1,1,0,0}; // L=(0,-1)왼쪽  R=(0,1)오른쪽 이런식으로
		
		char[] moveTypes = {'L','R','U','D'};
		
		//System.out.println(Arrays.toString(plans)); 테스트용
		
		//이동 계획을 하나씩 확인
		for (int i = 0; i < plans.length; i++) {//입력받은 문자 열 길이만큼
			char plan = plans[i].charAt(0);//charAt 으로 하나씩 
			//이동후 좌표 구하기
			int nx = -100, ny =-100; // 다음위치값 초기화
			
			for (int j = 0; j < 4; j++) {
				if (plan ==moveTypes[j]) {
					nx = x + dx[j];
					ny = y + dy[j];
					System.out.println(nx+" "+ny);
				}
			}
			//공간을 벗어나는 경우 무시
			if (nx < 1 || ny< 1 || nx > n|| ny > n) {
				System.out.println("X"+nx+" "+ny);
				continue;
			}
			x = nx;
			y = ny;
		}
		System.out.println(x+" "+y);
	}
}
