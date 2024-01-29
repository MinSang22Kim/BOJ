import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Boj2164 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] card = new int[N + 1];
		Queue<Integer> q = new LinkedList<Integer>();

		for (int i = 1; i <= N; i++) {
			q.add(i);
		}

		while (q.size() >= 1) {
			if (q.size() == 1) {
				bw.write(Integer.toString(q.poll()));
				break;
			}
			q.remove();
			q.add(q.poll());
		}

		bw.flush();
		bw.close();
	}
}
