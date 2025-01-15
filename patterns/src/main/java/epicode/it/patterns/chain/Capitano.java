package epicode.it.patterns.chain;

import lombok.Data;

@Data
public class Capitano extends Ufficiale {

    public Capitano() {
        this.setGrado(Grado.CAPITANO);
    }

    @Override
    public String stampa() {
        return getGrado().toString() + " " + super.stampa();
    }

    @Override
    public double getStipendio() {
        return 2000;
    }
}
