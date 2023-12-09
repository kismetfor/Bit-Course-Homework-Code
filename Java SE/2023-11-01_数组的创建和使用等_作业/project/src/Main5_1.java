public class Main5_1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            for (int j = i+1; j < nums.length-1-i; j++) {
                if(nums[j] == key){
                    System.out.println("[" + i + ", " + j + "]");
                    break;
                }
            }
        }
    }
}
