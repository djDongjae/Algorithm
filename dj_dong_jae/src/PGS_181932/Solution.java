package PGS_181932;

class Solution {


    public String solution(String code) {
        char[] codeArray = code.toCharArray();

        StringBuilder sb = new StringBuilder("");
        boolean mode = false;

        for (int idx = 0; idx < code.length(); idx++) {
            if (codeArray[idx] == '1') {
                mode = !mode;
            } else {
                if (!mode && idx % 2 == 0) {
                    sb.append(codeArray[idx]);
                }
                if (mode && idx % 2 != 0) {
                    sb.append(codeArray[idx]);
                }
            }
        }

        String ret = sb.toString();

        if (ret.length() == 0) {
            return "EMPTY";
        } else {
            return ret;
        }
    }
}