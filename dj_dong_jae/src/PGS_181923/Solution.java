package PGS_181923;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int min = 987654321;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2] && arr[j] < min) {
                    min = arr[j];
                }
            }
            if (min != 987654321) {
                result[i] = min;
            } else {
                result[i] = -1;
            }
        }

        return result;
    }
}
