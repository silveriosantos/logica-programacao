package atividade03;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num = 0;
        int num1 =0;

        for(int i =1;i <= 5;i=i+1){
            System.out.print("Digite a idade: ");
            int idade = ler.nextInt();
            
           
            if(idade >= 18){
            num++;

        }else{
            num1++;

        }
        
        }
        System.out.println("Quantidade pessosa com idade maior ou igual a 18 anos são  " + num +" e num menores de 18 anos são: "+num1);

    ler.close();
    }
}

        
    