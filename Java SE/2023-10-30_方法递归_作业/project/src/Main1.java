
public class Main1 {
    public static void main(String[] args) {
        int num = factor(4);
        System.out.println(num);
    }
    public static int factor(int n){
        if(n==1){
            return 1;
        }
        return n*factor(n-1);
    }
}
