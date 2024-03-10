package Exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main (String[]args){
    Scanner valorScanner = new Scanner(System.in);

        System.out.println("Quanto se ganha por hora?");
        double r$HV = valorScanner.nextDouble();
        
        System.out.println("Quantas horas são trabalhadas por dia?");
        double r$H = valorScanner.nextDouble();

        double salarioBruto = ((r$HV * r$H)*24); 

        double valorINSS = ((salarioBruto /100) * 8);

        double valorSindicato = ((salarioBruto /100) *5);

        double salarioLiquido = ((salarioBruto - valorINSS)- valorSindicato);

        System.out.println("O salario bruto é:"+" "+ salarioBruto);
        System.out.println("Foi pago"+" "+valorINSS+" "+"para o INSS");
        System.out.println("Foi pago"+" "+ valorSindicato +" "+"para o sindicato");
        System.out.println("O valor líquido do salario é:"+" "+"R$"+" "+salarioLiquido);
        valorScanner.close();
    }
}
