package epicode.it.patterns.chain;

import lombok.Data;

@Data
public class Generale extends Ufficiale {

    public Generale() {
        this.setGrado(Grado.GENERALE);
    }

    @Override
    public double getStipendio() {
        return 5000;
    }

    @Override
    public String stampa() {
        return getGrado().toString() + " " + super.stampa();
    }
}
