package exemplos.ExemploJOptionPane;

import javax.swing.JOptionPane;

public class ExemploJOptionPane {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Java com JOptionPane");
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        JOptionPane.showMessageDialog(null, "Bem vindo " + nome);
    }
}
