package Exercicio;

import java.util.Scanner;

public class Exercicio7 {
public static void main (String[]args){
Scanner scan = new Scanner (System.in);

System.out.println("Digite um lado do quadrado:");
double lado = scan.nextDouble();

double area = Math.pow(lado, 2);

System.out.println("A area do quadrado é:" + area);
System.out.println("O dobro da area do quadrado é:" + (area * 2));

scan.close();
}
}
