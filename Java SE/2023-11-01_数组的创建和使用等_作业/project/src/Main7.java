public class Main7 {
    public static void main(String[] args) {
        int[] arr = {2,1,1,1,1,1,1,2};
        for (int i = 0; i < arr.length; i++) {
            if (fun(i, arr)){
                System.out.println(arr[i]);
                break;
            }
        }
    }
    public static boolean fun(int index, int[] arr){
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if(i==index){
                continue;
            } else if (arr[index] == arr[i]) {
                count++;
                if(count>arr.length/2){
                    return true;
                }
            }
        }
        return false;
    }
}
