package ETC.ecount;

import java.io.*;
import java.util.*;

class Main_2 {
    public static int n;
    public static long l, r;
    public static int[] costArray;
    public static long[] sumArray;

    public static void main(String[] args) throws Exception {
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

            int lowIndex = moreThanBS(i, lowerSum);
            int highIndex = exceedBS(i, upperSum);

            if (lowIndex <= i) {
                count += highIndex - lowIndex;
            }
        }

        System.out.println(count);
    }

    // 주어진 값 이상의 첫번째 인덱스 이진 검색
    private static int moreThanBS(int index, long value) {
        int low = 0;
        int high = index;
        while (low < high) {
            int mid = (low + high) / 2;
            if (sumArray[mid] < value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    // 주어진 값 초과의 첫번째 인덱스 이진 검색
    private static int exceedBS(int index, long value) {
        int low = 0;
        int high = index;
        while (low < high) {
            int mid = (low + high) / 2;
            if (sumArray[mid] <= value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}