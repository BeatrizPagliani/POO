package Estudo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FuncionarioX> funcionarioXs = new ArrayList<>();

        funcionarioXs.add(new GerenteX("Alice", 9300, "TI"));
        funcionarioXs.add(new DesenvolvedorX("Carlos", 7500, "Java"));
        funcionarioXs.add(new FuncionarioX("Dani", 3800));

        for(FuncionarioX f: funcionarioXs){
            double bonus;

            if(f instanceof GerenteX){
                bonus = ((GerenteX) f).calcularBonusGerente();
            } else if (f instanceof DesenvolvedorX){
                bonus = ((DesenvolvedorX) f).calcularBonusDesenvolvedor();
            } else {
                bonus = f.calcularBonus();
            }

            System.out.println("Nome:" + f.getNome());
            System.out.println("Salário: R$" + f.getSalario());
            System.out.println("Bônus: R$" + bonus);
            System.out.println("ID:" + f.getId());
            System.out.println("----------------------------");
        }
        System.out.println("Total de funcioários criados: " + FuncionarioX.getTotalFuncionarios());
    }
    
}
