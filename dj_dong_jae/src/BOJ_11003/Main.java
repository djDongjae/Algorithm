package BOJ_11003;

import java.util.*;
import java.io.*;

public class Main {
    public static int n, l;

    public static long[] array;

    public static class Node {
        public int index;
        public long value;
        public Node(int index, long value) {
            this.index = index;
            this.value = value;
        }
    }

    public static Deque<Node> dq = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());

        array = new long[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && dq.getLast().value > array[i]) {
                dq.removeLast();
            }

            dq.addLast(new Node(i, array[i]));

            if (dq.getFirst().index <= (i - l)) {
                dq.removeFirst();
            }

            sb.append(dq.getFirst());
            sb.append(" ");
        }

        System.out.println(sb);
    }
}