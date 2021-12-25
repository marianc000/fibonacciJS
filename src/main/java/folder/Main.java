package folder;

public class Main extends Runner {

    long fibonacci(long n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    void run() {
        measure(n -> fibonacci(n));
    }

    public static void main(String... args) {
        new Main().run();
    }
}
