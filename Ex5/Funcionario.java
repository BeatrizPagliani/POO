package Ex5;

public class Funcionario {
    int matricula;
    String nome;
    Departamento departamento;

    Funcionario(int matricula, String nome, Departamento depart){
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = depart;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public Departamento getDepartamento(){
        return departamento;
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public Departamento setDepartamento(){
        return departamento;
    }

    public String toString(){
        return "Nome: " + nome +
                 "\nMatricula: " + matricula +
                 "\nDepartamento: " + departamento;
    }


}
