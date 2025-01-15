package epicode.it.patterns.composite;

import lombok.Data;

@Data
public class Autore {
    private String nome;
    private String cognome;

    public String getAutore() {
        return getNome() + " " + getCognome();
    }

    public void stampa() {
        System.out.println(getAutore());
    }
}
