public class MovieManager {
    public Movie[] movies;
    private int limit;

    MovieManager() {
        movies = new Movie[0];
        limit = 5;
    }

    MovieManager(int newLimit) {
        movies = new Movie[0];
        limit = newLimit;
    }

    public void addNewMovie(Movie newMovie) {
        Movie[] tmp = new Movie[movies.length + 1];

        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovie;
        movies = tmp;
    }

    public Movie[] findAllMovies() {

        for (Movie item : movies) {
            System.out.println(item.getName());
        }
        System.out.println("____________________________");
        return movies;
    }

    public Movie[] findLastMovies() {
        int lastMoviesCount;
        if (movies.length >= limit) {
            lastMoviesCount = limit;
        } else
            lastMoviesCount = movies.length;

        Movie[] reversed = new Movie[lastMoviesCount];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = movies[movies.length - 1 - i];
        }

        for (Movie item : reversed) {
            System.out.println(item.getName());
        }
        System.out.println("____________________________");

        return reversed;
    }

}
