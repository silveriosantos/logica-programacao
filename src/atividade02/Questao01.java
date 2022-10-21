package atividade02;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o número!");
        int numero = ler.nextInt();
        if (numero < 0) {
            System.out.println("Número menor que 0");

        } else if (numero > 0) {
            System.out.println("Número maior que 0 ");

        } else {
            System.out.println("Número igual que 0");
        }
        ler.close();

    }

}

// 1. Escreva um programa que leia um número e escreva na tela se o número é
// menor, igual ou maior que zero
