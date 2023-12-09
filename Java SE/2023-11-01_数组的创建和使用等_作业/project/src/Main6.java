public class Main6 {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int ret = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ret = ret^arr[i];
        }
        System.out.println(ret);
    }
}
