package Codigos;

import java.util.Scanner;

public class somar {

    public static void main(String[]args){
        Scanner somarScanner = new Scanner (System.in);

        int somarNumero1;
        int somarNumero2;
        int somarNumero;
        
        System.out.println("Digite o seu primeiro número:");
        somarNumero1 = somarScanner.nextInt();

        System.out.println("Digite o seu segundo número:");
        somarNumero2 = somarScanner.nextInt();

        somarNumero = somarNumero1 + somarNumero2;

        System.out.println("A soma é:" + somarNumero);

        somarScanner.close();
    }
}