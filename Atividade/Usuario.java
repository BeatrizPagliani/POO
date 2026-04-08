package Atividade;

public abstract class Usuario implements Exibivel{
    protected int codigo;
    protected String nome;
    protected String email;

    public Usuario(int codigo, String nome, String email){
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
    }

    public abstract int getLimiteEmprestimos();
    public abstract int getPrazoDias();
    public abstract double getMultaDiaria();
    public abstract String getTipo();

    @Override
    public String exibirResumo(){
        return "Usuário: " + nome + " (" + getTipo() + ")";
    }
    
}
