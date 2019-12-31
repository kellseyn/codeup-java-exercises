package Christmas;

import java.util.Scanner;

public class Reindeer {
    protected String name;


    public Reindeer(String name) {
        this.name = name;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add a reindeer please");
        String name = sc.nextLine();
        System.out.printf("You added %s as one of Santa's reindeer!", name);
    }
}
