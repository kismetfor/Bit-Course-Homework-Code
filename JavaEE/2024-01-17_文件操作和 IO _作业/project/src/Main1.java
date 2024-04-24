import java.io.File;
import java.util.Scanner;

public class Main1 {
    //扫描指定目录，
    // 并找到名称中包含指定字符的所有普通文件（不包含目录），
    // 并且后续询问用户是否要删除该文件

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //指定目录
        String srcPath = scanner.next();
        File srcFile = new File(srcPath);
        if (!srcFile.getParentFile().isDirectory()) {
            System.out.println("不是目录!!!!");
            return;
        }

        //指定字符
        String s = scanner.next();
        //包含指定字符的
        // 所有普通文件（不包含目录）
        find(s, srcFile);

        //是否要删除该文件
        System.out.println("是否删除");
        System.out.println("是: 1, 否: 0");
        if (scanner.nextInt()==1) {

        } else {

        }
    }


    private static void find(String s, File srcFile) {
        if (srcFile == null) return;
        File[] files = srcFile.listFiles();
        for (File f:
             files) {
            if (f.isFile()) {
                if (f.getName().contains(s)) {
                    System.out.println("find it !" + f.getAbsolutePath());
                }
            } else if (f.isDirectory()) {
                find(s, f);
            }
        }
    }
}
