import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj2845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int L = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int people = L * P;

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < 5; i++) {
			int who = Integer.parseInt(st.nextToken());
			bw.write(Integer.toString(who - people) + " ");
		}

		bw.flush();
		bw.close();
	}
}
