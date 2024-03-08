package Exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner tempScanner = new Scanner(System.in);

        System.out.println("Digite o valor de temperatura de Farenheit:");
        double Farenheit = tempScanner.nextDouble();

        double Celsius = (5 *(Farenheit-32)/9);

        System.out.println("O valor convertido para Celsius é:" +" "+ Celsius);

        tempScanner.close();
    }
}
