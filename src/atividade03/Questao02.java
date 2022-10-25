package atividade03;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int numero = 1;
        String mensagem;
        System.out.println("Digite uma mensagem");
        mensagem = ler.next();
        System.out.println("Digite quantas vezes ira repetir");
        int quantidade = ler.nextInt();

        while (numero <= quantidade) {
            numero++;
            System.out.println(mensagem);

        }
        ler.close();

    }

}
