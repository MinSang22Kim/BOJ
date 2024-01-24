import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj1940 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int cnt = 0, start = 0, end = N - 1;
		int[] arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);

		while (start < end) {
			if (arr[start] + arr[end] == M) {
				cnt++;
				start++;
				end--;
			} else if (arr[start] + arr[end] > M) {
				end--;
			} else {
				start++;
			}
		}
		System.out.println(cnt);
	}
}
