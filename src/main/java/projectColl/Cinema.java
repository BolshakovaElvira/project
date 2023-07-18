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
        ArrayList<Film> list = films.get(year);
        for (Film film : list) {
            System.out.println(film);
        }
    }

    public void getByYearMonth(int year, int month) {
        ArrayList<Film> list = films.get(year);
        for (Film film : list) {
            if (film.getMonth() == month) {
                System.out.println(film);
            }
        }
    }

    public void getByGenre(String genre) {
        Collection<ArrayList<Film>> list = films.values();
        for (ArrayList<Film> filmArrayList : list) {
            for (Film film : filmArrayList) {
                if (film.getGenre().equals(genre)) {
                    System.out.println(film);
                }
            }
        }
    }

    public void getTop() {
        Collection<ArrayList<Film>> list = films.values();
        ArrayList<Film> sortList = new ArrayList<>();
        for (ArrayList<Film> filmArrayList : list) {
            for (Film film : filmArrayList) {
                sortList.add(film);
            }
        }

        sortList.sort(Comparator.comparing(Film::getRating).reversed());
        
        for (int i = 0; i < 10; i++) {
            System.out.println(sortList.get(i));
        }

    }

    private boolean isExist(Film film) {
        Collection<ArrayList<Film>> list = films.values();
        for (ArrayList<Film> filmArrayList : list) {
            for (Film f : filmArrayList) {
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
