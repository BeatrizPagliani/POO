package Atividade;

public class Aluno extends Usuario {
    
    public Aluno(int codigo, String nome, String email){
        super(codigo, nome, email);
    }

    public int getLimiteEmprestimos() {return 3;}
    public int getPrazoDias() {return 7;}
    public double getMultaDiaria() {return 2.5;}
    public String getTipo() {return "Aluno";}
    
}
