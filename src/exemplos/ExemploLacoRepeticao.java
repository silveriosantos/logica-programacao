package exemplos;

public class ExemploLacoRepeticao {
    public static void main(String[] args) {
        int contar = 1 ;
        while(contar <= 10){
            System.out.print(contar);
            System.out.println(" < dentro do loop While");
            contar++;   
       } 
       
       do{
           contar--;
           System.out.print(contar);
           System.out.println(" < Dentro do loop do-while");
       }while(contar > 1);
       // 1-star da variavel; 2-condição da repetição; forma do incremento
       for(int i = 1; i < 10; i++){
        System.out.print(i);
        System.out.println(" < Dentro do loop for");
       }
           
     }          
}
