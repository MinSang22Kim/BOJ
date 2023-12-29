import java.util.Scanner;
import java.util.InputMismatchException;

public class Boj4101 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			try {
				int a = scan.nextInt();
				int b = scan.nextInt();

				if (a == 0 && b == 0)
					break;
				if (a > b)
					System.out.println("Yes");
				else
					System.out.println("No");
			} catch (InputMismatchException e) {
				System.out.println("Error");
				scan.nextLine();
			}
		}
		scan.close();
	}
}
