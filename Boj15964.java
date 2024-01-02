import java.util.Scanner;

public class Boj15964 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long A = scan.nextLong();
		long B = scan.nextLong();
		System.out.println((A+B)*(A-B));
		scan.close();
	}
}
