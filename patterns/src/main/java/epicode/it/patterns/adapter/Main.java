package epicode.it.patterns.adapter;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        UserData userData = new UserData();
        userData.setNomeCompleto("Giuseppe Rossi");
        userData.setEta(30);

        System.out.println(userData.getNomeCompleto() + " ha " + userData.getEta() + " anni.");

        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");
        info.setDataDiNascita(LocalDate.of(1980, 1, 1));

        InfoAdapter infoAdapter = new InfoAdapter(info);
        System.out.println(infoAdapter.getNomeCompleto() + " ha " + infoAdapter.getEta() + " anni.");

    }
}
