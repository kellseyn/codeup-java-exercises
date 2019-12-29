package Christmas;

import java.util.Scanner;

public class Santa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HO HO HO, What would you like for Christmas?");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("")){
            System.out.println("It's ok, you can tell me what you want for Christmas");
        } else{
            System.out.printf("Ahh! so you want a %s for Christmas, I'll put it on the list", input);
        }
    }
}
