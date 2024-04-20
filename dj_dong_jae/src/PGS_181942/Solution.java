package PGS_181942;

public class Solution {
    public String solution(String str1, String str2) {
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str1Arr.length; i++) {
            sb.append(str1Arr[i]);
            sb.append(str2Arr[i]);
        }

        return sb.toString();
    }
}
