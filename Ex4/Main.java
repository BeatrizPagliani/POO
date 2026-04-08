package Ex4;

public class Main {
    public static void main(String[] args) {
        Endereco e = new Endereco("Rua geturio vargas", "Janga", "Paulista", 479, "Pernambuco");
        DataNascimento dn = new DataNascimento(16, 05, 2007);
        Telefone t = new Telefone(81, 983568332);
        Cliente client = new Cliente("Beatriz", "11727134", "153.038.794-96", t, dn, e);

        System.out.println(client);
    }
    
}
