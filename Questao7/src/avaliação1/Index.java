/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliação1;

import java.util.Scanner;
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
        Scanner ent = new Scanner(System.in);
        Equipamento y = new Equipamento();
        EquipamentoSonoro[] equipamentos = new EquipamentoSonoro[6];

        for (int i = 0; i < 6; i++) {
            EquipamentoSonoro x = new EquipamentoSonoro();
            equipamentos[i] = x;
        }
        boolean valido = true;
        boolean permanecer = true;
        int a = 0;
        while (valido) {
            try {
                a = Integer.parseInt(JOptionPane.showInputDialog("Qual equipamento sonoro você deseja modificar (1 a 6):"));
                a--;
                permanecer = true;
                while (permanecer) {

                    if (a < 6 && a > -1) {
                        String option = JOptionPane.showInputDialog("1 - Ligar \n 2 - Desligar \n 3- Aumentar Volume \n 4 - Diminuir Volume"
                                + "\n 5 - Fechar programa \n 6 - Trocar aparelho");
                        switch (option) {
                            case "1":
                                if (!equipamentos[a].isLigado()) {
                                    equipamentos[a].ligar();
                                    JOptionPane.showMessageDialog(null, "Aparelho " + (a + 1) + " foi ligado.");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Seu equipamento já está ligado");
                                }
                                break;
                            case "2":
                                if (equipamentos[a].isLigado()) {
                                    equipamentos[a].desligar();
                                    JOptionPane.showMessageDialog(null, "Aparelho " + (a + 1) + " foi desligado.");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Seu equipamento já está desligado");
                                }
                                break;
                            case "3":
                                if (equipamentos[a].isLigado()) {
                                    equipamentos[a].aumentarVolume();
                                } else {
                                    JOptionPane.showMessageDialog(null, "Não é possivel alterar o volume, pois seu equipamento está desligado");
                                }
                                break;
                            case "4":
                                if (equipamentos[a].isLigado()) {
                                    equipamentos[a].diminuirVolume();
                                } else {
                                    JOptionPane.showMessageDialog(null, "Não é possivel alterar o volume, pois seu equipamento está desligado");
                                }
                                break;
                            case "5":
                                valido = false;
                                permanecer = false;
                                JOptionPane.showMessageDialog(null, "Fechando programa.");
                                break;
                            case "6":
                                permanecer = false;
                                JOptionPane.showMessageDialog(null, "Mudando equipamento.");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente!");
                                break;

                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente!");
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente!");
            }

        }
        String relatorio = "";
        int prejudiciais = 0;
        for (int i = 0; i < 6; i++) {
            if (equipamentos[i].isLigado()) {
                relatorio += "\n Aparelho de número " + (i + 1) + " está ligado com o volume " + equipamentos[i].getVolume();
                if (equipamentos[i].getVolume() > 7) {
                    prejudiciais++;
                }
            } else {
                relatorio += "\n Aparelho de número " + (i + 1) + " está desligado com o volume " + equipamentos[i].getVolume();
            }
        }
        relatorio += "\n A quantidade de aparelhos prejudiciais é " + prejudiciais + "\n Correspondendo a " + ((prejudiciais * 100) / 6)
                + " % do total de aparelhos.";
        JOptionPane.showMessageDialog(null, relatorio);

    }

}
