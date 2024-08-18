package ETC.ecount;

import java.io.*;
import java.util.*;

class Main_1 {
    public static int n;
    public static int[] heightArray;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        heightArray = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            heightArray[i] = Integer.parseInt(st.nextToken());
        }

//        Map<Integer, List<Integer>> heightMap = new HashMap<>();

        Stack<Integer> stack = new Stack<>();

        int count = 0;

        for (int i = 0; i < n; i++) {
            int height = heightArray[i];

//            if (!heightMap.containsKey(height)) {
//                heightMap.put(height, new ArrayList<>());
//            }
//            heightMap.get(height).add(i);

            while (!stack.isEmpty() && heightArray[stack.peek()] < height) {
                stack.pop();
            }

            if (!stack.isEmpty() && heightArray[stack.peek()] == height) {
//                int lastIndex = stack.pop();
                count++;
//                if (heightMap.containsKey(height)) {
//                    List<Integer> positions = heightMap.get(height);
//                    positions.remove(positions.size() - 1);
//                    if (positions.isEmpty()) {
//                        heightMap.remove(height);
//                    }
//                }
            }

            stack.push(i);
        }

        System.out.println(count);
    }
}
