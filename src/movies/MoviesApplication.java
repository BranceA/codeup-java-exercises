package movies;
import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {

        Movie[] movies = MoviesArray.findAll();
        Input userInput = new Input();
        boolean keepGoing;

        do {

            System.out.println("Welcome to generic movie application\nWhat would you like to do?\n1: View all movies\n2: View all dramas\n3: View all musicals\n4: View all scifis\n5: View all horrors\n6: View all comedies\n7: View all animated movies\n8: Add new movie");
            int userSelection = userInput.getInt(1, 8);

            if (userSelection == 1) {
                for (Movie movie : movies) {
                    System.out.format("%-35s : %10s\n", movie.getName(), movie.getCategory());
                }
            } else if (userSelection == 2) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equalsIgnoreCase("drama")) {
                        System.out.format("%-35s : %10s\n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (userSelection == 3) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equalsIgnoreCase("musical")) {
                        System.out.format("%-35s : %10s\n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (userSelection == 4) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equalsIgnoreCase("scifi")) {
                        System.out.format("%-35s : %10s\n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (userSelection == 5) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equalsIgnoreCase("horror")) {
                        System.out.format("%-35s : %10s\n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (userSelection == 6) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equalsIgnoreCase("comedy")) {
                        System.out.format("%-35s : %10s\n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (userSelection == 7) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equalsIgnoreCase("animated")) {
                        System.out.format("%-35s : %10s\n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (userSelection == 8) {
                movies = addMovie(movies);
                System.out.println("You have added your movie.");
            }

            System.out.println("Keep Going?");
            keepGoing = userInput.yesNo();
        }while (keepGoing);

    }

    public static Movie[] addMovie(Movie[] oldMovies){
        Input userInput = new Input();
        int newLength = oldMovies.length + 1;
        String newMovieCategory = "";
        Movie[] newMovies = new Movie[newLength];
        System.out.println("Enter the new movie title.");
        String newMovieTitle = userInput.getString();
        System.out.println("Select a category.\n1: drama\n2: musical\n3: scifi\n4: horror\n5: comedy\n6: animated\n");
        int categorySelection = userInput.getInt(1, 6);

        if(categorySelection == 1){
            newMovieCategory = "drama";
        } else if(categorySelection == 2){
            newMovieCategory = "musical";
        } else if(categorySelection == 3){
            newMovieCategory = "scifi";
        } else if(categorySelection == 4){
            newMovieCategory = "horror";
        } else if(categorySelection == 5){
            newMovieCategory = "comedy";
        } else if(categorySelection == 6){
            newMovieCategory = "animated";
        }

        for(int i = 0; i < oldMovies.length; i++){
            newMovies[i] = oldMovies[i];
        }

        Movie newestMovie = new Movie(newMovieTitle, newMovieCategory);

        newMovies[oldMovies.length] = newestMovie;
        return newMovies;

    }

}
