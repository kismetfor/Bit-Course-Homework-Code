class Solution {
    public int removeDuplicates(int[] nums) {
        int k;
        int slow = 0;
        int fast = 1;
        while (fast < nums.length) {
            if (nums[fast] == nums[slow]) {
                fast++;
            } else {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        k = slow + 1;
        return k;
    }
}