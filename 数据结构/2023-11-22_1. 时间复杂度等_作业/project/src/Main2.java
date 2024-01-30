import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void reverse(int[] nums, int begin, int end) {
        while (begin < end) {
            int temp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = temp;
            begin++;end--;
        }
    }
}
