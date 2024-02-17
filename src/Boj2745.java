import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj2745 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken());

		int tmp = 1;
		int sum = 0;

		for (int i = N.length() - 1; i >= 0; i--) {
			char c = N.charAt(i);
			if ('0' <= c && c <= '9')
				sum += (c - '0') * tmp;
			else
				sum += (c - 'A' + 10) * tmp;
			tmp *= B;
		}

		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
	}
}
