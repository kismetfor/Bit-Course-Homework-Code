public class Main1 {
    public static void main(String[] args) {
        try {
            int result = 1/2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("final");
        }
    }
}
