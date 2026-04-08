package Ex4;

public class Telefone {
    int ddd;
    int numeroBasic;

    Telefone(int ddd, int nb){
        this.ddd = ddd;
        this.numeroBasic = nb;

    }
    
    public String toString(){
        return "(" + ddd + ")" + numeroBasic;
    }
    
}
