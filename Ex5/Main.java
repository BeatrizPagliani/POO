package Ex5;

public class Main {
    public static void main(String[] args) {
        Departamento departamento = new Departamento(12, "Sara");
        Funcionario f = new Funcionario(860053, "Roberto", departamento);
        System.out.println(f);
    }
}
