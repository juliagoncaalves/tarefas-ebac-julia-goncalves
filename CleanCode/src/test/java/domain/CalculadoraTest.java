package domain;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    public void adicionarTest() {
        int result = calculadora.adicionar(5,6);
        Assert.assertEquals(11, result);
    }

    @Test
    public void subtrairTest() {
        int result = calculadora.subtrair(5,2);
        Assert.assertEquals(3, result);
    }

    @Test
    public void multiplicarTest() {
        int result = calculadora.multiplicar(2,2);
        Assert.assertEquals(4, result);
    }

    @Test
    public void dividirTest() {
        int result = calculadora.dividir(8,2);
        Assert.assertEquals(4, result);
    }

    @Test(expected = RuntimeException.class)
    public void dividirrPorZero() {
        calculadora.dividir(8, 0);
    }

    private class Calculadora {
        public int adicionar(int i, int i1) {
            return i;
        }

        public int subtrair(int i, int i1) {
            return i;
        }

        public int multiplicar(int i, int i1) {
            return i;
        }

        public int dividir(int i, int i1) {
            return i;
        }
    }
}
