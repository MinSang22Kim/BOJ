import java.util.Scanner;

public class Boj2445 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 1; i <= n - 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 2 * (n - i); j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			for (int j = 0; j < 2 * i; j++) {
				System.out.print(" ");
			}
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
