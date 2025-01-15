package epicode.it.patterns.adapter;

import lombok.Data;

@Data
public class UserData implements IDataSource {
    private String nomeCompleto;
    private int eta;
}
