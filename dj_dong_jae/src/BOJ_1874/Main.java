package BOJ_1874;

import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        array = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        int count = 1;
        for (int i = 1; i <= n; i++) {
            int now = array[i];
            if (now >= count) {
                while (count <= now) {
                    stack.push(count++);
                    sb.append("+").append("\n");
                }
                stack.pop();
                sb.append("-").append("\n");
            } else {
                if (stack.peek() != now) {
                    System.out.println("NO");
                    return;
                } else {
                    stack.pop();
                    sb.append("-").append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}