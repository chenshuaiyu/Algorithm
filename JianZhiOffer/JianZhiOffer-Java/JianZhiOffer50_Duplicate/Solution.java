package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer50_Duplicate;

public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate2(int numbers[], int length, int[] duplication) {
        //对0 -（n-1）进行归位，出现冲突时即为重复
        if (numbers == null || numbers.length == 0)
            return false;
        for (int i = 0; i < numbers.length; i++) {
            int index = numbers[i];
            if (i != index) {
                if (numbers[index] == index) {
                    duplication[0] = index;
                    return true;
                } else {
                    int t = numbers[index];
                    numbers[index] = index;
                    numbers[i] = t;
                }
            }
        }
        return false;
    }

    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || numbers.length == 0) {
            duplication[0] = -1;
            return false;
        }
        boolean[] flag = new boolean[length];
        for (int n : numbers) {
            if (flag[n]) {
                duplication[0] = n;
                return true;
            }
            flag[n] = true;
        }
        return false;
    }

    public boolean duplicate1(int numbers[], int length, int[] duplication) {
        if (numbers == null || numbers.length == 0) {
            duplication[0] = -1;
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            if (n >= length)
                n -= length;
            if (numbers[n] >= length) {
                duplication[0] = n;
                return true;
            }
            numbers[n] += length;
        }
        duplication[0] = -1;
        return false;
    }
}
