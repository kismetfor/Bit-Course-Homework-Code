import java.util.*;


public class Solution1 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param x int整型 
     * @return int整型
     */
    public int sqrt (int x) {
        // write code here
        int left = 0;
        int right = x/2 + 1; //加一是为了很小数的情况 这是自己想出来的 要是能成的话 真是神之一手了
        while (left < right) {
            long mid = (left+right)/2;
            long square = mid*mid;
            if (square > x) {
                right = (int)mid;
            } else if (square < x){
                left = (int)mid;
            } else {
                return (int)mid;
            }
            if (left+1 == right) {
                if (right*right == x) {
                    return right;
                }
                return left;
            }
        }
        return 0;
    }
}