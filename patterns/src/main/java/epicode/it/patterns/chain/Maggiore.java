package epicode.it.patterns.chain;

import lombok.Data;

@Data
public class Maggiore extends Ufficiale {

    public Maggiore(){
        this.setGrado(Grado.MAGGIORE);
    }

    @Override
    public String stampa() {
        return getGrado().toString() + " " + super.stampa();
    }

    @Override
    public double getStipendio() {
        return 3000;
    }
}
