package Exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero do raio do circulo:");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A area do raio é:" + area);
        scanner.close();
    }

}
