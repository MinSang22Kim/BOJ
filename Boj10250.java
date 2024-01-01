import java.util.Scanner;

public class Boj10250 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int room = 0;
		for (int i = 0; i < n; i++) {
			int H = scan.nextInt();
			int W = scan.nextInt();
			int N = scan.nextInt();

			if (N % H == 0) { // 꼭대기 층
				room = (H * 100) + (N / H);
			} else {
				room = (N % H) * 100 + ((N / H) + 1);
			}
			System.out.println(room);
		}
		scan.close();
	}
}
