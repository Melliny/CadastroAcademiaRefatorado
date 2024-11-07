// AlunoServiceTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoServiceTest {
    @Test
    public void testCriarAluno() {
        AlunoView view = new AlunoView();
        AlunoService service = new AlunoService(view);
        Aluno aluno = service.criarAluno();

        assertNotNull(aluno);
        assertEquals("Nome Teste", aluno.getNome()); // Exemplo de nome para teste
        assertEquals(20, aluno.getIdade()); // Exemplo de idade para teste
        assertEquals("Plano Teste", aluno.getPlano()); // Exemplo de plano para teste
    }
}
