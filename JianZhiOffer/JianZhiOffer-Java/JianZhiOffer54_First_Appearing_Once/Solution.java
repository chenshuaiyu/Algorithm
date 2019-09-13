package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer54_First_Appearing_Once;

public class Solution {
    private int[] arr = new int[256];
    private int index;

    public Solution() {
        for (int i = 0; i < arr.length; i++)
            arr[i] = -1;
        index = 0;
    }

    //Insert one char from stringstream
    public void Insert(char ch) {
        if (arr[ch] == -1)
            arr[ch] = index;
        else if (arr[ch] >= 0)
            arr[ch] = -1;
        index++;
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        char c = '\0';
        int minIndex = 256;
        for (int i = 0; i < 256; i++) {
            if (arr[i] >= 0 && arr[i] < minIndex) {
                c = (char) i;
                minIndex = arr[i];
            }
        }
        if (c == '\0')
            return '#';
        else
            return c;
    }
}
