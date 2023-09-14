import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String texto;

        System.out.print("Digite os nomes: ");
        texto = scanner.next();

        String[] partes = texto.split(",");
        Arrays.sort(partes);

        for (String parte : partes) {
            System.out.println(parte);
        }

        //----------------------------

        System.out.print("Digite os nomes e sexo: ");
        texto = scanner.next();

        ArrayList<String> grupoFeminino = new ArrayList<>();
        ArrayList<String> grupoMasculino = new ArrayList<>();

        String[] pessoas = texto.split(",");

        for (String pessoa : pessoas) {
            String[] pessoaGenero = pessoa.split("-");


            if (pessoaGenero[1].equals("feminino")) {
                grupoFeminino.add(pessoaGenero[0]);

            } else {
                grupoMasculino.add(pessoaGenero[0]);
            }
        }
        System.out.println("grupo feminino \n");
        for (String generoFeminino : grupoFeminino ) {
            System.out.println(generoFeminino);
        }
        System.out.println("grupo masculino \n");
        for (String generoMasculino : grupoMasculino ) {
            System.out.println(generoMasculino);
        }
    }
}

