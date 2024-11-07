// AlunoView.java - Refatorado
import java.util.Scanner;

public class AlunoView {

    public String getNome() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o nome do aluno: ");
            return scanner.nextLine();
        }
    }

    public int getIdade() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a idade do aluno: ");
            return scanner.nextInt();
        }
    }

    public String getPlano() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o plano do aluno: ");
            return scanner.nextLine();
        }
    }

    public void mostrarAluno(Aluno aluno) {
        System.out.println(aluno.toString());
    }
}
