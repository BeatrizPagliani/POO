package Ex6;

public class PessoaJuridica extends Pessoa {
     String cnpj;

    public PessoaJuridica(String nome, int idade, String cnpj){
        super(nome, idade);
        this.cnpj = cnpj;

    }

    public String getNome(){
        return super.getNome();
    }
    
    public int getIdade(){
        return super.getIdade();
    }

    public String getCnpj(){
        return this.cnpj;
    }

    public void setNome(String nome){
        super.getNome();
    }

    public void setIdade(int idade){
        super.getIdade();
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

}
