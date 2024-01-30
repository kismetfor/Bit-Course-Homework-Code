public class Main1 {
    //https://leetcode.cn/problems/missing-number-lcci/description/
    //力扣 消失的数字
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int sum = nums.length*(nums.length+1)/2;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }
        System.out.println(sum);
    }
}
