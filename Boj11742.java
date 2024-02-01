import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj11742 {
	static ArrayList<Integer>[] A;
	static boolean visited[];

	public static void DFS(int v) {
		if (visited[v])
			return; // 현재 노드가 방문노드이면 탐색X
		visited[v] = true;
		for (int i : A[v]) {
			if (!visited[i])
				DFS(i);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		visited = new boolean[n + 1];
		A = new ArrayList[n + 1];

		for (int i = 1; i < n + 1; i++) {
			A[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			A[start].add(end);
			A[end].add(start);
			// 방향성이 없는 그래프이기 때문
		}

		int cnt = 0;
		for (int i = 1; i < n + 1; i++) {
			if (!visited[i]) {
				cnt++;
				DFS(i);
			}
		}

		bw.write(Integer.toString(cnt));
		bw.flush();
		bw.close();
	}
}
