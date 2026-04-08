package Atividade;

public class Professor extends Usuario {

    public Professor(int codigo, String nome, String email){
        super(codigo, nome, email);
    }

    public int getLimiteEmprestimos() { return 5; }
    public int getPrazoDias() { return 14; }
    public double getMultaDiaria() { return 1.0; }
    public String getTipo() { return "Professor"; }
    
}
