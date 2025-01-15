package epicode.it.patterns.adapter;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class Info {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;

}
