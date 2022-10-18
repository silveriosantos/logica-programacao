package atividade01;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do trabalhador = ");
        String name = ler.nextLine();

        System.out.println("Digite o Valor da hora = ");        
        int hour = ler.nextInt();

        System.out.println("Digite quantas horas foi trabalhada = ");
        int Hwork = ler.nextInt();
        ler.close();

        int resultHours = hour * Hwork;
        
        System.out.println("Calculo sobre o trabalhador");
        System.out.println("O trabalhador = "+name);
        System.out.println("O "+name +"recebera pela horas trabalhadas = "+resultHours);

        
    }
    
}
