package Ex6;

public class Pessoa {
    
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.idade = idade;
        this.nome = nome;

    }
    public int getIdade(){
        return idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public void setIdade(int idade){
        this.idade = idade;

    }
}
