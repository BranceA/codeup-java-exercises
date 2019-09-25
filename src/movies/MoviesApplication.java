package movies;
import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {

        Movie[] movies = MoviesArray.findAll();
        Input userInput = new Input();
        boolean keepGoing;
        
        do {

            System.out.println("Welcome to generic movie application\nWhat would you like to do?\n1: View all movies\n2: View all dramas\n3: View all musicals\n4: View all scifis\n5: View all horrors\n6: View all comedies\n7: View all animated movies");
            int userSelection = userInput.getInt(1, 7);

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
            }

            System.out.println("Keep Going?");
            keepGoing = userInput.yesNo();
        }while (keepGoing);

    }

}
