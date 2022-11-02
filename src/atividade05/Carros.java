package atividade05;

public class Carros {

    String marca;
    String modelo;    
    int velocidade;
    

   
   public void acelerar (int a){
        velocidade = velocidade + a;
        if (velocidade > 200) {
            System.out.println("Velocidade acima do normal.");
            velocidade = 200;
        } else {
            System.out.println("A velocidade atual do veiculo acelerando e: " + velocidade + " km/h.");
        }        

    }

    void freando(int f) {
        velocidade = velocidade - f;
        if (velocidade < 0) {
            System.out.println("Velocidde abaixo de 0 km/h");
            velocidade = 0;            
        } else {
            System.out.println("A velocidade atual do veiculo na frenagem e de: " + velocidade + " km/h.");            
        }
        
    }  

    

    void printStatus() {
        System.out.println("A Marca do Veiculo é: \n" + this.marca);
        System.out.println("O Modelo do Veiculo é \n" + this.modelo);        
    }

}
