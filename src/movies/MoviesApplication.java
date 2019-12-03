package movies;
import util.Input;

public class MoviesApplication {



    public static void main(String[] args) {
        Input sc = new Input();
        Movie[] movieList = MoviesArray.findAll();
        boolean userUsing = true;

        while (userUsing) {

            System.out.println("What would you like to do?\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category\n");
            System.out.println("Enter your choice:\n");
            int userChoice = sc.getInt();


            switch (userChoice) {
                case 0:
                    userUsing = false;
                    break;
                case 1:
                    for (Movie movie : movieList) {
                        System.out.println(movie.getName());
                    }
                    break;
                case 2:
                    for (Movie movie : movieList) {
                        if (movie.category.equalsIgnoreCase("animated")) {
                            System.out.println("Name: "+movie.getName() + ", Category: " + movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    for (Movie movie : movieList) {
                        if (movie.category.equalsIgnoreCase("drama")) {
                            System.out.println("Name: "+movie.getName() + ", Category: " + movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    for (Movie movie : movieList) {
                        if (movie.category.equalsIgnoreCase("horror")) {
                            System.out.println("Name: "+movie.getName() + ", Category: " + movie.getCategory());
                        }
                    }
                    break;
                case 5:
                    for (Movie movie : movieList) {
                        if (movie.category.equalsIgnoreCase("scifi")) {
                            System.out.println("Name: "+movie.getName() + ", Category: " + movie.getCategory());
                        }
                    }
                    break;
            }
        }


    }

}
