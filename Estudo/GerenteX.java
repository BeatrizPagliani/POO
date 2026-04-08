package Estudo;

public class GerenteX extends FuncionarioX {
    private String departamento;

    GerenteX(String nome, double salario, String departamento){
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    public String getNome(){
        return super.getNome();
    }

    public double getSalario(){
        return super.getSalario();
    }
    
    public double calcularBonusGerente(){
        return this.getSalario() * 0.20;
    }



        


    
}
