package Classe;

import java.util.Scanner;

public class classeScanner {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scan.nextLine();
        //System.out.println("Seu nome completo é:" + nomeCompleto );

        System.out.println("Seu primeiro nome:");
        String primeiroNome = scan.nextLine();
        //System.out.println("Seu primeiro nome é:" + primeiroNome);    
    
        System.out.println("Digite seu segundo nome:");
        String segundoNome = scan.nextLine();
        //System.out.println("Seu segundo nome é:" + segundoNome);

        System.out.println("Seu nome completo é:" +""+ nomeCompleto + "\b\n" + "Seu primeiro nome é:" + primeiroNome + "\n" + "Seu segundo nome é:" + segundoNome );
        scan.close();
    } 

}

// Iniciar o assistente de scanner
// Scanner scan = new Scanner(System.in);

 
//Opções para ler dado no teclado

//Opção 1:

//Lendo uma linha inteira 
//String nome = scan.nextLine(); 

//Lendo dados especificos:
//String primeiroNome = scan.next();
//int idade = scan.nextInt();
//double altura = scan.nextDouble(); 