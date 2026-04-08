package Ex3;

public class Main {
    public static void main(String[] args) {
        //Iphone 12, tela de 6.1", 256gb
        // Galaxy Note 20 Ultra, tela 6.9", 256gb
        // Xiaomi Mi 11 Pro, tela 6.81", 128gb
        //<tipoVariavel> nomeVariavel = valor;

        //declarando um objeto do tipo Celular = instanciando um onjeto (criando)
        Celular cA = new Celular();
        cA.nome = "iphone 12";
        cA.tamanhoTela = 6.1f; 
        cA.espacoArmazenamento = 256; 
        cA.sistemaOperacional = "IOS"; 
        //"Celular" + cA.nome + "com tela de" + ca.tamanhoTela + ", com %d e SO %s"...
        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s", cA.nome, cA.tamanhoTela, cA.espacoArmazenamento,cA.sistemaOperacional);
    }
    
}
