package JianZhiOffer09_Jump_Floor_II;

public class Solution {
    public int JumpFloorII(int target) {
        return 1 << --target;
    }

    public int JumpFloorII_1(int target) {
        return (int) Math.pow(2, target - 1);
    }
}
