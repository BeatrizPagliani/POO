package Ex2;
public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;
    
    Triangulo(int x){
        this.lado1 = x;
        this.lado2 = x;
        this.lado3 = x;

    }
    Triangulo(int x, int y){
        this.lado1 = x;
        this.lado2 = x;
        this.lado3 = y;
    }
    Triangulo(int x, int y, int z){
        this.lado1 = x;
        this.lado2 = y;
        this.lado3 = z;

    }
    public int perimetro(){
        return lado1 + lado2 + lado3;
    }
    void tipoTriangulo(){
        if(lado1 == lado2 && lado1 == lado3){
            System.out.println("Triangulo equilátero");
        } 
        else if(lado1 != lado2 && lado2 != lado3){
            System.out.println("Triangulo isoceles");

        }
        else{
            System.out.println("Triangulo escaleno");
        }

    }

    void info(){
        System.out.println("Lados" + lado1 + ", " + lado2 + ", " + lado3);
        System.out.print("o tipo:");
        tipoTriangulo();
        System.out.println("Perimetro" + perimetro());

    }


    
    
}
