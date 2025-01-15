package epicode.it.patterns.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Libro extends Componente{
    private List<Autore> autori = new ArrayList<>();
    private List<Sezione> sezioni = new ArrayList<>();

    @Override
    public void stampa() {
        System.out.println("Titolo libro: " + getTitolo());
        System.out.println();
        System.out.println("Autori:");
        for (Autore autore : autori) {
            autore.stampa();
        }
        System.out.println();
        for(Sezione s : sezioni) {
            s.stampa();
        }
    }

    @Override
    public int count() {
        return sezioni.stream().map(Sezione::count).reduce(0, Integer::sum);
    }
}
