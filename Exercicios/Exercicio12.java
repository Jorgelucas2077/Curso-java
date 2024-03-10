package Exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua altura:");
        double altura = scan.nextDouble();

        System.out.println("Digite seu peso:");
        double peso = scan.nextDouble();

        double pesoAltura = Math.pow (altura, 2);

        double IMC = (peso/pesoAltura);

        System.out.println("O peso ideal é:"+" "+ IMC);
        scan.close();
    }
}
