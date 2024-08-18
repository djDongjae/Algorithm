package BOJ_1546;

import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int[] scoreArray;
    public static int MAX = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        scoreArray = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            scoreArray[i] = Integer.parseInt(st.nextToken());
            MAX = Math.max(MAX, scoreArray[i]);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int newScore = scoreArray[i] / MAX * 100;
            sum += newScore;
        }

        int avg = sum / n;
        System.out.println(avg);
    }
}
