public class Main8 {
    public static void main(String[] args) {
        int[] arr = {1,2,34,3,4,5,7,23,12};
        for (int i = 0; i < arr.length-2; i++) {
            //从i开始 连续三个元素都是奇数
            //条件:i下标的数 为奇数
            if(arr[i]%2 != 0){
                if (is_three_odd(i, arr)){
                    System.out.println("[" + arr[i]+','+arr[i+1]+','+arr[i+2] + ']');
                }
            }
        }

    }
    public static boolean is_three_odd(int index, int[] arr){
        for (int i = index+1; i < index+3; i++) {
            if(arr[i]%2 == 0){
                return false;
            }
        }
        return true;
    }
}
