import java.util.*;

public class Dfs_ice {

	public static int N,M;
	public static int[][] graph = new int[1000][1000];
	
	//dfs로 특정 노드를 방문하고 연결된 모든 노드들도 방문 
	public static boolean dfs(int x,int y) {
		//주어진 범위를 벗어 나는경우에 즉시 종료
		if (x <= -1 || x >= N || y <= -1 || y >= M ) {
			return false;
		}
		
		//현재 노드를 아직 방문하지 않았다면
		if (graph[x][y] == 0 ) {
			//해당 노드 방문 처리
			graph[x][y] = 1;
			//상,하,좌,우 의 위치들도 모두 재귀적으로 호출
			dfs(x-1, y);
			dfs(x, y-1);
			dfs(x+1, y);
			dfs(x, y+1);
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		N = in.nextInt();
		M = in.nextInt();
		in.nextLine();
		
		//2차원 리스트 맵의 정보 입력받기 
		for (int i = 0; i < N; i++) {
			String str = in.nextLine();
			for (int j = 0; j < M; j++) {
				graph[i][j] =str.charAt(j)-'0';
			}
		}
		
		// 모든 노드 에 대하여 음료수 채우기
		int result = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				//현재 위치에서 dfs 수행 
				if (dfs(i,j)) {
					result +=1 ;
				}
			}
		}
		System.out.println(result);
	}
}

