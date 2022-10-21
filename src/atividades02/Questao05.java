package atividades02;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num ;
        System.out.println("Digite sua idade");
        num = ler.nextInt();

        if ((num < 16) || (num <= 17)) {
            System.out.println("Pode votar, mas não pode dirigir ");            
        } else if (num >= 18){
            System.out.println("Pode votar e pode dirigir ");
         }else {
            System.out.println("Não pode nem votar e nem dirigir ");
         }
    }
}

// 5. Escreva um programa que dada a idade de uma pessoa, retorna uma das
// seguintes mensagens: “Não pode nem votar e nem dirigir”, “Pode votar, mas não
// pode dirigir”, “Pode votar e pode dirigir”.
