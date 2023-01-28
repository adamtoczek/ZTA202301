package movielibrary;

import java.util.Objects;

public class Actor {
    public String imie;
    public String nazwisko;

    public Actor(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return imie.equals(actor.imie) && nazwisko.equals(actor.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko);
    }
}
