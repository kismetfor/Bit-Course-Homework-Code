package rain;

class Solution {
    public int removeDuplicates(int[] nums) {
        int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ret[i] = nums[0]-2;
        }
        ret[0] = nums[0];
        int j = 0;
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (ret[j]==nums[i]) {

            } else {
                k++;
            }
        }

        return 1;
    }
}