package PGS_181925;

class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < numLog.length; i++) {
            int nowState = numLog[i] - numLog[i-1];
            switch (nowState) {
                case 1:
                    sb.append('w');
                    break;
                case -1:
                    sb.append('s');
                    break;
                case 10:
                    sb.append('d');
                    break;
                case -10:
                    sb.append('a');
                    break;
                default:
                    System.out.println("invalid operation");
            }
        }
        return sb.toString();
    }
}
