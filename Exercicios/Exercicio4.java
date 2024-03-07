package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[]args){
        Scanner mediaScanner = new Scanner(System.in);
        
        int nota1;
        int nota2;
        int nota3;
        int nota4;
        double media;

        System.out.println("Digite a primeira nota:");
        nota1 = mediaScanner.nextInt();

        System.out.println("Digite a segunda nota");
        nota2 = mediaScanner.nextInt();

        System.out.println("Digite a terceira nota");
        nota3 = mediaScanner.nextInt();

        System.out.println("Digite a quarta nota");
        nota4 = mediaScanner.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        

        System.out.println("A média é:" + media);

        mediaScanner.close();
}
}
    
    