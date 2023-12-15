public class Main6_1 {
    public static void main(String[] args) {
        hanoi(4, 'A', 'B', 'C');
    }

    public static void hanoi(int n, char source, char auxilary, char goal) {
        if (n == 1) {
            System.out.println("把" + n + "从" + source + "移动到" + goal);
        } else {
            hanoi(n-1, source, goal,auxilary);
            System.out.println("把" + n + "从" + source + "移动到" + goal);
            hanoi(n-1, auxilary, source,goal);
        }
    }
}