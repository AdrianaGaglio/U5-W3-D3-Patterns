package epicode.it.patterns.chain;

import lombok.Data;

@Data
public class Tenente extends Ufficiale {

    public Tenente() {
        this.setGrado(Grado.TENENTE);
    }

    @Override
    public String stampa() {
        return getGrado().toString() + " " + super.stampa();
    }

    @Override
    public double getStipendio() {
        return 1000;
    }
}
