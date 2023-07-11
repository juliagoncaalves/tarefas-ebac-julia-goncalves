import java.util.Scanner;

public class TarefaWrapper {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroInt = s.nextInt();
        System.out.println("Você digitou o número: " + numeroInt);

        Integer numIntWrapper = Integer.valueOf(numeroInt);

        System.out.println("Número convertido para wrapper: " + numIntWrapper);

//        int resultadoInt = numIntWrapper.intValue() + 10;
//
//        System.out.println("Resultado inteiro: " + resultadoInt);

    }
}