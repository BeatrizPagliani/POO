package Atividade;

public class Revista extends Material {

    private int edicao;

    public Revista(int codigo, String titulo, int ano, int quantidade, int edicao) {
        super(codigo, titulo, ano, quantidade);
        this.edicao = edicao;
    }

    @Override
    public String exibirResumo() {
        return "Revista: " + titulo + " - edição " + edicao;
    }
}