package atividade01;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        String escolha = "";
        Scanner entrada = new Scanner(System.in);
        while(!escolha.equals("x")){
            System.out.println("-- Escolha a questão! --");
            System.out.println("a) Questão 01");
            System.out.println("b) Questão 02");
            System.out.println("c) Questão 03");
            System.out.println("d) Questão 04");
            System.out.println("e) Questão 05");
            System.out.println("f) Questão 06");            
            System.out.println("x) Para encerrar");

            escolha = entrada.nextLine();
            // ler.close();
            switch (escolha) {
                case "a":
                    System.out.println("a)-- Questão 01 --");
                    Questao02.main(args);              
                    break;
                    case "b":
                    System.out.println("a)-- Questão 02 --");
                    Questao02.main(args);              
                    break;
                    case "c":
                    System.out.println("a)-- Questão 02 --");
                    Questao03.main(args);              
                    break;
                    case "d":
                    System.out.println("a)-- Questão 03 --");
                    Questao04.main(args);              
                    break;
                    case "e":
                    System.out.println("a)-- Questão 04 --");
                    Questao05.main(args);              
                    break;
                    case "f":
                    System.out.println("a)-- Questão 05 --");
                    Questao06.main(args);              
                    break;
                              
                default:
                System.out.println("Escolha outra Opção");
                    break;
            }         

        }
        entrada.close();
    }
    
}
