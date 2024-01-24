import java.util.Scanner;

public class Boj11719 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextLine()) {
			String sentence = scan.nextLine(); // 개행문자를 포함
			System.out.println(sentence);
		}
		scan.close();
	}
}
