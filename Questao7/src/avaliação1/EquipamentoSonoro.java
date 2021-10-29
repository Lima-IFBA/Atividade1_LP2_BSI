/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliação1;

import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class EquipamentoSonoro extends Equipamento {

    
    private int volume;

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void aumentarVolume() {
        if (this.volume < 10) {
            this.volume += 1;
            JOptionPane.showMessageDialog(null, "Volume aumentado para: " + this.volume);
        } else {
            JOptionPane.showMessageDialog(null, "O volume máximo foi atingido.");
        }
    }

    public void diminuirVolume() {
        if (this.volume > 0) {
            this.volume -= 1;
            JOptionPane.showMessageDialog(null, "Volume diminuído para: " + this.volume);
        } else {
            JOptionPane.showMessageDialog(null, "O volume mínimo foi atingido.");
        }
    }
    
    @Override
    public void desligar(){
        super.desligar();
        volume = 0;
    }

}
