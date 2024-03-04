package PGS_181927;

class Solution {
    public int[] solution(int[] num_list) {

        int[] new_list = new int[num_list.length + 1];
        int last = 0;
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            last = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            last = num_list[num_list.length - 1] * 2;
        }

        System.arraycopy(num_list, 0, new_list, 0, num_list.length);

        new_list[num_list.length] = last;

        return new_list;
    }
}
