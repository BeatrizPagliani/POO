package Ex4;

public class Cliente {
    String nome;
    String rg;
    String cpf;
    Telefone telefone;
    DataNascimento data;
    Endereco endereco;

    Cliente(String name, String rg, String cpf, Telefone telefone, DataNascimento Dta, Endereco endereco ){
        this.nome = name;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data = Dta;
        this.endereco = endereco;

        

    }

    public String toString(){
        return "Nome:" + nome +
                "\nRG:" + rg + 
                "\nCPF:" + cpf +
                "\nTelefone:" + telefone +
                "\nData de Nascimento:" + data +
                "\nEndereço:" + endereco;
    }
    
}
