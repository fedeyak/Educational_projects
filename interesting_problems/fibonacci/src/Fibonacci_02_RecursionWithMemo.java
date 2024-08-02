import java.util.HashMap;
import java.util.Map;

public class Fibonacci_02_RecursionWithMemo {
    public static void main(String[] args) {
        System.out.println("Should return 0: " + Fibonacci(0));
        System.out.println("Should return 1: " + Fibonacci(2));
        System.out.println("Should return 2: " + Fibonacci(3));
        System.out.println("Should return 3: " + Fibonacci(4));
        System.out.println("Should return 5: " + Fibonacci(5));
        System.out.println("Should return 8: " + Fibonacci(6));
        System.out.println("Should return 13: " + Fibonacci(7));
        System.out.println("Should return 21: " + Fibonacci(8));
        System.out.println("Should return 34: " + Fibonacci(9));
        System.out.println("Should return 55: " + Fibonacci(10));
        long then = System.currentTimeMillis();
        System.out.println("Should return 102334155 : " + Fibonacci(40));
        System.out.println("Time spent: " + (System.currentTimeMillis() - then));

    }

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static long Fibonacci(int num) {
        if (num < 0) return -1;
        if (num == 0) memo.put(0, 0);
        if (num == 1 || num == 2) memo.put(num, 1);
        if (!memo.containsKey(num)) {
            memo.put(num, (int) (Fibonacci(num - 1) + Fibonacci(num - 2)));}
        return memo.get(num);
    }
}
