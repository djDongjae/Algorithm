package PGS_181938;

class Solution {
    public int solution(int a, int b) {
        String str = Integer.toString(a) + Integer.toString(b);
        int result1 = Integer.parseInt(str);
        int result2 = 2 * a * b;

        return Math.max(result1, result2);
    }
}
