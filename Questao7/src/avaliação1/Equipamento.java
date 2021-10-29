package avaliação1;

public class Equipamento {

    private boolean ligado; // indicativo de equipamento ligado (true) ou desligado (false)

    public Equipamento() {
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        setLigado(true);
    }

    public void desligar() {
        setLigado(false);
        
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}
