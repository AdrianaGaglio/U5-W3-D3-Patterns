package epicode.it.patterns.chain;

import lombok.Data;

@Data
abstract public class Ufficiale {
    private String nome;
    private String cognome;
    private Grado grado;
    private double stipendio;
    private Ufficiale ufficialeSuccessivo;


    public String stampa() {
        return getNome() + " " + getCognome() + " -  Stipendio: " + getStipendio() + " - Ufficiale successivo: " + getNomeCompleto();
    }

    public Ufficiale getUfficialeSuccessivo() {
        if (ufficialeSuccessivo == null) {
            throw new RuntimeException("Ufficiale non trovato");
        }
        return ufficialeSuccessivo;
    }

    public String getNomeCompleto() {
        return getNome() + " " + getCognome();
    }

    public Ufficiale verifica(double stipendioMin) {
        if (getStipendio() >= stipendioMin) {
            return this;
        }
        return null;
    }
}


