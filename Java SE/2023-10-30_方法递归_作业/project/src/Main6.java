public class Main6 {
    //递归求解汉诺塔问题
    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }
    public static void hanoi(int n, char sourse, char fuzhu, char goal) {
        if (n == 1) {
            System.out.println("把" + n + "从" + sourse + "移动到" + goal);
        }
        else {
            //将n-1个 从 源头 到  辅助上
            hanoi(n-1, sourse, goal, fuzhu);
            //将最大的n从 源头到 目标上
            System.out.println("把" + n + "从" + sourse + "移动到" + goal);
            //将n-1个 从 辅助的 移动到 目标上
            hanoi(n-1, fuzhu, sourse, goal);
        }
    }
}