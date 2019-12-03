import polylec.Password;

import java.util.Scanner;

public class Bob {

    Password password = new Password("pass");

    public static void main(String[] args) {

        Password.checkPass("0pass1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have a question for Bob?");
        String input = scanner.next();
        if (input.endsWith("?")){
            System.out.println("Sure.");
        } else if (input.endsWith("!")){
            System.out.println("Whoa, chill out!");
        } else if (input.equals("")){
            System.out.println("Fine! Be that way!");
        } else{
            System.out.println("Whatever");
        }
    }
}
