import java.util.Scanner;

public class Boj27294 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int S = scan.nextInt();
		if (S == 1) {
			System.out.println(280);
			return;
		}
		if ((12 <= T && T <= 16) && S == 0) {
			System.out.println(320);
		} else {
			System.out.println(280);
		}
	}
}
