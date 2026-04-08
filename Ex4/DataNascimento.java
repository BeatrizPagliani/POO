package Ex4;

public class DataNascimento {
    int dia;
    int mes;
    int ano;

    DataNascimento(int x, int y, int z){
        this.dia = x;
        this.mes = y;
        this.ano = z;
    }
    
        public String toString(){
            return dia + "/" + mes + "/" + ano;
        }
}
