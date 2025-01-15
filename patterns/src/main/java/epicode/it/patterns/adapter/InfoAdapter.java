package epicode.it.patterns.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
public class InfoAdapter implements IDataSource {
    private Info info;



    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        return LocalDate.now().getYear() - info.getDataDiNascita().getYear();
    }
}
