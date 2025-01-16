package domain;

import org.junit.Assert;
import org.junit.Test;
import domain.Fibonacci;


public class FibonacciTest {

    @Test
    public void fibonacciTest() {
        Fibonacci fibonacci = new Fibonacci();

        Assert.assertEquals(0, fibonacci.fibonacci(0));
        Assert.assertEquals(1, fibonacci.fibonacci(1));
        Assert.assertEquals(1, fibonacci.fibonacci(2));
        Assert.assertEquals(2, fibonacci.fibonacci(3));
        Assert.assertEquals(3, fibonacci.fibonacci(4));
        Assert.assertEquals(5, fibonacci.fibonacci(5));
        Assert.assertEquals(8, fibonacci.fibonacci(6));
        Assert.assertEquals(13, fibonacci.fibonacci(7));
        Assert.assertEquals(21, fibonacci.fibonacci(8));
        Assert.assertEquals(34, fibonacci.fibonacci(9));
    }

}
