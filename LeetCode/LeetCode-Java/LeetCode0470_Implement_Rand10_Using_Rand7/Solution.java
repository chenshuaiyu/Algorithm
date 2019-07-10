package LeetCode0470_Implement_Rand10_Using_Rand7;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/24 15:09
 */
public class Solution {
    // 拒绝采样(Rejection Sampling)
    public int rand10() {
        int row = 0, col = 0, id = 0;
//        do {
//            row = rand7();
//            col = rand7();
//            id = (row - 1) * 7 + col;
//        } while (id > 40);
        return 1 + (id - 1) % 10;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}
