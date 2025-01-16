import org.example.Fibonacci;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    private final Fibonacci fibonacci = new Fibonacci();

    @Test
    void testCalcularFibonacciPositivo() {
        assertEquals(5, fibonacci.calcular(5)); // Fibonacci de 5 é 5
        assertEquals(8, fibonacci.calcular(6)); // Fibonacci de 6 é 8
    }

    @Test
    void testCalcularFibonacciZero() {
        assertEquals(0, fibonacci.calcular(0)); // Fibonacci de 0 é 0
    }

    @Test
    void testCalcularFibonacciUm() {
        assertEquals(1, fibonacci.calcular(1)); // Fibonacci de 1 é 1
    }
}
