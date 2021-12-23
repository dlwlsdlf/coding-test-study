import java.util.Scanner;

public class Game_dev {
	public static int n,m,x,y, direction;
	//방문한 위치를 저장하기위한 맵을 생성..
	public static int[][] d = new int[50][50];
	//전체 맵 정보
	public static int[][] arr = new int[50][50];
	
	//북 동 남 서 
	public static int dx[] = {-1,0,1,0};
	public static int dy[] = {0,1,0,-1};
	//왼쪽으로 회전
	public static void turn_left() {
		direction -=1 ;
		if (direction == -1 ) {
			direction = 3;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//n,m 을 공백을 기준으로 구분하여 입력 받기 
		n = in.nextInt();
		m = in.nextInt();
		
		// 현재 캐릭터의 x 좌표, y 좌표, 방향을 입력 받기 
		x = in.nextInt();
		y = in.nextInt();
		direction = in.nextInt();
		d[x][y] = 1; // 현재 좌표 방문 처리
		
		// 전체 맵 정보를 입력 받기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		int cnt = 1;
		int turn_time = 0;
		
		while (true) {
			//왼쪽으로 회전
			turn_left();
			int nx = x + dx[direction];
			int ny = y + dy[direction];
			// 회전한 이후 정면에 가보지 않은 칸이 존재하는 경우 이동
			if (d[nx][ny] == 0 && arr[nx][ny] == 0) {
				d[nx][ny] = 1 ;
				x = nx;
				y = ny;
				cnt += 1;
				turn_time = 0;
				continue;
			}
			
			//회전한 이후 정면에 가보지 않은 칸이 없거나 바다인 경우
			else turn_time += 1;
			//네방향 모두 갈수 없는 경우
			if (turn_time == 4) {
				nx = x - dx[direction];
				ny = y - dy[direction];
				//뒤로 갈 수 있다면 이동하기
				if (arr[nx][ny] == 0) {
					x = nx;
					y = ny;
				}
				//뒤가 바다로 막혀 있는 경우
				else break;
				turn_time = 0;
			}
		}
		System.out.println(cnt);
	}
}
