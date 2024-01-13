class Solution {
    public int removeElement(int[] nums, int val) {
        //一个指针用于遍历数组，而另一个指针用于记录满足某种条件的元素的位置。
        // 这两个指针一起工作，通过移动的方式来达到修改数组的目的。
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}