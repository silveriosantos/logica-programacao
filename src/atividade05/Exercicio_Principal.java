package atividade05;

public class Exercicio_Principal {
    public static void main(String[] args) {
        Carros c1 = new Carros();
        c1.marca = "Fiat";
        c1.modelo = "Palio";
        c1.printStatus();
        c1.acelerar(30);
        c1.freando(20);
    }

}
