package annotation;

public class PrintAnnotation {

    public static void main(String[] args) {

        Class<Usuario> usuarioClass = Usuario.class;

        if (usuarioClass.isAnnotationPresent(Tabela.class)) {

            Tabela tabelaAnnotation = usuarioClass.getAnnotation(Tabela.class);

            System.out.println("Nome da tabela: " + tabelaAnnotation.nome());

        } else {
            System.out.println("Nessa classe não a anotação @Tabela.");

        }
    }

}
