public class Main4 {
    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    //
    //如数组：[1,2,3,4,5,6]
    //
    //调整后可能是：[1, 5, 3, 4, 2, 6]
    //典型的双指针
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            while (left < right && arr[left]%2 != 0){
                left++;
            }
            while (left < right && arr[right]%2 == 0){
                right--;
            }
            int temp= arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        for (int x:arr
             ) {
            System.out.print(x + " ");
        }
    }
}
