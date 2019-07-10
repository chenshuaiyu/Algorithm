package JianZhiOffer48_Add_Two_Numbers;

public class Solution {
    public int Add(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1 ^ num2;//不算进位的相加的值
            num2 = (num1 & num2) << 1;//进位值
            num1 = temp;
        }
        return num1;
    }
}
