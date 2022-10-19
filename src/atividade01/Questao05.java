package atividade01;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor de um jantar = ");
        float valor = ler.nextFloat();

        float taxa = valor / 10;
        float total = taxa + valor;

        System.out.println("O valor taxa garcom = " +taxa);
        System.out.println("O valor total a ser pago sera de = " +total);

        // ler.close();


        
        

      }
    
}
