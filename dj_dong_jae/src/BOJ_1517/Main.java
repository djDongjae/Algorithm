package BOJ_1517;

import java.util.*;
import java.io.*;

public class Main {
    public static int[] array;
    public static int[] tmpArray;
    public static int n;
    public static long result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        array = new int[n+1];
        tmpArray = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        result = 0;

        mergeSort(1, n);

        System.out.println(result);
    }

    private static void mergeSort(int start, int end) {
        if (end - start < 1) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort(start, mid);
        mergeSort(mid + 1, end);

        for (int i = start; i <= end; i++) {
            tmpArray[i] = array[i];
        }

        int k = start;
        int index1 = start;
        int index2 = mid + 1;

        while (index1 <= mid && index2 <= end) {
            if (tmpArray[index1] > tmpArray[index2]) {
                array[k] = tmpArray[index2];
                result += (index2 - k);
                k++;
                index2++;
            } else {
                array[k] = tmpArray[index1];
                k++;
                index1++;
            }
        }

        while (index1 <= mid) {
            array[k] = tmpArray[index1];
            k++;
            index1++;
        }

        while (index2 <= end) {
            array[k] = tmpArray[index2];
            k++;
            index2++;
        }
    }
}
