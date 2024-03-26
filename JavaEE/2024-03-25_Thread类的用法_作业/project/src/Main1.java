import java.util.Random;

class SumThread extends Thread {
    private int[] array;
    private int startIndex;
    private int sum;

    public SumThread(int[] array, int startIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.sum = 0;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < array.length; i += 2) {
            sum += array[i];
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10_000_000; // 数组长度 1000w
        int[] array = generateRandomArray(ARRAY_LENGTH);

        long startTime = System.currentTimeMillis();

        SumThread thread1 = new SumThread(array, 0);
        SumThread thread2 = new SumThread(array, 1);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int sum = thread1.getSum() + thread2.getSum();

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Sum: " + sum);
        System.out.println("Execution Time: " + executionTime + " milliseconds");
    }

    // 生成随机数组
    private static int[] generateRandomArray(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100) + 1; // 生成 1-100 之间的随机数
        }
        return array;
    }
}
