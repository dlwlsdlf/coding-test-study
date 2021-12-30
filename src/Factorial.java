import java.util.Scanner;

public class Factorial {
	
	public static int Fac(int n) {
		if (n<=1) {
			return 1;
		}
		else {
			return Fac(n-1)*n; 
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		
		System.out.println(Fac(N));
		
		/*		
		int N = in.nextInt();
		int result =1;
		
		for (int i = 1; i < N+1; i++) {
			result = result*i;
		}
		
		System.out.println(result);
*/
		
	}
}
