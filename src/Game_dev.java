import java.util.Scanner;

public class Game_dev {
	public static int n,m,x,y,direction;
	
	public static int  record[][] = new int[50][50];//방문위치 저장용 맵
	public static int map[][] = new int [50][50];//전체 맵정보
	
	public static int dx[] = {-1,0,1,0};// 북 동 남 서 방향 
	public static int dy[] = {0,1,0,-1};
	
	public static void turn_left() {
		direction -=1;
		if (direction == -1) {
			direction = 3;
		}
	}
	
	public static void main(String[] args) {
	
		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		
		x = in.nextInt();
		y = in.nextInt();
		direction = in.nextInt();
		
		record[x][y] = 1; 
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j]=in.nextInt();
			}
		}
		
		//시뮬레이션 시작 
		int cnt =1;
		int turn_time = 0;
		while(true) {
			//왼쪽으로 회전
			turn_left();
			int nx = x + dx[direction];
			int ny = y + dy[direction];
			//회전한 이후 정면에 가보지 않은 칸이 존재하는경우 
			
			if (record[nx][ny] == 0 && map[nx][ny] == 0) {
				record[nx][ny] = 1;
				x = nx;
				y = ny;
				cnt++;
				turn_time = 0;
				continue;
			}
			//회전한 이후 정면에 가보지 않은 칸이 없거나 바다여서 못가는경우
			else turn_time++;
			//네방향 다 못가는 경우
			if (turn_time == 4) {
				nx = x - dx[direction];
				ny = y - dy[direction];
				
				//뒤로 갈수 있으면 뒤로 이동
				if (map[nx][ny] == 0) {
					x = nx;
					y = ny;
				}
				
				else break;
				turn_time = 0;
			}
		}
		System.out.println(cnt);
	}
}
