package atividade03;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {

        int contador = 1;
        int numeroDigitado;

        Scanner input = new Scanner(System.in);
        System.out.println("digite o valor da tabuada:");
        numeroDigitado = input.nextInt();
        while (contador <= 10) {
            System.out.println(numeroDigitado + " X " + contador + " = " + contador * numeroDigitado);
            contador++;

        }

    }
}
