package Atividade;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo implements Exibivel, CalculavelMulta {

    private int id;
    private Usuario usuario;
    private Material material;
   
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevista;
    private LocalDate dataDevolucao;

    public Emprestimo(int id, Usuario usuario, Material material) {
        this.id = id;
        this.usuario = usuario;
        this.material = material;

        this.dataEmprestimo = LocalDate.now();
        this.dataPrevista = dataEmprestimo.plusDays(usuario.getPrazoDias());

        material.emprestar();
    }

    public int getId() { return id; }
    public Usuario getUsuario() { return usuario; }

    public boolean estaFinalizado() {
        return dataDevolucao != null;
    }

    public void devolver() {
        if (dataDevolucao != null) {
            throw new RuntimeException("Já devolvido!");
        }
        dataDevolucao = LocalDate.now();
        material.devolver();
    }

    public long diasAtraso() {
        if (dataDevolucao == null) return 0;

        long dias = ChronoUnit.DAYS.between(dataPrevista, dataDevolucao);
        return Math.max(dias, 0);
    }

    @Override
    public double calcularMulta() {
        return diasAtraso() * usuario.getMultaDiaria();
    }

    @Override
    public String exibirResumo() {
        return "Emprestimo " + id + " - " + usuario.nome + " -> " + material.titulo;
    }
}