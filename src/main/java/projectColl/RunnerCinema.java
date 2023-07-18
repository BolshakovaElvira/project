package projectColl;

public class RunnerCinema {
    public static void main(String[] args) {
        Film film1 = new Film(1, "love and love", 2023, 3, "comedy", 5.6);
        Film film2 = new Film(2, "happy", 2023, 2, "drama", 9.3);
        Film film3 = new Film(3, "house", 2009, 3, "comedy", 5.6);
        Film film4 = new Film(4, "stand up", 2010, 6, "horror", 4.3);
        Film film5 = new Film(5, "smeshariki", 2007, 3, "cartoon", 7.6);
        Film film6 = new Film(6, "harry potter", 2001, 4, "adventure", 9.5);
        Film film7 = new Film(7, "drive", 2023, 7, "drama", 8.6);
        Film film8 = new Film(4, "fire", 2016, 3, "horror", 6.3);
        Film film9 = new Film(5, "smeshariki2", 2023, 3, "cartoon", 7.6);
        Film film10 = new Film(6, "adventure time", 2018, 4, "adventure", 5.5);
        Film film11 = new Film(7, "barbie", 2024, 4, "comedy", 6.6);

        Cinema cinema = new Cinema();
        cinema.add(film1);
        cinema.add(film2);
        cinema.add(film3);
        cinema.add(film4);
        cinema.add(film5);
        cinema.add(film6);
        cinema.add(film7);
        cinema.add(film8);
        cinema.add(film9);
        cinema.add(film10);
        cinema.add(film11);

        cinema.getTop();


    }
}
