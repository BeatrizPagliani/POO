package Atividade;

public class Livro extends Material {
    private String autor;

    public Livro(int codigo, String titulo, int ano, int quantidde, String autor){
        super(codigo, titulo, ano, quantidde);
        this.autor = autor;
    }

    @Override
    public String exibirResumo(){
        return "Livro: " + titulo + " - " + autor;
    }
    
}
