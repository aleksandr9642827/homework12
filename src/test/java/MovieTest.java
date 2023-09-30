import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {

    Movie newMovie1 = new Movie("Человек дождя");
    Movie newMovie2 = new Movie("Этой ночью в Нью-Йорке");
    Movie newMovie3 = new Movie("Властелин Колец: Братство кольца");
    Movie newMovie4 = new Movie("Амели");
    Movie newMovie5 = new Movie("Рики и Морти");
    Movie newMovie6 = new Movie("Интелстеллар");

    @Test
    void allMovies() {
        MovieManager manager = new MovieManager();
        manager.addNewMovie(newMovie1);
        manager.addNewMovie(newMovie2);
        manager.addNewMovie(newMovie3);
        manager.addNewMovie(newMovie4);
        manager.addNewMovie(newMovie5);
        manager.addNewMovie(newMovie6);

        Movie[] expectedMovies = {newMovie1, newMovie2, newMovie3, newMovie4, newMovie5, newMovie6};
        Movie[] actualMovies = manager.findAllMovies();

        Assertions.assertArrayEquals(expectedMovies, actualMovies);
    }

    @Test
    void lastDefoultMovies() {
        MovieManager manager = new MovieManager();
        manager.addNewMovie(newMovie1);
        manager.addNewMovie(newMovie2);
        manager.addNewMovie(newMovie3);
        manager.addNewMovie(newMovie4);
        manager.addNewMovie(newMovie5);
        manager.addNewMovie(newMovie6);

        Movie[] expectedMovies = {newMovie6, newMovie5, newMovie4, newMovie3, newMovie2};
        Movie[] actualMovies = manager.findLastMovies();

        Assertions.assertArrayEquals(expectedMovies, actualMovies);
    }

    @Test
    void last3tMovies() {
        MovieManager manager = new MovieManager(3);
        manager.addNewMovie(newMovie1);
        manager.addNewMovie(newMovie2);
        manager.addNewMovie(newMovie3);
        manager.addNewMovie(newMovie4);
        manager.addNewMovie(newMovie5);
        manager.addNewMovie(newMovie6);

        Movie[] expectedMovies = {newMovie6, newMovie5, newMovie4};
        Movie[] actualMovies = manager.findLastMovies();

        Assertions.assertArrayEquals(expectedMovies, actualMovies);
    }

    @Test
    void lasttMovies() {
        MovieManager manager = new MovieManager();
        manager.addNewMovie(newMovie1);
        manager.addNewMovie(newMovie2);

        Movie[] expectedMovies = {newMovie2, newMovie1};
        Movie[] actualMovies = manager.findLastMovies();

        Assertions.assertArrayEquals(expectedMovies, actualMovies);
    }
}
