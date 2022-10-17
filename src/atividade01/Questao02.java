package atividade01;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = ler.nextInt();
        
        
        int antecessor = numero - 1;
        int sucessor = numero + 1; 

        System.out.println("Numero Digitado = "+numero);
        System.out.println("Numero antecessor = "+antecessor);    
        System.out.println("Numero sucessor = "+sucessor);
    
        ler.close();


    }
}

