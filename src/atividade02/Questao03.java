package atividade02;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num ;
        System.out.println("Digite sua idade");
        num = ler.nextInt();
        
        if (num < 16) {
            System.out.println("Você já pode Votar");            
        } else {
            System.out.println("Você não pode Votar");            
        }
        ler.close();
    }
}

// 3. Escreva um programa que solicita a idade de uma pessoa e verifica se ela pode votar (idade>=16).
