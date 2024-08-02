import java.util.stream.IntStream;

public class Fibonacci_04_Stream {

    public static void main(String[] args) {
        Fibonacci_04_Stream fib = new Fibonacci_04_Stream();
        fib.fibonacci().limit(41).forEachOrdered(System.out::println);
    }
    private static int last = 0;
    private static int next = 1;
    public static IntStream fibonacci() {

        return IntStream.generate(() -> {
            int temp = next;
            next += last;
            last = temp;
            return temp;
        });
    }
}
