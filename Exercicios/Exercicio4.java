package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[]args){
        Scanner mediaScanner = new Scanner(System.in);
        
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;

        System.out.println("Digite a primeira nota:");
        nota1 = mediaScanner.nextDouble();

        System.out.println("Digite a segunda nota");
        nota2 = mediaScanner.nextDouble();

        System.out.println("Digite a terceira nota");
        nota3 = mediaScanner.nextDouble();

        System.out.println("Digite a quarta nota");
        nota4 = mediaScanner.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        

        System.out.println("A média é:" + media);

        mediaScanner.close();
}
}
    
    