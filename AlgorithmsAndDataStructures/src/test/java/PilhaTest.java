import domain.Pilha;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilhaTest {

    Pilha p = new Pilha();

    @Test
    public void testPilhaVazia() {
        assertTrue(p.isEmpty());
    }

    @Test
    public void testInserirElementosNaPilha() {
        p.push(5);
        p.push(6);
        p.push(7);
        p.push(8);

        assertFalse(p.isEmpty());
        assertEquals(4, p.size());
    }
}
