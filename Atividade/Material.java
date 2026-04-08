package Atividade;

public abstract class Material implements Exibivel{

    protected int codigo;
    protected String titulo;
    protected int ano;
    protected int quantidade;

    public Material(int codigo, String titulo, int ano, int quantidade) {
            
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = ano;
        this.quantidade = quantidade;
    }
    
    public boolean disponivel(){
        return quantidade > 0;
    }

    public void emprestar(){
        quantidade--;
    }

    public void devolver(){
        quantidade++;
    }
    
}
