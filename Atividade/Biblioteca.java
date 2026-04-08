package Atividade;

import java.util.*;

public class Biblioteca {

    private List<Usuario> usuarios = new ArrayList<>();
    private List<Material> materiais = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    private int contador = 1;

    public void cadastrarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public void cadastrarMaterial(Material m) {
        materiais.add(m);
    }

    public Usuario buscarUsuario(int cod) {
        return usuarios.stream()
                .filter(u -> u.codigo == cod)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public Material buscarMaterial(int cod) {
        return materiais.stream()
                .filter(m -> m.codigo == cod)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Material não encontrado"));
    }

    public Emprestimo buscarEmprestimo(int id) {
        return emprestimos.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Empréstimo não encontrado"));
    }

    public int contarAtivos(Usuario u) {
        return (int) emprestimos.stream()
                .filter(e -> !e.estaFinalizado() && e.getUsuario().equals(u))
                .count();
    }

    public void realizarEmprestimo(int codUsuario, int codMaterial) {

        Usuario u = buscarUsuario(codUsuario);
        Material m = buscarMaterial(codMaterial);

        if (!m.disponivel()) throw new RuntimeException("Material indisponível");
        if (contarAtivos(u) >= u.getLimiteEmprestimos())
            throw new RuntimeException("Limite atingido");

        emprestimos.add(new Emprestimo(contador++, u, m));

        System.out.println("Empréstimo realizado!");
    }

    public void registrarDevolucao(int id) {
        Emprestimo e = buscarEmprestimo(id);

        if (e.estaFinalizado())
            throw new RuntimeException("Já devolvido");

        e.devolver();
        System.out.println("Devolução realizada!");
    }

    public void listarUsuarios() {
        usuarios.forEach(u -> System.out.println(u.exibirResumo()));
    }

    public void listarMateriais() {
        materiais.forEach(m -> System.out.println(m.exibirResumo()));
    }

    public void listarEmprestimosAtivos() {
        emprestimos.stream()
                .filter(e -> !e.estaFinalizado())
                .forEach(e -> System.out.println(e.exibirResumo()));
    }

    public void listarEmprestimosFinalizados() {
        emprestimos.stream()
                .filter(Emprestimo::estaFinalizado)
                .forEach(e -> System.out.println(e.exibirResumo()));
    }
}