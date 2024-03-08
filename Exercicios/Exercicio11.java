package Exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main (String[]args){
        Scanner convertScanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        int num1 = convertScanner.nextInt();

        System.out.println("Digite outro numero inteiro:");
        int num2 = convertScanner.nextInt();

        System.out.println("Digite um número real:");
        double num3 = convertScanner.nextDouble();
        double numR1 = ((num1 * 2) * num2 /2); 
        double numR2 = ((num1 * 3)+ num3);
        double numR3 = Math.pow(num3, 3);

        System.out.println("Resultado da questão A:" +" "+ numR1 + "\b\n" + "Resultado da questão B:"+" "+ numR2 + "\b\n" + "Resultado da questão C:"+" "+ numR3);
        convertScanner.close();
    }
    
}
