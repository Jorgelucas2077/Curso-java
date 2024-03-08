package Exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor que se ganha por horas trabalhadas no mês:");
        double calcHora = scan.nextDouble ();

        System.out.println("Quantas horas são trabalhadas no dia?");
        double calcMes = scan.nextDouble();

        double mes = (calcHora * calcMes * 24);
        
        System.out.println("O valor recebido por mês é:" + mes);

        scan.close();
    }
}
