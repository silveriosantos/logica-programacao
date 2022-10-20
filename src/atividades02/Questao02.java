package atividades02;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Digite o primeiro número");
        num1 = ler.nextInt();
        System.out.println("Digite o segundo número");
        num2 = ler.nextInt();
        System.out.println("Digite o terceiro número");
        num3 = ler.nextInt();

        if ((num1 > num2) && (num1 > num3)) {
            System.out.println(" O número " + num1 + " é maior");
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println(" o numero " + num2 + " é maior");
        } else {
            System.out.println(" o numero " + num3 + " é maior ");
        }

        // COMPARAÇÃO NÚMERO MENOR

        if ((num1 < num2) && (num1 < num3)) {
            System.out.println(" O número " + num1 + " é menor");
        } else if ((num2 < num1) && (num2 < num3)) {
            System.out.println(" o numero " + num2 + " é menor");
        } else {
            System.out.println(" o numero " + num3 + " é menor");
        }

    }

}

// 2. Escreva um programa que receba três inteiros e diga qual deles é o maior e
// qual o menor.
