package atividade01;

import java.util.Scanner;

public class Questao01 {
    private static double media;

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("========== Programa Calculo de notas escolares ============");

        System.out.println("Digite a primeira nota a ser calculada ");
        double num1 = ler.nextDouble();

        System.out.println("Digite a segunda  nota a ser calculada =>");
        double num2 = ler.nextDouble();
        double soma = num1 + num2;
        media = soma / 2;    
        System.out.println("A media das duas notas e = "+media);

        if (media >= 7) {
            System.out.println("Aluno Aprovado");            
        } else if (media >=5) {
            System.out.println("Aluno em Recuperação");
        }else {
            System.out.println("Aluno Reprovado");
        }       

            // ler.close();            
        }
        
                     
    }

