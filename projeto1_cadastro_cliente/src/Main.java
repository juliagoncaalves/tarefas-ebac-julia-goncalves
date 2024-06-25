import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static String nome;
    private static int idade;
    private static char sexo;
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome = leitor.nextLine();

        System.out.println("Digite sua idade:");
        idade = leitor.nextInt();

        do{
            try {
                System.out.println("Digite seu sexo: F ou M");
                sexo = (char) System.in.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while (sexo != 'F' && sexo != 'M');

        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);

    }



}