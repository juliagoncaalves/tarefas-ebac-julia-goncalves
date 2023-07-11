package calculo;

public class NotasAlunos {
    public float media (float nota1, float nota2, float nota3, float nota4) {
        float somaDasNotas = nota1 + nota2 + nota3 + nota4;
        float mediaNotas = somaDasNotas / 4;

        return mediaNotas;
    }
}
