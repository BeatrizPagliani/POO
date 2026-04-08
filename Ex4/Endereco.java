package Ex4;

public class Endereco {
    String Logrado;
    String bairro;
    String cidade;
    int numero;
    String estado;

    Endereco(String L, String b, String citi, int n, String es){
        this.Logrado = L;
        this.bairro = b;
        this.cidade = citi;
        this.numero = n;
        this.estado = es;

    }

    public String toString(){
        return "Logradouro" + Logrado +
               "\nBairro :" + bairro +
               "\nCidade :" + cidade +
               "\nNúmero :" + numero +
               "\nEstado :" + estado;
    }
}
