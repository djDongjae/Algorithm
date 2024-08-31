package BOJ_11399;

import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int[] array;
    public static int[] sumArray;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        array = new int[n+1];
        sumArray = new int[n+1];

        for (int i = 1; i <= n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        for (int i = 1; i <= n; i++) {
            sumArray[i] = sumArray[i-1] + array[i];
        }

        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += sumArray[i];
        }

        System.out.println(result);
    }
}
