package atividade01;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor da conta a ser dividido = ");
        float valorConta = ler.nextFloat();

        System.out.println("Digite a quantidade de pessoas = ");
        float qtPessoas = ler.nextFloat();

        float resultado = valorConta / qtPessoas ;

        System.out.println("O valor a ser dividido por pessoa sera de = "+resultado);

        // ler.close();
    }
    
}
