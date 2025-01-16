package domain;

public class Fibonacci {
    public int calculate(int n) {
        if (n <= 1) {
            return n;
        }
        return calculate(n - 1) + calculate(n - 2);
    }

    public int fibonacci(int i) {
        return i;
    }
}
