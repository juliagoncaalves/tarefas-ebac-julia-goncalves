import org.example.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void testAdicionar() throws Exception {
        // Usando reflexão para chamar o método privado 'adicionar'
        Method method = Calculadora.class.getDeclaredMethod("adicionar", int.class, int.class);
        method.setAccessible(true);  // Torna o método acessível
        int result = (int) method.invoke(calculadora, 2, 3);  // Invoca o método
        assertEquals(5, result);
    }

    @Test
    void testSubtrair() throws Exception {
        // Usando reflexão para chamar o método privado 'subtrair'
        Method method = Calculadora.class.getDeclaredMethod("subtrair", int.class, int.class);
        method.setAccessible(true);
        int result = (int) method.invoke(calculadora, 5, 3);
        assertEquals(2, result);
    }

    @Test
    void testMultiplicar() throws Exception {
        // Usando reflexão para chamar o método privado 'multiplicar'
        Method method = Calculadora.class.getDeclaredMethod("multiplicar", int.class, int.class);
        method.setAccessible(true);
        int result = (int) method.invoke(calculadora, 2, 3);
        assertEquals(6, result);
    }

    @Test
    void testDividir() throws Exception {
        // Usando reflexão para chamar o método privado 'dividir'
        Method method = Calculadora.class.getDeclaredMethod("dividir", int.class, int.class);
        method.setAccessible(true);
        int result = (int) method.invoke(calculadora, 6, 3);
        assertEquals(2, result);
    }

    @Test
    public void testDividirPorZero() throws Exception {
        // Usando reflexão para chamar o método privado 'dividir' e testar exceção
        Method method = Calculadora.class.getDeclaredMethod("dividir", int.class, int.class);
        method.setAccessible(true);

        // Agora, usamos assertThrows para verificar a exceção corretamente
        ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> {
            method.invoke(calculadora, 1, 0);  // Invoca o método com '0' como divisor
        });

        assertEquals("Não é possível dividir por zero", thrown.getMessage());  // Verifica a mensagem da exceção
    }
    }