package Atividade;

public class Main {

    public static void main(String[] args) {

        Biblioteca b = new Biblioteca();

        Usuario aluno = new Aluno(1, "Ana", "ana@email");
        Usuario prof = new Professor(2, "Carlos", "carlos@email");

        b.cadastrarUsuario(aluno);
        b.cadastrarUsuario(prof);

        Material l1 = new Livro(1, "Java Básico", 2020, 1, "Autor X");
        Material l2 = new Livro(2, "Estruturas", 2021, 1, "Autor Y");
        Material r = new Revista(3, "Tech", 2023, 1, 10);
        Material e = new Ebook(4, "POO", 2022, 1, "PDF", "5MB");

        b.cadastrarMaterial(l1);
        b.cadastrarMaterial(l2);
        b.cadastrarMaterial(r);
        b.cadastrarMaterial(e);

        b.listarUsuarios();
        b.listarMateriais();

        b.realizarEmprestimo(1, 1);
        b.realizarEmprestimo(1, 2);
        b.realizarEmprestimo(1, 3);

        try {
            b.realizarEmprestimo(1, 4);
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }

        b.listarEmprestimosAtivos();

        b.registrarDevolucao(1);

        Emprestimo emp = b.buscarEmprestimo(1);
        System.out.println("Multa: " + emp.calcularMulta());

        b.listarEmprestimosFinalizados();
    }
}
