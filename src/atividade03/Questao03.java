package atividade03;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 

            int num1;
            System.out.println("Digite um número");
            num1 = ler.nextInt();
            int num2;
            System.out.println("Digite outro número");
            num2 = ler.nextInt();

            do {
                num1++;
                System.out.println("Os números entre eles são : "+num1);
            } while (num1 < (num2 - 1));
        }
    
    }

