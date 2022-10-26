package TodosExemplos.Exemplos;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Exemplo IO");
        System.out.println("Digite um número");
        int myNum1 = ler.nextInt();
        System.out.println("Digite outro número");
        int myNum2 = ler.nextInt();
        ler.close();
        int r = myNum1 + myNum2;
        System.out.println("O resultado da soma =" + r);
        // ler.close();


    }
}
