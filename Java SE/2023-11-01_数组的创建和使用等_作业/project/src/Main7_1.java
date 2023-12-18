import java.util.Arrays;

public class Main7_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,88,8,8,8,8,8,10,11,22,3,4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length/2]);
    }
}
