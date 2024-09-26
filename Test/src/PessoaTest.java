import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class PessoaTest {

    @Test
    public void testListaSomenteMulheres() {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Julia", "feminino"));
        pessoas.add(new Pessoa("Arthur", "masculino"));
        pessoas.add(new Pessoa("Sarah", "feminino"));
        pessoas.add(new Pessoa("Matteo", "masculino"));


        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("feminino"))
                .collect(Collectors.toList());


        assertTrue(mulheres.stream()
                .allMatch(p -> p.getSexo().equalsIgnoreCase("feminino")));
    }
}
