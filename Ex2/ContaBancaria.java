package Ex2;
public class ContaBancaria {
    String titula;
    int numeroDaConta;
    double saldo;

    ContaBancaria(String titula, int numeroDaConta, double saldo ){
        this.titula = titula;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    void Depositar(double valor){
        System.out.println("Valor depositado com sucesso!!");
    }
    
    void Sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            System.out.println("operação realizada com sucesso!");
        } else{
            System.out.println("Algo deu errado.");
        }
    }

    void exibir(){
        System.out.println("Seu saldo" + saldo);
    }



}
