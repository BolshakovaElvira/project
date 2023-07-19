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
        for (Film film : films.get(year)) {
            System.out.println(film);
        }
    }

    public void getByYearMonth(int year, int month) {
        for (Film film : films.get(year)) {
            if (film.getMonth() == month) {
                System.out.println(film);
            }
        }
    }

    public void getByGenre(String genre) {
        for (List<Film> filmList : films.values()) {
            for (Film film : filmList) {
                if (film.getGenre().equals(genre)) {
                    System.out.println(film);
                }
            }
        }
    }

    public void getTop() {
        List<Film> sortList = new ArrayList<>();
        for (List<Film> filmList : films.values()) {
            for (Film film : filmList) {
                sortList.add(film);
            }
        }

        sortList.sort(Comparator.comparing(Film::getRating).reversed());

        for (int i = 0; i < 10; i++) {
            System.out.println(sortList.get(i));
        }

    }

    private boolean isExist(Film film) {
        for (List<Film> filmList : films.values()) {
            for (Film f : filmList) {
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
