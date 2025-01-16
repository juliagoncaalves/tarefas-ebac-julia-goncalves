public class Calculadora {

    /**
     * @param a é um número inteiro qualquer.
     * @param b é um número inteiro qualquer.
     * @return a soma entre o parâmetro a e b.
     */
    public int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * @param a é um número inteiro qualquer.
     * @param b é um número inteiro qualquer.
     * @return a subtração entre o parâmetro a e b.
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * @param a é um número inteiro qualquer.
     * @param b é um número inteiro qualquer.
     * @return a multiplição entre o parâmetro a e b.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * @param a é um número inteiro qualquer.
     * @param b é um número inteiro qualquer.
     * @return a divisão entre o parâmetro a e b.
     */
    public int dividir(int a, int b) {
        if(b != 0) {
            return a / b;
        } else {
            throw new RuntimeException("Erro: O divisor não pode ser zero! ");
        }
    }

}
