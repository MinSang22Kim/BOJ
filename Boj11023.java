import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj11023 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int sum = 0;
		String s = br.readLine();

		StringTokenizer st = new StringTokenizer(s, " ");

		while (st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
		}

		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
	}
}
