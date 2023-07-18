package projectColl;
import java.util.Objects;

public class Film {
    private int id;
    private String name;
    private int year;
    private int month;
    private String genre;
    private double rating;

    public Film(int id, String name, int year, int month, String genre, double rating) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.month = month;
        this.genre = genre;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return id == film.id && year == film.year && month == film.month && Double.compare(film.rating, rating) == 0 && Objects.equals(name, film.name) && Objects.equals(genre, film.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, year, month, genre, rating);
    }
}
