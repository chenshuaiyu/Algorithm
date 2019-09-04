package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer09_Jump_Floor_II;

public class Solution {

//    f(1) = f(1 - 1) = 1
//    f(2) = f(2 - 1) + f(2 - 2) = 2
//    f(3) = f(3 - 1) + f(3 - 2) + f(3 - 3) = 4
//    ...
    public int JumpFloorII(int target) {
        return 1 << --target;
    }

    public int JumpFloorII_1(int target) {
        return (int) Math.pow(2, target - 1);
    }
}
