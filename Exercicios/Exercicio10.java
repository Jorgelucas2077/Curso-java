package Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner tempScanner = new Scanner(System.in);

        System.out.println("Digite o valor em Celsius:");
        double TC = tempScanner.nextDouble();

        double TF = ((TC * 1.8) +32);
        
        System.out.println("O valor de Celsius convertido em Fahrenheit é:"+" "+ TF );
        tempScanner.close();
    }
}
