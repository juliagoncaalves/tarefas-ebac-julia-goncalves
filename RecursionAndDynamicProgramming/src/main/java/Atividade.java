import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Atividade {

    private static final Map<Integer, Integer> memo = new HashMap<>();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Exercício 1 – Resolva o problema usando recursão
        exercicioUm();

        // Exercício 2 – Resolva o problema programação dinâmica
        // abordagem top down e outro com bottom up
        exercicioDois();

        input.close();
    }

    private static int calcularFatorTopDown(int n) {
        if(n < 0) {
            return 0;
        }
        if(n == 0 || n == 1) {
            return 1;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = n * calcularFatorTopDown(n - 1);
        memo.put(n, result);
        return result;

    }

    private static int calcularFatorBottomUp(int n) {
        if(n < 0) {
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = i * dp[i - 1];
        }
        return dp[n];
    }

    private static void exercicioUm() {
        System.out.println("> Adicione um número inteiro: ");
        int num = input.nextInt();
        int fator = 1;
        for (int i = 1; i <= num; i++) {
            fator *= i;
        }
        System.out.println("> Fatorial de " + num + "! = " + fator);
    }

    private static void exercicioDois() {
        System.out.print("> Digite um número: ");
        int n = input.nextInt();
        // Usando top down
        System.out.print("> Top-Down: " + calcularFatorTopDown(n));
        System.out.print(" ");
        // Usando bottom up
        System.out.print("\n> Bottom-Up: " + calcularFatorBottomUp(n));
    }
}