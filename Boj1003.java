import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj1003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		int[][] arr = new int[41][2];

		arr[0][0] = 1;
		arr[0][1] = 0;
		arr[1][0] = 0;
		arr[1][1] = 1;

		for (int i = 2; i <= 40; i++) {
			arr[i][0] = arr[i - 1][0] + arr[i - 2][0];
			arr[i][1] = arr[i - 1][1] + arr[i - 2][1];
		}

		for (int i = 0; i < T; i++) {
			int num = Integer.parseInt(br.readLine());
			bw.write(arr[num][0] + " " + arr[num][1] + "\n");
		}

		bw.flush();
		bw.close();
	}
}
