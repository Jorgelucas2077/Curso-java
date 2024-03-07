package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[]args){
        Scanner somarScanner = new Scanner(System.in);

        int num1;
        int num2;
        int resultado;

        System.out.println("Digite o primeiro número:");
        num1 = somarScanner.nextInt();

        System.out.println("Digite o segundo número:");
        num2 = somarScanner.nextInt();

        resultado = num1 + num2;

        System.out.println("O resultado dos números digitados foi:" +"\b\n" + resultado);
        somarScanner.close();
    }
}
