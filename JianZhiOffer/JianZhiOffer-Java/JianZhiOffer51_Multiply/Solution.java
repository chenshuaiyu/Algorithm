package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer51_Multiply;

public class Solution {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (i - 1 >= 0)
                B[i] = B[i - 1] * A[i - 1];
            else
                B[i] = 1;
        }
        int temp = 1;
        for (int i = A.length - 1; i >= 0; i--) {
            if (i + 1 < A.length) {
                temp = temp * A[i + 1];
                B[i] = B[i] * temp;
            }
        }
        return B;
    }
}
