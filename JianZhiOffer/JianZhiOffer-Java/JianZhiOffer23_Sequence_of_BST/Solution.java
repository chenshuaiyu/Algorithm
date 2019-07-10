package JianZhiOffer23_Sequence_of_BST;


public class Solution {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        return verify(sequence, 0, sequence.length - 1);
    }

    private boolean verify(int[] sequence, int l, int r) {
        if (l >= r) return true;
        int i;
        for (i = r - 1; i >= 0 && sequence[i] > sequence[r]; i--) {
        }
        for (int j = i; j >= 0; j--) {
            if (sequence[j] > sequence[r])
                return false;
        }
        return verify(sequence, 0, i) && verify(sequence, i + 1, r - 1);
    }
}
