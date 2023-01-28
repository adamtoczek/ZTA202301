import movielibrary.*;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        MovieLibrary biblioteka = new MovieLibrary();

        Actor helenka = new Actor("Helen", "Mirien");
        Actor szon = new Actor("Sean", "Connery");
        Actor tomek = new Actor("Tom", "Cruise");
        Actor meryl = new Actor("Meryl", "Streep");

        Director romek = new Director("Roman", "Polański");
        Director stasiek = new Director("Steven", "Spielberg");

        biblioteka.addMovie(new Movie(romek, Arrays.asList(helenka, tomek, meryl), 1999, "Ogniem i mieczem", Gatunek.DRAMAT));
        biblioteka.addMovie(new Movie(stasiek, Arrays.asList(szon, tomek,meryl), 1980, "Wielki Błękit", Gatunek.DRAMAT));
        biblioteka.addMovie(new Movie(stasiek, Arrays.asList(helenka, meryl, tomek), 2020, "Gwiezdne Wojny", Gatunek.THRILLER));


        boolean koniec = false;
        Scanner input = new Scanner(System.in);


        while (!koniec) {
            System.out.println("Wybierz komende:");
            System.out.println("1: Filtruj po datach");
            System.out.println("2: Wyswietl losowy film");
            System.out.println("3: Filtruj po aktorze");
            System.out.println("0: Koniec");
            int komenda = Integer.parseInt(input.nextLine());
            switch (komenda) {
                case 1 :
                    System.out.println("Podaj datę od: ");
                    int start = input.nextInt();
                    System.out.println("Podaj date do: ");
                    int end = input.nextInt();
                    biblioteka.showMoviesFromDates(start, end);
                    System.out.println("----------------------");
                    break;
                case 2:
                    biblioteka.showRandomMovie();
                    System.out.println("----------------------");
                    break;
                case 3:
                    System.out.println("Podaj imie aktora: ");
                    String imie = input.nextLine();
                    System.out.println("Podaj nazwizko aktora: ");
                    String nazwisko = input.nextLine();
                    biblioteka.showMoviesWithActor(imie, nazwisko);
                    System.out.println("----------------------");
                    break;
                case 0 :
                    koniec = true;
                    break;
                default: break;
            }
        }

    }
}
