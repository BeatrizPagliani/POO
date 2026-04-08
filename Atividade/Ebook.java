package Atividade;

public class Ebook extends Material {

    private String formato;
    private String tamanho;

    public Ebook(int codigo, String titulo, int ano, int quantidade, String formato, String tamanho) {
        super(codigo, titulo, ano, quantidade);
        this.formato = formato;
        this.tamanho = tamanho;
    }

    @Override
    public String exibirResumo() {
        return "Ebook: " + titulo + " - " + formato + " (" + tamanho + ")";
    }
}
