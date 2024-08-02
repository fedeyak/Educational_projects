public class Fibonacci_03_Iteration {

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

    public static long Fibonacci(int num) {
        int last = 0;
        int next = 1;
        for (int i = 0; i < num; i++) {
            int temp = next;
            next += last;
            last = temp;
        }
        return last;
    }

}
