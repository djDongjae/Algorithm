package PGS_181935;

class Solution {
    public static int result = 0;

    public int solution(int n) {
        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                result += Math.pow(i, 2);
            }
        } else {
            for (int i = 1; i <= n; i += 2) {
                result += i;
            }
        }

        return result;
    }
}
