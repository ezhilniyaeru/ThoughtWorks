import java.lang.reflect.Array;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPg(Movie[] movieArray) {
        Movie[] tempPGMovieArray = new Movie[movieArray.length];

        int j = 0;
        for (Movie movie : movieArray) {
            if (movie.rating.equals("PG")) {
                tempPGMovieArray[j] = movie;
                j++;
            }
        }
        Movie[] PGMovieArray = new Movie[j];
        System.arraycopy(tempPGMovieArray, 0, PGMovieArray, 0, j);
        return PGMovieArray;
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG-13");
        Movie movie2 = new Movie("Casino Royale", "Eon Productions", "PG");
        Movie[] movieArray = {movie1, movie2};
        Movie[] tempArray = getPg(movieArray);
        for (Movie temp : tempArray) {
            System.out.println(temp.title + " " + temp.studio + " " + temp.rating);
        }
    }
}

