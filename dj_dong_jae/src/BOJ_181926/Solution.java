package BOJ_181926;

class Solution {
    public int solution(int n, String control) {

        int m = n;
        char[] charArray = control.toCharArray();

        for (char c : charArray) {
            switch(c) {
                case 'w':
                    m++;
                    break;
                case 's':
                    m--;
                    break;
                case 'd':
                    m += 10;
                    break;
                case 'a':
                    m -= 10;
                    break;
                default:
                    System.out.println("invalid char");
            }
        }

        return m;
    }
}
