import calculo.NotasAlunos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        float nota1, nota2, nota3, nota4;
        NotasAlunos notas = new NotasAlunos();
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        nota1 = s.nextFloat();
        nota2 = s.nextFloat();
        nota3 = s.nextFloat();
        nota4 = s.nextFloat();

        float resultado = notas.media(nota1, nota2, nota3, nota4);
        System.out.println(resultado);

        if ( resultado >= 7) {
            System.out.println("Aluno aprovado");
        }

        if ( resultado >= 5 && resultado <7) {
            System.out.println("Aluno em recuperação");
        }

        if (resultado < 5) {
            System.out.println("Aluno reprovado");
        }


    }
}