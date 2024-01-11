public class Main1 {
    /*
    1、给定一个长度为 n 的字符串，
    请编写一个函数判断该字符串是否回文。
    如果是回文请返回true，否则返回false。
    字符串回文指该字符串正序与其逆序逐字符一致。
     OJ链接 【难度：简单】
     */
    public static void main(String[] args) {
//        float f = 1.9f;
//        int i = (int)f;
//        System.out.println(i);
        int x = 2;
        int ret;
        int left = 1;
        int right = x/2;
        while (true) {
            if (left*left == x) {
                System.out.println(left);
                break;
            }
            if (right*right==x) {
                System.out.println(right);
                break;
            }
            ret = (left+right)/2;
            if (ret*ret < x) {
                left = ret;
            } else if (ret*ret > x) {
                right = ret;
            } else {
                //刚好找到的情况
                System.out.println(ret);
                break;
            }
            if (right-left==1) {
                System.out.println(left);
                break;
                //这时候已经缩小到整数中的最小范围了
            }
        }

    }
}
