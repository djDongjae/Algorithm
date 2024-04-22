package PGS_181939;

class Solution {
    public int solution(int a, int b) {
        String str1 = Integer.toString(a) + Integer.toString(b);
        String str2 = Integer.toString(b) + Integer.toString(a);

        int result1 = Integer.parseInt(str1);
        int result2 = Integer.parseInt(str2);

        if (result1 > result2) {
            return result1;
        } else {
            return result2;
        }
    }
}
