package BOJ_1427;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArray = br.readLine().toCharArray();

        Integer[] array = new Integer[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            array[i] = (int) (charArray[i] - '0');
        }

        Arrays.sort(array, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (int x : array) {
            sb.append(x);
        }

        System.out.println(sb);
    }
}