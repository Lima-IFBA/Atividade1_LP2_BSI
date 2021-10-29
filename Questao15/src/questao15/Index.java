/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao15;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> inteiros = new ArrayList<>();

        String nomeCompleto = JOptionPane.showInputDialog("Insira uma sequência de caracteres separados por virgúla");

        String[] variaveis = nomeCompleto.split(",");
        
        String relatorio = "";
        int soma = 0;
        boolean valido = true;
        for (int i = 0; i < variaveis.length; i++) {

            try {
                int numero = Integer.parseInt(variaveis[i]);
                inteiros.add(numero);
                relatorio += "\n Número digitado: " + variaveis[i];
            } catch (Exception ex) {
                valido = false;
            }

        }
        if (valido) {
            for (int i = 0; i < inteiros.size(); i++) {
                System.out.println(inteiros.get(i));
                soma += inteiros.get(i);
            }
            JOptionPane.showMessageDialog(null, relatorio + "\n A soma dos números da sequência é: " + soma);
        } else {
            JOptionPane.showMessageDialog(null, "Invalido");
        }
        
    }

}
