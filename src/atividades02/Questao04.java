package atividades02;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num ;
        System.out.println("Digite sua idade");
        num = ler.nextInt();

        if (num >=18) {
            System.out.println("Você pode Dirigir ");            
        } else {
            System.out.println("Você não pode Dirigir , var para a auto escola! ");
            
        }
    }
}

// 4. Escreva um programa que solicita a idade de uma pessoa e verifica se ela pode dirigir (idade>=18).
