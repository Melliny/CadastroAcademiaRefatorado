// Main.java
public class Main {
    public static void main(String[] args) {
        AlunoView view = new AlunoView();
        AlunoService service = new AlunoService(view);

        System.out.println("Bem-vindo ao sistema de cadastro de alunos da academia!");

        // Criar um novo aluno
        Aluno aluno = service.criarAluno();

        // Exibir dados do aluno
        System.out.println("\nCadastro realizado:");
        service.exibirAluno(aluno);
    }
}
