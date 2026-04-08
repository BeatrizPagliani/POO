package Ex5;

public class Departamento {
    private int codigo;
    private String nome;
    
    public Departamento(int codigo, String nome){
        if(codigo > 0 && nome != null){
            this.codigo = codigo;
            this.nome = nome;
        } else{
            System.out.println("Digite os números certos!");
        }

    }

    public int getCodigo(){
        return codigo;

    }

    public void setCodigo(int codigo){
        this.codigo = codigo;

    }

    public String getNome(){
        return nome;
    }


    public String toString(){
        return " Nome: " + nome +
                "\nCodigo: " + codigo;
    }

    
}
