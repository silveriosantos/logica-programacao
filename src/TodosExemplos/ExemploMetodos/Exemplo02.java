package TodosExemplos.ExemploMetodos;

public class Exemplo02 {
    public static void main(String[] args) {
        Exemplo01.boasVindas();
        Exemplo01.ateLogo();
        int[] numeros = {1,1,1};
        Exemplo01.somarNumeros(numeros);
        numeros[0] = 2;
        numeros[1] = 2;
        numeros[2] = 2;
        Exemplo01.somarNumeros(numeros);
        int[] aleatorio = {3,7,9,2,41,2,4};
        System.out.println(Exemplo01.maior(aleatorio));
        System.out.println(Exemplo01.menor(aleatorio));
    }
}
