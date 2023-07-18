package projectColl;

public class RunnerCinema {
    public static void main(String[] args) {
        Film film1 = new Film(1, "love and love", 2023, 3, "comedy", 5.6);
        Film film11 = new Film(1, "love and love", 2023, 3, "comedy", 5.6);
        Film film2 = new Film(2, "happy", 2023, 2, "drama", 9.3);
        Film film3 = new Film(3, "house", 2009, 3, "comedy", 5.6);
        Film film4 = new Film(4, "stand up", 2010, 6, "horror", 4.3);
        Film film5 = new Film(5, "smeshariki", 2007, 3, "cartoon", 7.6);
        Film film6 = new Film(6, "harry potter", 2001, 4, "adventure", 9.5);

        Cinema cinema = new Cinema();
        cinema.add(film1);
        cinema.add(film11);
        cinema.add(film2);
        cinema.add(film3);
        cinema.add(film4);
        cinema.add(film5);

        cinema.getTop();



    }
}
