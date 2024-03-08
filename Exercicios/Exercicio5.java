package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner converterScanner = new Scanner(System.in);

        double metroConvert;

        System.out.println("Digite quantos metros serão convertidos:");
        metroConvert = converterScanner.nextDouble();

        double centimetroConvert = metroConvert * 100;

        System.out.println(metroConvert + "m é igual a " + centimetroConvert + "cm");
        converterScanner.close();
    }
}
