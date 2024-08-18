package ETC.ecount;

import java.util.*;
import java.io.*;

public class Main_3 {
    public static int n;
    public static long l, r;
    public static int[] costArray;
    public static long[] sumArray;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        l = Long.parseLong(st.nextToken());
        r = Long.parseLong(st.nextToken());

        costArray = new int[n + 1];
        sumArray = new long[n + 1];
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            costArray[i] = Integer.parseInt(st.nextToken());
            sumArray[i] = sumArray[i - 1] + costArray[i];
        }

        long count = 0;

        for (int i = 1; i <= n; i++) {
            long nowSum = sumArray[i];

            long lowerSum = nowSum - r;
            long upperSum = nowSum - l;

            if (upperSum >= 0) {
                int lowIndex = moreThanBS(i, lowerSum);
                int highIndex = exceedBS(i, upperSum);

                count += highIndex - lowIndex;
            }
        }

        System.out.println(count);
    }

    private static int moreThanBS(int index, long target) {
        int start = 0;
        int end = index;
        while (start < end) {
            int mid = (start + end) / 2;
            if (sumArray[mid] > target) {
                end = mid - 1;
            } else if (sumArray[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    private static int exceedBS(int index, long target) {
        int start = 0;
        int end = index;
        while (start < end) {
            int mid = (start + end) / 2;
            if (sumArray[mid] > target) {
                end = mid - 1;
            } else if (sumArray[mid] < target) {
                start = mid + 1;
            } else {
                return mid + 1;
            }
        }
        return start;
    }
}