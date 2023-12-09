public class Main1 {
    public static void main(String[] args) {
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
