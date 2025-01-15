package epicode.it.patterns.composite;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Faker faker = new Faker(new Locale("it-IT"));

        Autore a1 = new Autore();
        a1.setNome(faker.name().firstName());
        a1.setCognome(faker.name().lastName());

        Autore a2 = new Autore();
        a2.setNome(faker.name().firstName());
        a2.setCognome(faker.name().lastName());

        Sezione sez1 = new Sezione();
        sez1.setTitolo("Sezione 1");

        List<Pagina> pagineSez1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Pagina p = new Pagina();
            p.setContenuto(faker.lorem().fixedString(10));
            pagineSez1.add(p);
        }
        sez1.getPagine().addAll(pagineSez1);

        Sezione sez2 = new Sezione();
        sez2.setTitolo("Sezione 2");

        List<Pagina> pagineSez2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Pagina p = new Pagina();
            p.setContenuto(faker.lorem().fixedString(10));
            pagineSez2.add(p);
        }
        sez2.getPagine().addAll(pagineSez2);

        Sezione sez3 = new Sezione();
        sez3.setTitolo("Sezione 3");

        List<Pagina> pagineSez3 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Pagina p = new Pagina();
            p.setContenuto(faker.lorem().fixedString(10));
            pagineSez3.add(p);
        }
        sez3.getPagine().addAll(pagineSez3);

        Libro libro = new Libro();
        libro.setTitolo(faker.book().title());
        libro.getAutori().addAll(List.of(a1, a2));
        libro.getSezioni().addAll(List.of(sez1, sez2, sez3));



        Sezione sottoSezione1 = new Sezione();
        sottoSezione1.setTitolo("Sotto sezione 1");
        List<Pagina> pagineSottoSezione1 = new ArrayList<>();

        Pagina p1 = new Pagina();
        p1.setContenuto(faker.lorem().fixedString(10));
        Sezione sezP1 = new Sezione();
        sezP1.setTitolo("Sezione 1 pagina p1");
        Sezione sezP2 = new Sezione();
        sezP2.setTitolo("Sezione 2 pagina p1");
        p1.getSezioni().addAll(List.of(sezP1, sezP2));
        pagineSottoSezione1.add(p1);

        for (int i = 0; i < 5; i++) {
            Pagina p = new Pagina();
            p.setContenuto(faker.lorem().fixedString(10));
            pagineSottoSezione1.add(p);
        }
        sottoSezione1.getPagine().addAll(pagineSottoSezione1);
        sez1.getSottosezioni().add(sottoSezione1);

        Sezione sottoSezione2 = new Sezione();
        sottoSezione2.setTitolo("Sotto sezione 2");
        List<Pagina> pagineSottoSezione2 = new ArrayList<>();

        Pagina p2 = new Pagina();
        p2.setContenuto(faker.lorem().fixedString(10));
        Sezione sezP3 = new Sezione();
        sezP3.setTitolo("Sezione 1 pagina p2");
        Sezione sezP4 = new Sezione();
        sezP4.setTitolo("Sezione 2 pagina p2");
        p2.getSezioni().addAll(List.of(sezP3, sezP4));
        pagineSottoSezione2.add(p2);

        for (int i = 0; i < 5; i++) {
            Pagina p = new Pagina();
            p.setContenuto(faker.lorem().fixedString(10));
            pagineSottoSezione2.add(p);
        }
        sottoSezione2.getPagine().addAll(pagineSottoSezione2);
        sez2.getSottosezioni().add(sottoSezione2);

        Sezione sottoSezione3 = new Sezione();
        sottoSezione3.setTitolo("Sotto sezione 3");
        List<Pagina> pagineSottoSezione3 = new ArrayList<>();

        Pagina p3 = new Pagina();
        p3.setContenuto(faker.lorem().fixedString(10));
        Sezione sezP5 = new Sezione();
        sezP5.setTitolo("Sezione 1 pagina p3");
        Sezione sezP6 = new Sezione();
        sezP6.setTitolo("Sezione 2 pagina p3");
        p3.getSezioni().addAll(List.of(sezP5, sezP6));
        pagineSottoSezione3.add(p3);

        for (int i = 0; i < 5; i++) {
            Pagina p = new Pagina();
            p.setContenuto(faker.lorem().fixedString(10));
            pagineSottoSezione3.add(p);
        }
        sottoSezione3.getPagine().addAll(pagineSottoSezione3);
        sez3.getSottosezioni().add(sottoSezione3);

        libro.stampa();
        System.out.println("Pagine totali " + libro.count());
    }

}
