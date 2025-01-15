package epicode.it.patterns.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Sezione extends Componente {
    private List<Pagina> pagine = new ArrayList<>();
    private List<Sezione> sottosezioni = new ArrayList<>();

    @Override
    public void stampa() {
        System.out.println("Titolo sezione: " + getTitolo());
        for(Pagina p : pagine) {
            p.stampa();
            for (Sezione s : p.getSezioni()) {
                s.stampa();
            }
        }
        for(Sezione s : sottosezioni) {
            s.stampa();
        }
    }

    @Override
    public int count() {
        return pagine.size() + sottosezioni.stream().map(Sezione::count).reduce(0, Integer::sum);
    }

}
