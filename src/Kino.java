import java.util.ArrayList;


public class Kino {
    public ArrayList<Film> filme;

    public Kino(){
        this.filme = new ArrayList<Film>();
    }


    public void spieleFilme(){
        ladeFilme();

        for (Film film: this.filme) {
            System.out.println("Titel: " + film.titel);
            System.out.println("Regiseur: " + film.regiseur);
            System.out.println("Autor : " + film.autor);
            System.out.println("Laenge : " + film.laenge + " min");
            System.out.println();
        }
    }
    public void ladeFilme(){
        Film fluch = new Film(129, "Max Musterman", "Jon Doe", "Fluch der Karibik");
        Film mummy = new Film(111, "David Koepp", "Alex Kurtzman", "Die Mumie");
        Film parker = new Film(118, "John J. McLaughlin", "Taylor Hackford", "Parker");
        this.filme.add(fluch);
        this.filme.add(mummy);
        this.filme.add(parker);


    }
    public static void main(String[] args) {
        Kino kino = new Kino();
        kino.spieleFilme();
        //kino.ladeFilme();

    }
}
