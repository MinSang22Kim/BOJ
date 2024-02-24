import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		Queue<Integer> q = new LinkedList<Integer>();

		for (int i = 1; i <= N; i++) {
			q.add(i);
		}

		sb.append("<");

		while (q.size() > 1) {
			for (int i = 1; i < K; i++) {
				q.add(q.poll());
			}
			sb.append(q.poll() + ", ");
		}

		sb.append(q.poll());
		sb.append(">");

		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
	}
}
