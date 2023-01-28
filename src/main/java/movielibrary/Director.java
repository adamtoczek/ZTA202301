package movielibrary;

public class Director {
    public String imie;
    public String nazwisko;

    public Director(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }
}
