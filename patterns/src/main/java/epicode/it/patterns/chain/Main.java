package epicode.it.patterns.chain;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Faker faker = new Faker();

        Tenente tenente = new Tenente();
        tenente.setNome(faker.name().firstName());
        tenente.setCognome(faker.name().lastName());


        Capitano capitano = new Capitano();
        capitano.setNome(faker.name().firstName());
        capitano.setCognome(faker.name().lastName());
        tenente.setUfficialeSuccessivo(capitano);


        Maggiore maggiore = new Maggiore();
        maggiore.setNome(faker.name().firstName());
        maggiore.setCognome(faker.name().lastName());
        capitano.setUfficialeSuccessivo(maggiore);


        Colonnello colonnello = new Colonnello();
        colonnello.setNome(faker.name().firstName());
        colonnello.setCognome(faker.name().lastName());
        maggiore.setUfficialeSuccessivo(colonnello);


        Generale generale = new Generale();
        generale.setNome(faker.name().firstName());
        generale.setCognome(faker.name().lastName());
        colonnello.setUfficialeSuccessivo(generale);

        List<Ufficiale> ufficiali = new ArrayList<>();
        ufficiali.add(tenente);
        ufficiali.add(capitano);
        ufficiali.add(maggiore);
        ufficiali.add(colonnello);
        ufficiali.add(generale);

        try {
            List<Ufficiale> ufficialiVerificati = new ArrayList<>();
            double stipendioMin = 3000;
            for (Ufficiale ufficiale : ufficiali) {
                System.out.println(ufficiale.stampa());
                if (ufficiale.verifica(stipendioMin) != null) ufficialiVerificati.add(ufficiale);
            }
            System.out.println();
            if (ufficialiVerificati.isEmpty()) {
                System.out.println("Nessun ufficiale guadagna almeno " + stipendioMin + " euro");
            } else {
                System.out.println("Lista ufficiali che percepiscono almeno " + stipendioMin + " euro");
            }
            ufficialiVerificati.forEach(ufficiale -> System.out.println(ufficiale.stampa()));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


    }
}
