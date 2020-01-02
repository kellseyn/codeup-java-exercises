package Christmas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Santa {


    public static Reindeer[] reindeerteam;
    static {
        reindeerteam = new Reindeer[9];

        reindeerteam[0] = new Reindeer("Dasher");
        reindeerteam[1] = new Reindeer("Dancer");
        reindeerteam[2] = new Reindeer("Prancer");
        reindeerteam[3] = new Reindeer("Vixen");
        reindeerteam[4] = new Reindeer("Comet");
        reindeerteam[5] = new Reindeer("Cupid");
        reindeerteam[6] = new Reindeer("Donner");
        reindeerteam[7] = new Reindeer("Blitzen");
        reindeerteam[8] = new Reindeer("Rudolph");

    }

    public static Reindeer[] addReindeer = Arrays.copyOf(reindeerteam, 10);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HO HO HO, What would you like for Christmas?");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("")){
            System.out.println("It's ok, you can tell me what you want for Christmas\n");
        } else{
            System.out.printf("Ahh! so you want a %s for Christmas, I'll put it on the list%n", input);
        }

        for (Integer i = 0; i < reindeerteam.length; i++) {
            System.out.println(reindeerteam[i].name);


        }
        addReindeer[9] = new Reindeer("Olive");

        for (Integer i = 0; i < addReindeer.length; i++) {
            System.out.println(addReindeer[i].name);


        }





//        System.out.println("The team:\n");
//        System.out.println(dasher.name);
//        System.out.println(dancer.name);
//        System.out.println(prancer.name);
//        System.out.println(vixen.name);
//        System.out.println(comet.name);
//        System.out.println(cupid.name);
//        System.out.println(donner.name);
//        System.out.println(blitzen.name);
//        System.out.println(rudolph.name);
    }
}
