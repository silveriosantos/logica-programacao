package atividade01;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do trabalhador = ");
        String name = ler.nextLine();

        System.out.println("Digite o Valor da hora = ");        
        float hour = ler.nextFloat();

        System.out.println("Digite quantas horas foi trabalhada = ");
        float Hwork = ler.nextFloat();

        float resultHours = hour * Hwork;
        
        System.out.println("Calculo sobre o trabalhador");
        System.out.println("O trabalhador = "+name);
        System.out.println("O trabalhador recebera pela horas trabalhadas = "+resultHours);

        ler.close();

    



    }
    
}
