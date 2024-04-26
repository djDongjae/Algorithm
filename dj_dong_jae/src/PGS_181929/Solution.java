package PGS_181929;

class Solution {
    public static int mulAll = 1;
    public static int sum = 0;

    public int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            mulAll *= num_list[i];
            sum += num_list[i];
        }

        if (mulAll < (int) Math.pow(sum, 2)) {
            return 1;
        } else {
            return 0;
        }
    }
}