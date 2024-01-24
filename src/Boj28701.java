import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj28701 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int sum = 0;

		for (int i = 1; i <= N; i++) {
			sum += i;
		}

		System.out.println(sum);
		System.out.println((int) Math.pow(sum, 2));

		sum = 0;

		for (int i = 1; i <= N; i++) {
			sum += (int) Math.pow(i, 3);
		}

		System.out.println(sum);
	}
}
