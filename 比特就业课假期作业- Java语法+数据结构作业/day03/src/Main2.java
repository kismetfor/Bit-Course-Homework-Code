public class Main2 {
    public static void main1(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int slow = 0;
        int fast  = 0;
        int k = 0;
        while (fast < nums.length) {
            if (nums[fast] == val) {
                while (fast < nums.length) {
                    fast++;
                    if (nums[fast] != val) {
                        nums[slow] = nums[fast];
                        slow++;
                        break;
                    }
                }
                if (nums[fast] != val) {
                    nums[slow] = nums[fast];
                } else {
                    fast++;
                }

            } else {
                slow++;
                fast++;
            }
        }
    }
}
