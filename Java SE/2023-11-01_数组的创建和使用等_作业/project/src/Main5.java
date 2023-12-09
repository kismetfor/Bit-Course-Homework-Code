import java.util.HashMap;

public class Main5 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        // 创建一个哈希表，用于存储数组元素及其对应的索引
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // 如果差值在哈希表中存在，说明找到了答案
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // 将当前元素及其索引放入哈希表中
            map.put(nums[i], i);
        }

        // 如果没有找到答案，返回一个空数组
        return new int[]{};
    }
}
