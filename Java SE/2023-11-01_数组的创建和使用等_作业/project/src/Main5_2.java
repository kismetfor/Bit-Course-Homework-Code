import java.util.Arrays;

public class Main5_2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,7,2,8};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] arr, int target) {
        int[] ret = new int[2];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == target){
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
