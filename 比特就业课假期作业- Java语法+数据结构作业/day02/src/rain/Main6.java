package rain;

import java.util.Arrays;

public class Main6 {
    //数组去重
    public static void main(String[] args) {
//        int[] arr = {1,1,2,2,3,3,4,4,5,6,7,7,8,8,9,9,10,10,10};
//        //1-10 5,6
        int[] arr = {1,1,2};
        int slow = 0;
        int fast = 1;
        while (fast < arr.length) {
            if (arr[fast] == arr[slow]) {
                fast++;
            } else {
                slow++;
                arr[slow] = arr[fast];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(slow+1);
    }
}
