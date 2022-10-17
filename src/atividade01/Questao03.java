package atividade01;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um nome");
        String name = ler.nextLine();

        System.out.println("Olá "+name);

        ler.close();
        
    }
    
}
