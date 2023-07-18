package projectColl;

import java.util.*;

public class Cinema {
    private final Map<Integer, ArrayList<Film>> films = new HashMap<>();

    public void add(Film film) {
        if (!isExist(film)) {
            films.computeIfAbsent(film.getYear(), k -> new ArrayList<>()).add(film);
        }
    }

    public void getByYear(int year) {
        ArrayList<Film> list;
        list = films.get(year);
        for (Film film : list) {
            System.out.println(film);
        }
    }

    public void getByYearMonth(int year, int month) {
        ArrayList<Film> list;
        list = films.get(year);
        for (Film film : list) {
            if (film.getMonth() == month) {
                System.out.println(film);
            }
        }
    }

    public void getByGenre(String genre) {
        for (Map.Entry<Integer, ArrayList<Film>> entry : films.entrySet()) {
            ArrayList<Film> list = entry.getValue();
            for (Film film : list) {
                if (film.getGenre().equals(genre)) {
                    System.out.println(film);
                }
            }

        }
    }

    public void getTop() {
        ArrayList<Film> list = new ArrayList<>();
        for (Map.Entry<Integer, ArrayList<Film>> entry : films.entrySet()) {
            for (Film f : entry.getValue()) {
                list.add(f);
            }
        }
        list.sort(Comparator.comparing(Film::getRating).reversed());
        for (Film film : list) {
            System.out.println(film);
        }
    }

    private boolean isExist(Film film) {
        for (Map.Entry<Integer, ArrayList<Film>> entry : films.entrySet()) {
            ArrayList<Film> list = entry.getValue();
            for (Film f : list) {
                if (f.equals(film)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "films=" + films +
                '}';
    }
}
