package epicode.it.patterns.composite;

import lombok.Data;

@Data
public class Componente {
    private String titolo;

    public void stampa() {
        System.out.println("Titolo: " + getTitolo());
    }

    public int count() {
        return 1;
    }
}
