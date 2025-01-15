package epicode.it.patterns.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Pagina extends Componente {
    private String contenuto;
    private List<Sezione> sezioni = new ArrayList<>();

    @Override
    public void stampa() {
        System.out.println("Contenuto pagina: " + getTitolo());
        for (Sezione sezione : sezioni) {
            sezione.stampa();
        }
    }

    @Override
    public String getTitolo() {
        return getContenuto();
    }
}
