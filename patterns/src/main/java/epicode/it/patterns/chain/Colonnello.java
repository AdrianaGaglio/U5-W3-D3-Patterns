package epicode.it.patterns.chain;

import lombok.Data;

@Data
public class Colonnello extends Ufficiale {

    public Colonnello() {
        this.setGrado(Grado.COLONNELLO);
    }

    @Override
    public String stampa() {
        return getGrado().toString() + " " + super.stampa();
    }

    @Override
    public double getStipendio() {
        return 4000;
    }
}
