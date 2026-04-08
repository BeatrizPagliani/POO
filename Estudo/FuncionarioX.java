package Estudo;

import java.util.UUID;

public class FuncionarioX {
    private String nome;
    private double salario;
    static int totalFuncionarios;
    final UUID id;

    FuncionarioX(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        this.id = UUID.randomUUID();
        totalFuncionarios++;
    }

    public String getNome(){
        return this.nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public static int getTotalFuncionarios(){
        return totalFuncionarios;
    }

    public UUID getId(){
        return id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double calcularBonus(){
        return salario * 0.10;
    }

}
