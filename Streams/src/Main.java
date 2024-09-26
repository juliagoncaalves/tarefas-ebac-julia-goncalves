import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        List<Pessoa> pessoas = new ArrayList<>();

        while (true) {
            System.out.println("Nome da pessoa (ou 'sair' para terminar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Sexo da pessoa (feminino/masculino): ");
            String sexo = scanner.nextLine();

            if (!sexo.equalsIgnoreCase("feminino") && !sexo.equalsIgnoreCase("masculino")) {
                System.out.println("Sexo inválido! Por favor, insira 'feminino' ou 'masculino'.");
                continue;
            }

            Pessoa pessoa = new Pessoa(nome,sexo);
            pessoas.add(pessoa);
        }

        System.out.println("\n Lista de pessoas cadastradas:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
        }

//        scanner.close();

        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("feminino"))
                .collect(Collectors.toList());

        if (mulheres.isEmpty()) {
            System.out.println("\nNão há mulheres cadastradas.");

        } else {
            System.out.println("\nLista de mulheres cadastradas:");
            mulheres.forEach(pessoa -> {

                if (pessoa.getSexo().equalsIgnoreCase("feminino")) {
                    System.out.println("Nome: " + pessoa.getNome() + ", é do sexo feminino.");

                } else {
                    System.out.println("Pessoa de sexo diferente.");
                }
            });
        }


    }

//    scanner.close();

}






