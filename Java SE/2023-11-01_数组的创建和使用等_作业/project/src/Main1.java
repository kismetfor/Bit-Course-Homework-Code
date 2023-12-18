import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Arrays.fill(arr, 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void main1(String[] args) {
//        创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
        }
        for (int x:arr1) {
            System.out.println(x);
        }

    }
}
