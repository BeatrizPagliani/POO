package Estudo;

public class DesenvolvedorX extends FuncionarioX {
    private String linguagem;

    DesenvolvedorX(String nome, double salario, String linguagem){
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public String getLinguagem(){
        return this.linguagem;
    }
    
    public double calcularBonusDesenvolvedor(){
        return this.getSalario() * 0.15;
    }
}
