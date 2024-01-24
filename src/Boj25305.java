import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Boj25305 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		Integer[] student = new Integer[N];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			student[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(student, Collections.reverseOrder());
		System.out.println(student[k - 1]);
	}
}
