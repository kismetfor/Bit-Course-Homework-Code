import java.util.Scanner;
//
//public class Main4 {
//    public static void main(String[] args) {
//        //编写代码模拟三次密码输入的场景。
//        // 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输入，
//        // 最多输入三次。三次均错，则提示退出程序
//        int password = 123456;
//        int i;
//        Scanner in = new Scanner(System.in);
//        for (i = 0; i < 3; i++) {
//            int input = in.nextInt();
//            if (input == password) {
//                System.out.println("登录成功");
//                break;
//            } else if (i==2) {
//                System.out.println("机会耗尽, 退出程序");
//            } else {
//                System.out.println("密码错误");
//                System.out.println("还剩" + (3-i-1) +"次机会");
//                System.out.println("重新输入");
//            }
//        }
//    }
//}
//

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 3;
        while (count != 0){
            System.out.print("请输入>");
            String password = in.nextLine();
            count--;
            if(password.equals("123abc")){
                System.out.println("密码正确 登陆成功");
                break;
            }
            else {
                System.out.println("密码错误");
                System.out.println("剩余" + count +"次机会");
            }
        }
        if (count == 0){
            System.out.println("机会耗尽 登录失败");
        }
    }
}