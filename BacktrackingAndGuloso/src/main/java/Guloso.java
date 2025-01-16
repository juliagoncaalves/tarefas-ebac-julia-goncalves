/*
 * Exercício 2 - Resolva o problema usando um algoritmo guloso
 * Você tem que dar o troco de uma quantia em dinheiro usando o menor número possível de moedas.
 *
 * Exemplos:
 * Entrada: Quantia 18, Moedas disponíveis 5, 2 e 1
 * Saída: 5 (três moedas de cinco, uma de 2 e uma de 1)
 *
 */

import java.util.Scanner;

public class Guloso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] moedas = {5, 2, 1};
        System.out.print("> Digite um valor inteiro: ");
        int valor = sc.nextInt();
        int[] troco = calcularTroco(moedas, valor);

        for (int i = 0; i < moedas.length; i++) {
            if (troco[i] > 0) {
                System.out.println(troco[i] + " moeda(s) de " + moedas[i] + " centavo(s)");
            }
        }
        sc.close();
    }

    public static int[] calcularTroco(int[] moedas, int valor) {
        int[] troco = new int[moedas.length];
        for (int i = 0; i < moedas.length; i++) {
            troco[i] = valor / moedas[i];
            valor %= moedas[i];
        }

        return troco;

    }

}
